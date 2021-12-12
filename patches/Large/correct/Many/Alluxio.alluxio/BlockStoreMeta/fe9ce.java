diff --git a/core/server/worker/src/main/java/alluxio/worker/block/BlockStoreMeta.java b/core/server/worker/src/main/java/alluxio/worker/block/BlockStoreMeta.java
index 2841d1f..29b947d 100644
--- a/core/server/worker/src/main/java/alluxio/worker/block/BlockStoreMeta.java
+++ b/core/server/worker/src/main/java/alluxio/worker/block/BlockStoreMeta.java
@@ -77,7 +77,7 @@
    * @return A mapping from storage tier alias to blocks
    */
   public Map<String, List<Long>> getBlockList() {
-    Preconditions.checkNotNull(mBlockIdsOnTiers);
+    Preconditions.checkNotNull(mBlockIdsOnTiers, "mBlockIdsOnTiers");
 
     return mBlockIdsOnTiers;
   }
@@ -128,7 +128,7 @@
    * @return the number of blocks
    */
   public int getNumberOfBlocks() {
-    Preconditions.checkNotNull(mBlockIdsOnTiers);
+    Preconditions.checkNotNull(mBlockIdsOnTiers, "mBlockIdsOnTiers");
 
     int numberOfBlocks = 0;
     for (List<Long> blockIds : mBlockIdsOnTiers.values()) {
@@ -168,7 +168,7 @@
    * @param manager a block metadata manager handle
    */
   private BlockStoreMeta(BlockMetadataManager manager, boolean shouldIncludeBlockIds) {
-    Preconditions.checkNotNull(manager);
+    Preconditions.checkNotNull(manager, "manager");
     for (StorageTier tier : manager.getTiers()) {
       Long capacityBytes = mCapacityBytesOnTiers.get(tier.getTierAlias());
       Long usedBytes = mUsedBytesOnTiers.get(tier.getTierAlias());
