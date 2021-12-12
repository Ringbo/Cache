diff --git a/java/org/apache/catalina/util/ManifestResource.java b/java/org/apache/catalina/util/ManifestResource.java
index 29806db..13c179a 100644
--- a/java/org/apache/catalina/util/ManifestResource.java
+++ b/java/org/apache/catalina/util/ManifestResource.java
@@ -117,7 +117,7 @@
      */
     public boolean isFulfilled() {
         if (requiredExtensions == null) {
-            return false;
+            return true;
         }
         Iterator it = requiredExtensions.iterator();
         while (it.hasNext()) {
