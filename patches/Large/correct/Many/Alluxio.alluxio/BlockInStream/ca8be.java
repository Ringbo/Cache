diff --git a/core/client/fs/src/main/java/alluxio/client/block/stream/BlockInStream.java b/core/client/fs/src/main/java/alluxio/client/block/stream/BlockInStream.java
index 235eea3..91889a0 100644
--- a/core/client/fs/src/main/java/alluxio/client/block/stream/BlockInStream.java
+++ b/core/client/fs/src/main/java/alluxio/client/block/stream/BlockInStream.java
@@ -89,7 +89,7 @@
         && !NettyUtils.isDomainSocketSupported(address)
         && blockSource == BlockInStreamSource.LOCAL) {
       try {
-        LOG.info("Creating short circuit input stream for block {} @ {}", blockId, address);
+        LOG.debug("Creating short circuit input stream for block {} @ {}", blockId, address);
         return createLocalBlockInStream(context, address, blockId, blockSize, options);
       } catch (NotFoundException e) {
         // Failed to do short circuit read because the block is not available in Alluxio.
@@ -103,7 +103,7 @@
       builder.setOpenUfsBlockOptions(openUfsBlockOptions);
     }
 
-    LOG.info("Creating netty input stream for block {} @ {} from client {}", blockId, address,
+    LOG.debug("Creating netty input stream for block {} @ {} from client {}", blockId, address,
         NetworkAddressUtils.getClientHostName());
     return createNettyBlockInStream(context, address, blockSource, builder.buildPartial(),
         blockSize, options);
