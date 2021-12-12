diff --git a/presto-hive/src/main/java/com/facebook/presto/hive/metastore/thrift/ThriftHiveMetastoreClient.java b/presto-hive/src/main/java/com/facebook/presto/hive/metastore/thrift/ThriftHiveMetastoreClient.java
index fedae78..9f3813d 100644
--- a/presto-hive/src/main/java/com/facebook/presto/hive/metastore/thrift/ThriftHiveMetastoreClient.java
+++ b/presto-hive/src/main/java/com/facebook/presto/hive/metastore/thrift/ThriftHiveMetastoreClient.java
@@ -147,10 +147,10 @@
     }
 
     @Override
-    public Map<String, List<ColumnStatisticsObj>> getPartitionColumnStatistics(String databaseName, String tableName, List<String> columnNames, List<String> partitionValues)
+    public Map<String, List<ColumnStatisticsObj>> getPartitionColumnStatistics(String databaseName, String tableName, List<String> partitionNames, List<String> columnNames)
             throws TException
     {
-        PartitionsStatsRequest partitionsStatsRequest = new PartitionsStatsRequest(databaseName, tableName, columnNames, partitionValues);
+        PartitionsStatsRequest partitionsStatsRequest = new PartitionsStatsRequest(databaseName, tableName, columnNames, partitionNames);
         return client.get_partitions_statistics_req(partitionsStatsRequest).getPartStats();
     }
 
