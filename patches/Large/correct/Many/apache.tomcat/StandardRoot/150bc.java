diff --git a/java/org/apache/catalina/webresources/StandardRoot.java b/java/org/apache/catalina/webresources/StandardRoot.java
index 1a124c7..1fe3308 100644
--- a/java/org/apache/catalina/webresources/StandardRoot.java
+++ b/java/org/apache/catalina/webresources/StandardRoot.java
@@ -462,7 +462,8 @@
             main = new JarResourceSet(this, f.getAbsolutePath(), "/", "/");
         } else {
             throw new IllegalArgumentException(
-                    sm.getString("standardRoot.startInvalidMain"));
+                    sm.getString("standardRoot.startInvalidMain",
+                            f.getAbsolutePath()));
         }
 
         mainResources.clear();
