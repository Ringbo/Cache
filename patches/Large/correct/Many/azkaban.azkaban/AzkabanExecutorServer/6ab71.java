diff --git a/azkaban-execserver/src/main/java/azkaban/execapp/AzkabanExecutorServer.java b/azkaban-execserver/src/main/java/azkaban/execapp/AzkabanExecutorServer.java
index 39004b0..6e012ab 100644
--- a/azkaban-execserver/src/main/java/azkaban/execapp/AzkabanExecutorServer.java
+++ b/azkaban-execserver/src/main/java/azkaban/execapp/AzkabanExecutorServer.java
@@ -307,7 +307,7 @@
    * @throws IOException
    */
   public static void main(String[] args) throws Exception {
-    logger.error("Starting Jetty Azkaban Executor...");
+    logger.info("Starting Jetty Azkaban Executor...");
     Props azkabanSettings = AzkabanServer.loadProps(args);
 
     if (azkabanSettings == null) {
