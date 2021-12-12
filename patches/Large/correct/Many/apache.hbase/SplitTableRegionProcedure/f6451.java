diff --git a/hbase-server/src/main/java/org/apache/hadoop/hbase/master/assignment/SplitTableRegionProcedure.java b/hbase-server/src/main/java/org/apache/hadoop/hbase/master/assignment/SplitTableRegionProcedure.java
index ff7e60f..219b67b 100644
--- a/hbase-server/src/main/java/org/apache/hadoop/hbase/master/assignment/SplitTableRegionProcedure.java
+++ b/hbase-server/src/main/java/org/apache/hadoop/hbase/master/assignment/SplitTableRegionProcedure.java
@@ -536,13 +536,13 @@
     final TableDescriptor htd = env.getMasterServices().getTableDescriptors().get(getTableName());
     for (Map.Entry<String, Collection<StoreFileInfo>>e: files.entrySet()) {
       byte [] familyName = Bytes.toBytes(e.getKey());
-      final HColumnDescriptor hcd = htd.getFamily(familyName);
+      final ColumnFamilyDescriptor hcd = htd.getColumnFamily(familyName);
       final Collection<StoreFileInfo> storeFiles = e.getValue();
       if (storeFiles != null && storeFiles.size() > 0) {
         final CacheConfig cacheConf = new CacheConfig(conf, hcd);
         for (StoreFileInfo storeFileInfo: storeFiles) {
           StoreFileSplitter sfs =
-              new StoreFileSplitter(regionFs, family.getBytes(), new HStoreFile(mfs.getFileSystem(),
+              new StoreFileSplitter(regionFs, familyName, new HStoreFile(mfs.getFileSystem(),
                   storeFileInfo, conf, cacheConf, hcd.getBloomFilterType(), true));
           futures.add(threadPool.submit(sfs));
         }
