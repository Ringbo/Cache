diff --git a/transport-native-epoll/src/main/java/io/netty/channel/epoll/AbstractEpollChannel.java b/transport-native-epoll/src/main/java/io/netty/channel/epoll/AbstractEpollChannel.java
index d23f8a2..eade60d 100644
--- a/transport-native-epoll/src/main/java/io/netty/channel/epoll/AbstractEpollChannel.java
+++ b/transport-native-epoll/src/main/java/io/netty/channel/epoll/AbstractEpollChannel.java
@@ -302,7 +302,7 @@
     protected final ByteBuf newDirectBuffer(Object holder, ByteBuf buf) {
         final int readableBytes = buf.readableBytes();
         if (readableBytes == 0) {
-            ReferenceCountUtil.safeRelease(holder);
+            ReferenceCountUtil.release(holder);
             return Unpooled.EMPTY_BUFFER;
         }
 
