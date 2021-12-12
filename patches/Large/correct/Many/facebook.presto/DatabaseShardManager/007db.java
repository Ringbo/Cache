diff --git a/presto-raptor/src/main/java/com/facebook/presto/raptor/metadata/DatabaseShardManager.java b/presto-raptor/src/main/java/com/facebook/presto/raptor/metadata/DatabaseShardManager.java
index 3b6d743..3f6a816 100644
--- a/presto-raptor/src/main/java/com/facebook/presto/raptor/metadata/DatabaseShardManager.java
+++ b/presto-raptor/src/main/java/com/facebook/presto/raptor/metadata/DatabaseShardManager.java
@@ -77,7 +77,7 @@
                 long partitionId = dao.insertPartition(tableId, partition);
 
                 for (PartitionKey partitionKey : partitionKeys) {
-                    dao.insertPartitionKey(tableId, partition, partitionKey.getName(), partitionKey.getType().toString(), partitionKey.getValue());
+                    dao.insertPartitionKey(tableId, partition, partitionKey.getName(), partitionKey.getType().getName(), partitionKey.getValue());
                 }
 
                 for (Map.Entry<UUID, String> entry : shards.entrySet()) {
