diff --git a/transport/src/main/java/io/netty/channel/nio/AbstractNioByteChannel.java b/transport/src/main/java/io/netty/channel/nio/AbstractNioByteChannel.java
index 8815a23..4a5e1df 100644
--- a/transport/src/main/java/io/netty/channel/nio/AbstractNioByteChannel.java
+++ b/transport/src/main/java/io/netty/channel/nio/AbstractNioByteChannel.java
@@ -152,7 +152,7 @@
                 // * The user called Channel.read() or ChannelHandlerContext.read() in channelReadComplete(...) method
                 //
                 // See https://github.com/netty/netty/issues/2254
-                if (config.isAutoRead() && !readPending) {
+                if (!config.isAutoRead() && !readPending) {
                     removeReadOp();
                 }
             }
