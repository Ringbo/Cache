diff --git a/core/client/fs/src/main/java/alluxio/client/block/stream/PacketWriter.java b/core/client/fs/src/main/java/alluxio/client/block/stream/PacketWriter.java
index 77f2090..de681b4 100644
--- a/core/client/fs/src/main/java/alluxio/client/block/stream/PacketWriter.java
+++ b/core/client/fs/src/main/java/alluxio/client/block/stream/PacketWriter.java
@@ -58,10 +58,10 @@
       if (CommonUtils.isLocalHost(address) && Configuration
           .getBoolean(PropertyKey.USER_SHORT_CIRCUIT_ENABLED) && !NettyUtils
           .isDomainSocketSupported(address)) {
-        LOG.info("Creating short circuit output stream for block {} @ {}", blockId, address);
+        LOG.debug("Creating short circuit output stream for block {} @ {}", blockId, address);
         return LocalFilePacketWriter.create(context, address, blockId, options);
       } else {
-        LOG.info("Creating netty output stream for block {} @ {} from client {}", blockId, address,
+        LOG.debug("Creating netty output stream for block {} @ {} from client {}", blockId, address,
             NetworkAddressUtils.getClientHostName());
         return NettyPacketWriter
             .create(context, address, blockId, blockSize, Protocol.RequestType.ALLUXIO_BLOCK,
