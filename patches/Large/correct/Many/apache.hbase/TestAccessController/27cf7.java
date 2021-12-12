diff --git a/hbase-server/src/test/java/org/apache/hadoop/hbase/security/access/TestAccessController.java b/hbase-server/src/test/java/org/apache/hadoop/hbase/security/access/TestAccessController.java
index 9a45116..11aa5db 100644
--- a/hbase-server/src/test/java/org/apache/hadoop/hbase/security/access/TestAccessController.java
+++ b/hbase-server/src/test/java/org/apache/hadoop/hbase/security/access/TestAccessController.java
@@ -232,7 +232,7 @@
     htd.addFamily(hcd);
     htd.setOwner(USER_OWNER);
     admin.createTable(htd, new byte[][] { Bytes.toBytes("s") });
-    TEST_UTIL.waitTableEnabled(TEST_TABLE.getTableName());
+    TEST_UTIL.waitUntilAllRegionsAssigned(TEST_TABLE.getTableName());
 
     HRegion region = TEST_UTIL.getHBaseCluster().getRegions(TEST_TABLE.getTableName()).get(0);
     RegionCoprocessorHost rcpHost = region.getCoprocessorHost();
@@ -930,7 +930,7 @@
       setPermission(loadPath, FsPermission.valueOf("-rwxrwxrwx"));
 
       try (HTable table = (HTable)TEST_UTIL.getConnection().getTable(tableName)) {
-        TEST_UTIL.waitTableEnabled(tableName);
+        TEST_UTIL.waitUntilAllRegionsAssigned(tableName);
         LoadIncrementalHFiles loader = new LoadIncrementalHFiles(conf);
         loader.doBulkLoad(loadPath, table);
       }
