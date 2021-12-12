diff --git a/transport/src/main/java/io/netty/channel/DefaultChannelHandlerContext.java b/transport/src/main/java/io/netty/channel/DefaultChannelHandlerContext.java
index a371edf..d9d3cc7 100755
--- a/transport/src/main/java/io/netty/channel/DefaultChannelHandlerContext.java
+++ b/transport/src/main/java/io/netty/channel/DefaultChannelHandlerContext.java
@@ -1315,7 +1315,7 @@
         }
 
         ChannelOperationHandler handler = (ChannelOperationHandler) handler();
-        if (handler instanceof ChannelInboundHandler) {
+        if (handler instanceof ChannelOutboundHandler) {
             flushOutboundBridge();
         }
 
