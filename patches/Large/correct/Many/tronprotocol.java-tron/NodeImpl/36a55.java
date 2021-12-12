diff --git a/src/main/java/org/tron/core/net/node/NodeImpl.java b/src/main/java/org/tron/core/net/node/NodeImpl.java
index 0485bb6..4c6fed7 100755
--- a/src/main/java/org/tron/core/net/node/NodeImpl.java
+++ b/src/main/java/org/tron/core/net/node/NodeImpl.java
@@ -558,7 +558,7 @@
       //processSyncBlock(blkMsg.getBlockCapsule());
       if (!peer.isBusy()) {
         if (peer.getUnfetchSyncNum() > 0
-            && peer.getSyncBlockToFetch().size() < NodeConstant.SYNC_FETCH_BATCH_NUM) {
+            && peer.getSyncBlockToFetch().size() <= NodeConstant.SYNC_FETCH_BATCH_NUM) {
           syncNextBatchChainIds(peer);
         } else {
           //TODO: here should be a loop do this thing
