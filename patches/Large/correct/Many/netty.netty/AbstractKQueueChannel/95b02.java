diff --git a/transport-native-kqueue/src/main/java/io/netty/channel/kqueue/AbstractKQueueChannel.java b/transport-native-kqueue/src/main/java/io/netty/channel/kqueue/AbstractKQueueChannel.java
index 020f651..fcab02e 100644
--- a/transport-native-kqueue/src/main/java/io/netty/channel/kqueue/AbstractKQueueChannel.java
+++ b/transport-native-kqueue/src/main/java/io/netty/channel/kqueue/AbstractKQueueChannel.java
@@ -248,7 +248,7 @@
     protected final ByteBuf newDirectBuffer(Object holder, ByteBuf buf) {
         final int readableBytes = buf.readableBytes();
         if (readableBytes == 0) {
-            ReferenceCountUtil.safeRelease(holder);
+            ReferenceCountUtil.release(holder);
             return Unpooled.EMPTY_BUFFER;
         }
 
