diff --git a/transport-native-epoll/src/main/java/io/netty/channel/epoll/EpollSocketChannel.java b/transport-native-epoll/src/main/java/io/netty/channel/epoll/EpollSocketChannel.java
index edb1287..494d71c 100644
--- a/transport-native-epoll/src/main/java/io/netty/channel/epoll/EpollSocketChannel.java
+++ b/transport-native-epoll/src/main/java/io/netty/channel/epoll/EpollSocketChannel.java
@@ -648,7 +648,7 @@
                 // * The user called Channel.read() or ChannelHandlerContext.read() in channelReadComplete(...) method
                 //
                 // See https://github.com/netty/netty/issues/2254
-                if (config.isAutoRead() && !readPending) {
+                if (!config.isAutoRead() && !readPending) {
                     clearEpollIn();
                 }
             }
