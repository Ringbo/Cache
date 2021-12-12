diff --git a/modules/cpr/src/main/java/org/atmosphere/websocket/DefaultWebSocketProcessor.java b/modules/cpr/src/main/java/org/atmosphere/websocket/DefaultWebSocketProcessor.java
index 53192f3..8731442 100644
--- a/modules/cpr/src/main/java/org/atmosphere/websocket/DefaultWebSocketProcessor.java
+++ b/modules/cpr/src/main/java/org/atmosphere/websocket/DefaultWebSocketProcessor.java
@@ -589,7 +589,7 @@
     @Override
     public void close(final WebSocket webSocket, int closeCode) {
 
-        if (webSocket.isOpen()) {
+        if (!webSocket.isOpen()) {
             logger.trace("Already closed {}", webSocket);
             return;
         }
