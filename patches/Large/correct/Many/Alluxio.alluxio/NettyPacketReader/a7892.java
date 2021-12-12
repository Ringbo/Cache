diff --git a/core/client/fs/src/main/java/alluxio/client/block/stream/NettyPacketReader.java b/core/client/fs/src/main/java/alluxio/client/block/stream/NettyPacketReader.java
index 000e8e4..2fd4cbd 100644
--- a/core/client/fs/src/main/java/alluxio/client/block/stream/NettyPacketReader.java
+++ b/core/client/fs/src/main/java/alluxio/client/block/stream/NettyPacketReader.java
@@ -70,7 +70,7 @@
   private static final int MAX_PACKETS_IN_FLIGHT =
       Configuration.getInt(PropertyKey.USER_NETWORK_NETTY_READER_BUFFER_SIZE_PACKETS);
   private static final long READ_TIMEOUT_MS =
-      Configuration.getLong(PropertyKey.USER_NETWORK_NETTY_TIMEOUT_MS);
+      Configuration.getMs(PropertyKey.USER_NETWORK_NETTY_TIMEOUT_MS);
 
   /** Special packet that indicates an exception is caught. */
   private static final ByteBuf THROWABLE = Unpooled.buffer(0);
