diff --git a/modules/core/src/main/java/org/apache/ignite/internal/processors/cache/persistence/GridCacheOffheapManager.java b/modules/core/src/main/java/org/apache/ignite/internal/processors/cache/persistence/GridCacheOffheapManager.java
index 313a763..1a35b24 100644
--- a/modules/core/src/main/java/org/apache/ignite/internal/processors/cache/persistence/GridCacheOffheapManager.java
+++ b/modules/core/src/main/java/org/apache/ignite/internal/processors/cache/persistence/GridCacheOffheapManager.java
@@ -271,7 +271,8 @@
 
                         if (needSnapshot) {
                             pageCnt = this.ctx.pageStore().pages(grpId, store.partId());
-                            io.setCandidatePageCount(partMetaPageAddr, pageCnt);
+
+                            io.setCandidatePageCount(partMetaPageAddr, size == 0 ? 0: pageCnt);
 
                             if (saveMeta) {
                                 saveMeta(ctx);
@@ -531,19 +532,19 @@
     }
 
     /**
-     * @param part
+     * @param part Local partition.
      * @param map Map to add values to.
      * @param metaPageAddr Meta page address
      * @param io Page Meta IO
-     * @param cacheId Cache ID.
-     * @param currAllocatedPageCnt total number of pages allocated for partition <code>[partition, cacheId]</code>
+     * @param grpId Cache Group ID.
+     * @param currAllocatedPageCnt total number of pages allocated for partition <code>[partition, grpId]</code>
      */
     private static boolean addPartition(
             GridDhtLocalPartition part,
             final PartitionAllocationMap map,
             final long metaPageAddr,
             final PageMetaIO io,
-            final int cacheId,
+            final int grpId,
             final int partId,
             final int currAllocatedPageCnt,
             final int partSize
@@ -561,10 +562,10 @@
 
         int lastAllocatedPageCnt = io.getLastAllocatedPageCount(metaPageAddr);
 
-        int curPageCnt = lastAllocatedPageCnt == 0 && partSize == 0 ? 0 : currAllocatedPageCnt;
+        int curPageCnt = partSize == 0 ? 0 : currAllocatedPageCnt;
 
         map.put(
-            new GroupPartitionId(cacheId, partId),
+            new GroupPartitionId(grpId, partId),
             new PagesAllocationRange(lastAllocatedPageCnt, curPageCnt));
 
         return true;
