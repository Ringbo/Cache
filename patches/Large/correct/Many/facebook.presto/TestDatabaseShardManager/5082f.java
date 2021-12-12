diff --git a/presto-raptor/src/test/java/com/facebook/presto/raptor/metadata/TestDatabaseShardManager.java b/presto-raptor/src/test/java/com/facebook/presto/raptor/metadata/TestDatabaseShardManager.java
index 28df321..8d9b0be 100644
--- a/presto-raptor/src/test/java/com/facebook/presto/raptor/metadata/TestDatabaseShardManager.java
+++ b/presto-raptor/src/test/java/com/facebook/presto/raptor/metadata/TestDatabaseShardManager.java
@@ -271,7 +271,7 @@
         shardManager.createTable(tableId, columns, false);
 
         long transactionId = shardManager.beginTransaction();
-        shardManager.commitShards(transactionId, tableId, columns, shardNodes, Optional.empty());
+        shardManager.commitShards(transactionId, tableId, columns, shardNodes, Optional.empty(), 0);
         Set<UUID> actual = shardManager.getExistingShardUuids(tableId, ImmutableSet.of(shard1, shard2, UUID.randomUUID()));
         Set<UUID> expected = ImmutableSet.of(shard1, shard2);
         assertEquals(actual, expected);
