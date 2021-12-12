diff --git a/hbase-server/src/main/java/org/apache/hadoop/hbase/regionserver/MemStoreFlusher.java b/hbase-server/src/main/java/org/apache/hadoop/hbase/regionserver/MemStoreFlusher.java
index 644e89b..40c5046 100644
--- a/hbase-server/src/main/java/org/apache/hadoop/hbase/regionserver/MemStoreFlusher.java
+++ b/hbase-server/src/main/java/org/apache/hadoop/hbase/regionserver/MemStoreFlusher.java
@@ -197,12 +197,12 @@
            ServerRegionReplicaUtil.isRegionReplicaStoreFileRefreshEnabled(conf) &&
            (bestRegionReplica.getMemstoreSize()
                > secondaryMultiplier * regionToFlush.getMemstoreSize()))) {
-        LOG.info("Refreshing storefiles of region " + regionToFlush +
+        LOG.info("Refreshing storefiles of region " + bestRegionReplica +
           " due to global heap pressure. memstore size=" + StringUtils.humanReadableInt(
             server.getRegionServerAccounting().getGlobalMemstoreSize()));
         flushedOne = refreshStoreFilesAndReclaimMemory(bestRegionReplica);
         if (!flushedOne) {
-          LOG.info("Excluding secondary region " + regionToFlush +
+          LOG.info("Excluding secondary region " + bestRegionReplica +
               " - trying to find a different region to refresh files.");
           excludedRegions.add(bestRegionReplica);
         }
