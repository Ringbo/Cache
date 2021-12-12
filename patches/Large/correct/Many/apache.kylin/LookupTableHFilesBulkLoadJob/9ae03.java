diff --git a/storage-hbase/src/main/java/org/apache/kylin/storage/hbase/lookup/LookupTableHFilesBulkLoadJob.java b/storage-hbase/src/main/java/org/apache/kylin/storage/hbase/lookup/LookupTableHFilesBulkLoadJob.java
index 5598ed9..7e734db 100644
--- a/storage-hbase/src/main/java/org/apache/kylin/storage/hbase/lookup/LookupTableHFilesBulkLoadJob.java
+++ b/storage-hbase/src/main/java/org/apache/kylin/storage/hbase/lookup/LookupTableHFilesBulkLoadJob.java
@@ -61,7 +61,7 @@
 
         ExtTableSnapshotInfoManager extTableSnapshotInfoManager = ExtTableSnapshotInfoManager.getInstance(kylinConfig);
         ExtTableSnapshotInfo snapshot = extTableSnapshotInfoManager.getSnapshot(tableName, snapshotID);
-        long srcTableRowCnt = Long.valueOf(job.findExtraInfoBackward(BatchConstants.LOOKUP_EXT_SNAPSHOT_SRC_RECORD_CNT_PFX + tableName, "-1"));
+        long srcTableRowCnt = Long.parseLong(job.findExtraInfoBackward(BatchConstants.LOOKUP_EXT_SNAPSHOT_SRC_RECORD_CNT_PFX + tableName, "-1"));
         logger.info("update table:{} snapshot row count:{}", tableName, srcTableRowCnt);
         snapshot.setRowCnt(srcTableRowCnt);
         snapshot.setLastBuildTime(System.currentTimeMillis());
