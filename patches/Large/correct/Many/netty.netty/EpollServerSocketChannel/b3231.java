diff --git a/transport-native-epoll/src/main/java/io/netty/channel/epoll/EpollServerSocketChannel.java b/transport-native-epoll/src/main/java/io/netty/channel/epoll/EpollServerSocketChannel.java
index 4a9cebd..390ca3d 100644
--- a/transport-native-epoll/src/main/java/io/netty/channel/epoll/EpollServerSocketChannel.java
+++ b/transport-native-epoll/src/main/java/io/netty/channel/epoll/EpollServerSocketChannel.java
@@ -123,7 +123,7 @@
                 // * The user called Channel.read() or ChannelHandlerContext.read() in channelReadComplete(...) method
                 //
                 // See https://github.com/netty/netty/issues/2254
-                if (config.isAutoRead() && !readPending) {
+                if (!config.isAutoRead() && !readPending) {
                     clearEpollIn();
                 }
             }
