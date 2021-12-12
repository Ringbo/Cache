diff --git a/servers/src/main/java/tachyon/worker/block/evictor/GreedyEvictor.java b/servers/src/main/java/tachyon/worker/block/evictor/GreedyEvictor.java
index 4328f80..3694f09 100644
--- a/servers/src/main/java/tachyon/worker/block/evictor/GreedyEvictor.java
+++ b/servers/src/main/java/tachyon/worker/block/evictor/GreedyEvictor.java
@@ -52,12 +52,12 @@
       throws IOException {
     // 1. Select a StorageDir that has enough capacity for required bytes.
     StorageDir selectedDir = null;
-    if (location.belongTo(BlockStoreLocation.anyTier())) {
+    if (location.equals(BlockStoreLocation.anyTier())) {
       selectedDir = selectDirToEvictBlocksFromAnyTier(availableBytes);
     } else {
       int tierAlias = location.tierAlias();
       StorageTier tier = mMetaManager.getTier(tierAlias);
-      if (location.belongTo(BlockStoreLocation.anyDirInTier(tierAlias))) {
+      if (location.equals(BlockStoreLocation.anyDirInTier(tierAlias))) {
         selectedDir = selectDirToEvictBlocksFromTier(tier, availableBytes);
       } else {
         int dirIndex = location.dir();
