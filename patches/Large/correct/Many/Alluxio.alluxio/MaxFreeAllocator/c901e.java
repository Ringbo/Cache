diff --git a/core/server/worker/src/main/java/alluxio/worker/block/allocator/MaxFreeAllocator.java b/core/server/worker/src/main/java/alluxio/worker/block/allocator/MaxFreeAllocator.java
index 3dfa290..56ce9ab 100644
--- a/core/server/worker/src/main/java/alluxio/worker/block/allocator/MaxFreeAllocator.java
+++ b/core/server/worker/src/main/java/alluxio/worker/block/allocator/MaxFreeAllocator.java
@@ -57,7 +57,7 @@
    */
   private StorageDirView allocateBlock(long sessionId, long blockSize,
       BlockStoreLocation location) {
-    Preconditions.checkNotNull(location);
+    Preconditions.checkNotNull(location, "location");
     StorageDirView candidateDirView = null;
 
     if (location.equals(BlockStoreLocation.anyTier())) {
