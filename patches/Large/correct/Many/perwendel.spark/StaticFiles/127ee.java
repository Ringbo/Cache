diff --git a/src/main/java/spark/staticfiles/StaticFiles.java b/src/main/java/spark/staticfiles/StaticFiles.java
index 0bfd364..aca4ee2 100644
--- a/src/main/java/spark/staticfiles/StaticFiles.java
+++ b/src/main/java/spark/staticfiles/StaticFiles.java
@@ -83,7 +83,7 @@
      *
      * @param folder the location
      */
-    public static void configureStaticResources(String folder) {
+    public synchronized static void configureStaticResources(String folder) {
         Assert.notNull(folder, "'folder' must not be null");
 
         if (!staticResourcesSet) {
@@ -112,7 +112,7 @@
      *
      * @param folder the location
      */
-    public static void configureExternalStaticResources(String folder) {
+    public synchronized static void configureExternalStaticResources(String folder) {
         Assert.notNull(folder, "'folder' must not be null");
 
         if (!externalStaticResourcesSet) {
