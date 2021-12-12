diff --git a/modules/cpr/src/main/java/org/atmosphere/websocket/DefaultWebSocketProcessor.java b/modules/cpr/src/main/java/org/atmosphere/websocket/DefaultWebSocketProcessor.java
index 5c660c9..5560f22 100644
--- a/modules/cpr/src/main/java/org/atmosphere/websocket/DefaultWebSocketProcessor.java
+++ b/modules/cpr/src/main/java/org/atmosphere/websocket/DefaultWebSocketProcessor.java
@@ -363,7 +363,7 @@
         WebSocketHandler webSocketHandler = webSocket.webSocketHandler();
         try {
             if (webSocketHandler == null) {
-                if (!WebSocketProtocolStream.class.isAssignableFrom(webSocketProtocol.getClass())) {
+                if (WebSocketProtocolStream.class.isAssignableFrom(webSocketProtocol.getClass())) {
                     List<AtmosphereRequest> list = WebSocketProtocolStream.class.cast(webSocketProtocol).onBinaryStream(webSocket, stream);
                     dispatch(webSocket, list);
                 } else {
