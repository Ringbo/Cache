diff --git a/modules/cpr/src/main/java/org/atmosphere/container/version/Jetty9WebSocket.java b/modules/cpr/src/main/java/org/atmosphere/container/version/Jetty9WebSocket.java
index 1b9c05f..cd9c216 100644
--- a/modules/cpr/src/main/java/org/atmosphere/container/version/Jetty9WebSocket.java
+++ b/modules/cpr/src/main/java/org/atmosphere/container/version/Jetty9WebSocket.java
@@ -38,13 +38,13 @@
 
     @Override
     public WebSocket write(String s) throws IOException {
-        if (isOpen()) webSocketConnection.getRemote().sendString(s);
+        if (isOpen()) webSocketConnection.getRemote().sendStringByFuture(s);
         return this;
     }
 
     @Override
     public WebSocket write(byte[] b, int offset, int length) throws IOException {
-        if (isOpen()) webSocketConnection.getRemote().sendBytes(ByteBuffer.wrap(b, offset, length));
+        if (isOpen()) webSocketConnection.getRemote().sendBytesByFuture(ByteBuffer.wrap(b, offset, length));
         return this;
     }
 
