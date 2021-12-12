diff --git a/transport/src/main/java/io/netty/channel/DefaultChannelHandlerContext.java b/transport/src/main/java/io/netty/channel/DefaultChannelHandlerContext.java
index 0e07fed..d63d4df 100755
--- a/transport/src/main/java/io/netty/channel/DefaultChannelHandlerContext.java
+++ b/transport/src/main/java/io/netty/channel/DefaultChannelHandlerContext.java
@@ -1295,7 +1295,7 @@
     private void invokeFlush0(ChannelPromise promise) {
         Channel channel = channel();
         if (!channel.isRegistered() && !channel.isActive()) {
-            promise.tryFailure(new ClosedChannelException());
+            promise.setFailure(new ClosedChannelException());
             return;
         }
 
