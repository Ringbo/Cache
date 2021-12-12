diff --git a/servers/src/main/java/tachyon/worker/block/BlockMetadataManagerView.java b/servers/src/main/java/tachyon/worker/block/BlockMetadataManagerView.java
index a767905..3e3cee7 100644
--- a/servers/src/main/java/tachyon/worker/block/BlockMetadataManagerView.java
+++ b/servers/src/main/java/tachyon/worker/block/BlockMetadataManagerView.java
@@ -55,7 +55,7 @@
   public BlockMetadataManagerView(BlockMetadataManager manager, Set<Integer> pinnedInodes,
       Set<Long> lockedBlocks) throws IOException {
     mMetadataManager = Preconditions.checkNotNull(manager);
-    mPinnedInodes.addAll(Preconditions.checkNotNull(mPinnedInodes));
+    mPinnedInodes.addAll(Preconditions.checkNotNull(pinnedInodes));
     mLockedBlocks.addAll(Preconditions.checkNotNull(lockedBlocks));
 
     // iteratively create all StorageTierViews and StorageDirViews
