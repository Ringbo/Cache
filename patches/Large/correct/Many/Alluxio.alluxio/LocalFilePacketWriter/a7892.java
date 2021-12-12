diff --git a/core/client/fs/src/main/java/alluxio/client/block/stream/LocalFilePacketWriter.java b/core/client/fs/src/main/java/alluxio/client/block/stream/LocalFilePacketWriter.java
index b637196..8e012f2 100644
--- a/core/client/fs/src/main/java/alluxio/client/block/stream/LocalFilePacketWriter.java
+++ b/core/client/fs/src/main/java/alluxio/client/block/stream/LocalFilePacketWriter.java
@@ -44,7 +44,7 @@
   private static final long FILE_BUFFER_BYTES =
       Configuration.getBytes(PropertyKey.USER_FILE_BUFFER_BYTES);
   private static final long WRITE_TIMEOUT_MS =
-      Configuration.getLong(PropertyKey.USER_NETWORK_NETTY_TIMEOUT_MS);
+      Configuration.getMs(PropertyKey.USER_NETWORK_NETTY_TIMEOUT_MS);
 
   private final FileSystemContext mContext;
   private final WorkerNetAddress mAddress;
