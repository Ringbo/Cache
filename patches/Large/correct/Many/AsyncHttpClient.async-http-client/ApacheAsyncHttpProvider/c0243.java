diff --git a/src/main/java/com/ning/http/client/providers/apache/ApacheAsyncHttpProvider.java b/src/main/java/com/ning/http/client/providers/apache/ApacheAsyncHttpProvider.java
index 407f738..d6c3d02 100644
--- a/src/main/java/com/ning/http/client/providers/apache/ApacheAsyncHttpProvider.java
+++ b/src/main/java/com/ning/http/client/providers/apache/ApacheAsyncHttpProvider.java
@@ -167,7 +167,7 @@
         }
 
         int requestTimeout = requestTimeout(config, request.getPerRequestConfig());
-        if (config.getIdleConnectionTimeoutInMs() > 0) {
+        if (config.getIdleConnectionTimeoutInMs() > 0 && requestTimeout != -1 && requestTimeout < config.getIdleConnectionTimeoutInMs()) {
             idleConnectionTimeoutThread = new IdleConnectionTimeoutThread();
             idleConnectionTimeoutThread.setConnectionTimeout(config.getIdleConnectionTimeoutInMs());
             idleConnectionTimeoutThread.addConnectionManager(connectionManager);
