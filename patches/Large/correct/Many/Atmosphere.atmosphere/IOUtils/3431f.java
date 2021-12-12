diff --git a/modules/cpr/src/main/java/org/atmosphere/util/IOUtils.java b/modules/cpr/src/main/java/org/atmosphere/util/IOUtils.java
index 04fa89c..24b41b8 100644
--- a/modules/cpr/src/main/java/org/atmosphere/util/IOUtils.java
+++ b/modules/cpr/src/main/java/org/atmosphere/util/IOUtils.java
@@ -365,7 +365,7 @@
         } catch (Throwable t) {
             try {
                 return Class.forName(className);
-            } catch (Throwable t2) {
+            } catch (Exception t2) {
                 if (thisClass != null) {
                     return thisClass.getClassLoader().loadClass(className);
                 }
