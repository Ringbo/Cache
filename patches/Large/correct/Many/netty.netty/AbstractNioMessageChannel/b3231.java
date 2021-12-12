diff --git a/transport/src/main/java/io/netty/channel/nio/AbstractNioMessageChannel.java b/transport/src/main/java/io/netty/channel/nio/AbstractNioMessageChannel.java
index d96200d..47581cc 100644
--- a/transport/src/main/java/io/netty/channel/nio/AbstractNioMessageChannel.java
+++ b/transport/src/main/java/io/netty/channel/nio/AbstractNioMessageChannel.java
@@ -112,7 +112,7 @@
                 // * The user called Channel.read() or ChannelHandlerContext.read() in channelReadComplete(...) method
                 //
                 // See https://github.com/netty/netty/issues/2254
-                if (config.isAutoRead() && !readPending) {
+                if (!config.isAutoRead() && !readPending) {
                     removeReadOp();
                 }
             }
