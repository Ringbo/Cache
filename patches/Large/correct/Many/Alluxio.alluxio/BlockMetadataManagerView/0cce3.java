diff --git a/servers/src/main/java/tachyon/worker/block/BlockMetadataManagerView.java b/servers/src/main/java/tachyon/worker/block/BlockMetadataManagerView.java
index 6f16c1f..30ab6e1 100644
--- a/servers/src/main/java/tachyon/worker/block/BlockMetadataManagerView.java
+++ b/servers/src/main/java/tachyon/worker/block/BlockMetadataManagerView.java
@@ -95,7 +95,7 @@
    */
   public boolean isBlockLocked(long blockId) {
     int index = BlockLockManager.blockHashIndex(blockId);
-    if (index <= mInUseLocks.length()) {
+    if (index < mInUseLocks.length()) {
       return mInUseLocks.get(index);
     } else {
       return false;
