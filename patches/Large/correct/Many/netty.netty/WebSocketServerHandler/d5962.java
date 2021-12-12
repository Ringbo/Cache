diff --git a/example/src/main/java/io/netty/example/http/websocketx/server/WebSocketServerHandler.java b/example/src/main/java/io/netty/example/http/websocketx/server/WebSocketServerHandler.java
index 14e0360..7712a71 100644
--- a/example/src/main/java/io/netty/example/http/websocketx/server/WebSocketServerHandler.java
+++ b/example/src/main/java/io/netty/example/http/websocketx/server/WebSocketServerHandler.java
@@ -94,7 +94,7 @@
 
         // Handshake
         WebSocketServerHandshakerFactory wsFactory = new WebSocketServerHandshakerFactory(
-                getWebSocketLocation(req), null, false);
+                getWebSocketLocation(req), null, true);
         handshaker = wsFactory.newHandshaker(req);
         if (handshaker == null) {
             WebSocketServerHandshakerFactory.sendUnsupportedVersionResponse(ctx.channel());
