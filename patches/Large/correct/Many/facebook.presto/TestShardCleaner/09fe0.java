diff --git a/presto-raptor/src/test/java/com/facebook/presto/raptor/metadata/TestShardCleaner.java b/presto-raptor/src/test/java/com/facebook/presto/raptor/metadata/TestShardCleaner.java
index 20e6849..608b3e6 100644
--- a/presto-raptor/src/test/java/com/facebook/presto/raptor/metadata/TestShardCleaner.java
+++ b/presto-raptor/src/test/java/com/facebook/presto/raptor/metadata/TestShardCleaner.java
@@ -207,7 +207,7 @@
         Set<UUID> shards = ImmutableSet.of(shard1, shard2, shard3);
 
         for (UUID shard : shards) {
-            shardDao.insertShard(shard, tableId, null, 0, 0, 0);
+            shardDao.insertShard(shard, tableId, null, 0, 0, 0, 0);
             createShardFile(shard);
             assertTrue(shardFileExists(shard));
         }
