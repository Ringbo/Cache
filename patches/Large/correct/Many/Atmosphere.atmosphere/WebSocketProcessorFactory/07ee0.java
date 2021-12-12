diff --git a/modules/cpr/src/main/java/org/atmosphere/cpr/WebSocketProcessorFactory.java b/modules/cpr/src/main/java/org/atmosphere/cpr/WebSocketProcessorFactory.java
index 946eab5..e21ed61 100644
--- a/modules/cpr/src/main/java/org/atmosphere/cpr/WebSocketProcessorFactory.java
+++ b/modules/cpr/src/main/java/org/atmosphere/cpr/WebSocketProcessorFactory.java
@@ -22,7 +22,7 @@
 
     public WebSocketProcessor newWebSocketProcessor(WebSocket webSocket) {
         WebSocketProcessor wp = null;
-        if (webSocketProcessorName.equalsIgnoreCase(WebSocketProcessor.class.getName())) {
+        if (!webSocketProcessorName.equalsIgnoreCase(WebSocketProcessor.class.getName())) {
             try {
                 wp = (WebSocketProcessor) Thread.currentThread().getContextClassLoader()
                         .loadClass(webSocketProcessorName).newInstance();
