diff --git a/servers/src/main/java/tachyon/worker/block/meta/BlockMetaBase.java b/servers/src/main/java/tachyon/worker/block/meta/BlockMetaBase.java
index 241dc50..01205cf 100644
--- a/servers/src/main/java/tachyon/worker/block/meta/BlockMetaBase.java
+++ b/servers/src/main/java/tachyon/worker/block/meta/BlockMetaBase.java
@@ -40,7 +40,7 @@
    */
   public BlockStoreLocation getBlockLocation() {
     StorageTier tier = mDir.getParentTier();
-    return new BlockStoreLocation(tier.getTierAlias(), mDir.getDirId());
+    return new BlockStoreLocation(tier.getTierAlias(), mDir.getDirIndex());
   }
 
   public StorageDir getParentDir() {
