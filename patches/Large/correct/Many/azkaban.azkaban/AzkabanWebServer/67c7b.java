diff --git a/azkaban-webserver/src/main/java/azkaban/webapp/AzkabanWebServer.java b/azkaban-webserver/src/main/java/azkaban/webapp/AzkabanWebServer.java
index 89dea03..c425913 100644
--- a/azkaban-webserver/src/main/java/azkaban/webapp/AzkabanWebServer.java
+++ b/azkaban-webserver/src/main/java/azkaban/webapp/AzkabanWebServer.java
@@ -1065,7 +1065,7 @@
       if (pluginClass == null) {
         logger.error("Viewer class is not set.");
       } else {
-        logger.error("Plugin class " + pluginClass);
+        logger.info("Plugin class " + pluginClass);
       }
 
       URLClassLoader urlClassLoader = null;
