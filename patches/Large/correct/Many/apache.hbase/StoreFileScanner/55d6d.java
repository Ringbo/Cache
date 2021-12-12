diff --git a/hbase-server/src/main/java/org/apache/hadoop/hbase/regionserver/StoreFileScanner.java b/hbase-server/src/main/java/org/apache/hadoop/hbase/regionserver/StoreFileScanner.java
index ca7dfd4..ab6b0ef 100644
--- a/hbase-server/src/main/java/org/apache/hadoop/hbase/regionserver/StoreFileScanner.java
+++ b/hbase-server/src/main/java/org/apache/hadoop/hbase/regionserver/StoreFileScanner.java
@@ -129,7 +129,7 @@
     List<StoreFile> sorted_files = new ArrayList<>(files);
     Collections.sort(sorted_files, StoreFile.Comparators.SEQ_ID);
     for (int i = 0; i < sorted_files.size(); i++) {
-      StoreFileReader r = sorted_files.get(i).createReader();
+      StoreFileReader r = sorted_files.get(i).createReader(canUseDrop);
       r.setReplicaStoreFile(isPrimaryReplica);
       StoreFileScanner scanner = r.getStoreFileScanner(cacheBlocks, usePread, isCompaction, readPt,
         i, matcher != null ? !matcher.hasNullColumnInQuery() : false);
