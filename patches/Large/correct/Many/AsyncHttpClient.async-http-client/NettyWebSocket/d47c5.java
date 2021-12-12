diff --git a/client/src/main/java/org/asynchttpclient/netty/ws/NettyWebSocket.java b/client/src/main/java/org/asynchttpclient/netty/ws/NettyWebSocket.java
index 1b189ac..531eaad 100755
--- a/client/src/main/java/org/asynchttpclient/netty/ws/NettyWebSocket.java
+++ b/client/src/main/java/org/asynchttpclient/netty/ws/NettyWebSocket.java
@@ -99,7 +99,7 @@
 
   @Override
   public Future<Void> sendBinaryFrame(ByteBuf payload, boolean finalFragment, int rsv) {
-    return channel.writeAndFlush(new BinaryWebSocketFrame(payload));
+    return channel.writeAndFlush(new BinaryWebSocketFrame(finalFragment, rsv, payload));
   }
 
   @Override
