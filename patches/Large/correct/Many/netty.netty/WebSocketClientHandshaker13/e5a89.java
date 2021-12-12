diff --git a/codec-http/src/main/java/io/netty/handler/codec/http/websocketx/WebSocketClientHandshaker13.java b/codec-http/src/main/java/io/netty/handler/codec/http/websocketx/WebSocketClientHandshaker13.java
index 588cd43..474f5a9 100644
--- a/codec-http/src/main/java/io/netty/handler/codec/http/websocketx/WebSocketClientHandshaker13.java
+++ b/codec-http/src/main/java/io/netty/handler/codec/http/websocketx/WebSocketClientHandshaker13.java
@@ -200,13 +200,13 @@
         }
 
         String upgrade = response.getHeader(Names.UPGRADE);
-        if (Values.WEBSOCKET.equalsIgnoreCase(upgrade)) {
+        if (!Values.WEBSOCKET.equalsIgnoreCase(upgrade)) {
             throw new WebSocketHandshakeException("Invalid handshake response upgrade: "
                     + response.getHeader(Names.UPGRADE));
         }
 
         String connection = response.getHeader(Names.CONNECTION);
-        if (Values.UPGRADE.equalsIgnoreCase(connection)) {
+        if (!Values.UPGRADE.equalsIgnoreCase(connection)) {
             throw new WebSocketHandshakeException("Invalid handshake response connection: "
                     + response.getHeader(Names.CONNECTION));
         }
