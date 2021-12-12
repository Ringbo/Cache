diff --git a/codec-http/src/main/java/io/netty/handler/codec/http/websocketx/WebSocketClientHandshaker00.java b/codec-http/src/main/java/io/netty/handler/codec/http/websocketx/WebSocketClientHandshaker00.java
index f3f5f02..fadf84f 100644
--- a/codec-http/src/main/java/io/netty/handler/codec/http/websocketx/WebSocketClientHandshaker00.java
+++ b/codec-http/src/main/java/io/netty/handler/codec/http/websocketx/WebSocketClientHandshaker00.java
@@ -228,15 +228,15 @@
         }
 
         String upgrade = response.getHeader(Names.UPGRADE);
-        if (Values.WEBSOCKET.equalsIgnoreCase(upgrade)) {
+        if (!Values.WEBSOCKET.equalsIgnoreCase(upgrade)) {
             throw new WebSocketHandshakeException("Invalid handshake response upgrade: "
-                    + response.getHeader(Names.UPGRADE));
+                    + upgrade);
         }
 
         String connection = response.getHeader(Names.CONNECTION);
-        if (Values.UPGRADE.equalsIgnoreCase(connection)) {
+        if (!Values.UPGRADE.equalsIgnoreCase(connection)) {
             throw new WebSocketHandshakeException("Invalid handshake response connection: "
-                    + response.getHeader(Names.CONNECTION));
+                    + connection);
         }
 
         byte[] challenge = response.getContent().array();
