diff --git a/core/client/fs/src/main/java/alluxio/client/block/stream/LocalFilePacketReader.java b/core/client/fs/src/main/java/alluxio/client/block/stream/LocalFilePacketReader.java
index 5d9a07a..520f443 100644
--- a/core/client/fs/src/main/java/alluxio/client/block/stream/LocalFilePacketReader.java
+++ b/core/client/fs/src/main/java/alluxio/client/block/stream/LocalFilePacketReader.java
@@ -93,7 +93,7 @@
    */
   public static class Factory implements PacketReader.Factory {
     private static final long READ_TIMEOUT_MS =
-        Configuration.getLong(PropertyKey.USER_NETWORK_NETTY_TIMEOUT_MS);
+        Configuration.getMs(PropertyKey.USER_NETWORK_NETTY_TIMEOUT_MS);
 
     private final FileSystemContext mContext;
     private final WorkerNetAddress mAddress;
