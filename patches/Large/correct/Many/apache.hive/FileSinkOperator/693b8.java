diff --git a/ql/src/java/org/apache/hadoop/hive/ql/exec/FileSinkOperator.java b/ql/src/java/org/apache/hadoop/hive/ql/exec/FileSinkOperator.java
index 530b364..37c3a96 100644
--- a/ql/src/java/org/apache/hadoop/hive/ql/exec/FileSinkOperator.java
+++ b/ql/src/java/org/apache/hadoop/hive/ql/exec/FileSinkOperator.java
@@ -960,7 +960,7 @@
     fsp2.configureDynPartPath(dirName, !conf.isMmTable() && isUnionDp ? unionPath : null);
     Utilities.LOG14535.info("creating new paths " + System.identityHashCode(fsp2) + " for "
         + dirName + ", childSpec " + unionPath + ": tmpPath " + fsp2.getTmpPath()
-        + ", task path " + fsp2.getTaskOutputTempPath(), new Exception());
+        + ", task path " + fsp2.getTaskOutputTempPath());
     if(!conf.getDpSortState().equals(DPSortState.PARTITION_BUCKET_SORTED)) {
       createBucketFiles(fsp2);
       valToPaths.put(dirName, fsp2);
