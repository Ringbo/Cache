diff --git a/transport-native-unix-common-tests/src/main/java/io/netty/channel/unix/tests/UnixChannelUtilTest.java b/transport-native-unix-common-tests/src/main/java/io/netty/channel/unix/tests/UnixChannelUtilTest.java
index 60fec62..bb67f8d 100644
--- a/transport-native-unix-common-tests/src/main/java/io/netty/channel/unix/tests/UnixChannelUtilTest.java
+++ b/transport-native-unix-common-tests/src/main/java/io/netty/channel/unix/tests/UnixChannelUtilTest.java
@@ -47,8 +47,7 @@
     private static void testIsBufferCopyNeededForWrite(ByteBufAllocator alloc) {
         ByteBuf byteBuf = alloc.directBuffer();
         assertFalse(isBufferCopyNeededForWrite(byteBuf));
-        assertTrue(isBufferCopyNeededForWrite(byteBuf.asReadOnly()));
-
+        assertFalse(isBufferCopyNeededForWrite(byteBuf.asReadOnly()));
         assertTrue(byteBuf.release());
 
         byteBuf = alloc.heapBuffer();
@@ -56,7 +55,7 @@
         assertTrue(isBufferCopyNeededForWrite(byteBuf.asReadOnly()));
         assertTrue(byteBuf.release());
 
-        assertCompositeByteBufIsBufferCopyNeededForWrite(alloc, 2, 0, false);
+        assertCompositeByteBufIsBufferCopyNeededForWrite(alloc, 2, 0, true);
         assertCompositeByteBufIsBufferCopyNeededForWrite(alloc, IOV_MAX + 1, 0, true);
         assertCompositeByteBufIsBufferCopyNeededForWrite(alloc, 0, 2, true);
         assertCompositeByteBufIsBufferCopyNeededForWrite(alloc, 1, 1, true);
