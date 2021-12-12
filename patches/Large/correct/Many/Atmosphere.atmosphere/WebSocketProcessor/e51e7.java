diff --git a/modules/cpr/src/main/java/org/atmosphere/websocket/WebSocketProcessor.java b/modules/cpr/src/main/java/org/atmosphere/websocket/WebSocketProcessor.java
index 6b39359..b9340dc 100644
--- a/modules/cpr/src/main/java/org/atmosphere/websocket/WebSocketProcessor.java
+++ b/modules/cpr/src/main/java/org/atmosphere/websocket/WebSocketProcessor.java
@@ -116,7 +116,7 @@
 
         webSocketProtocol.onOpen(webSocket);
 
-        if (webSocket.resource().getAtmosphereResourceEvent().isSuspended()) {
+        if (!webSocket.resource().getAtmosphereResourceEvent().isSuspended()) {
             webSocketProtocol.onError(webSocket, new WebSocketException("No AtmosphereResource has been suspended. The WebSocket will be closed.", wsr));
         }
     }
