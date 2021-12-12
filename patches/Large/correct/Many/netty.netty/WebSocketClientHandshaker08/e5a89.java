diff --git a/codec-http/src/main/java/io/netty/handler/codec/http/websocketx/WebSocketClientHandshaker08.java b/codec-http/src/main/java/io/netty/handler/codec/http/websocketx/WebSocketClientHandshaker08.java
index f5ea2bb..1e52893 100644
--- a/codec-http/src/main/java/io/netty/handler/codec/http/websocketx/WebSocketClientHandshaker08.java
+++ b/codec-http/src/main/java/io/netty/handler/codec/http/websocketx/WebSocketClientHandshaker08.java
@@ -201,13 +201,13 @@
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
