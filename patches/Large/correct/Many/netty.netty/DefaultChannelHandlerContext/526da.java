diff --git a/transport/src/main/java/io/netty/channel/DefaultChannelHandlerContext.java b/transport/src/main/java/io/netty/channel/DefaultChannelHandlerContext.java
index 3287e31..7d67ce7 100755
--- a/transport/src/main/java/io/netty/channel/DefaultChannelHandlerContext.java
+++ b/transport/src/main/java/io/netty/channel/DefaultChannelHandlerContext.java
@@ -835,7 +835,7 @@
     }
 
     private void invokeExceptionCaught0(Throwable cause) {
-        ChannelStateHandler handler = (ChannelStateHandler) handler();
+        ChannelHandler handler = handler();
         try {
             handler.exceptionCaught(this, cause);
         } catch (Throwable t) {
