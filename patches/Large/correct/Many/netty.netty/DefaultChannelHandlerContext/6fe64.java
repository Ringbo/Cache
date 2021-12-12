diff --git a/transport/src/main/java/io/netty/channel/DefaultChannelHandlerContext.java b/transport/src/main/java/io/netty/channel/DefaultChannelHandlerContext.java
index d63d4df..0e07fed 100755
--- a/transport/src/main/java/io/netty/channel/DefaultChannelHandlerContext.java
+++ b/transport/src/main/java/io/netty/channel/DefaultChannelHandlerContext.java
@@ -1295,7 +1295,7 @@
     private void invokeFlush0(ChannelPromise promise) {
         Channel channel = channel();
         if (!channel.isRegistered() && !channel.isActive()) {
-            promise.setFailure(new ClosedChannelException());
+            promise.tryFailure(new ClosedChannelException());
             return;
         }
 
