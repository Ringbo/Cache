diff --git a/domain/src/main/java/org/jboss/as/deployment/module/VFSResourceLoader.java b/domain/src/main/java/org/jboss/as/deployment/module/VFSResourceLoader.java
index e67c5a5..651bc89 100644
--- a/domain/src/main/java/org/jboss/as/deployment/module/VFSResourceLoader.java
+++ b/domain/src/main/java/org/jboss/as/deployment/module/VFSResourceLoader.java
@@ -156,7 +156,7 @@
             if (!file.exists()) {
                 return null;
             }
-            return new VFSEntryResource(file, root.toURL());
+            return new VFSEntryResource(file, file.toURL());
         } catch (MalformedURLException e) {
             // must be invalid...?  (todo: check this out)
             return null;
