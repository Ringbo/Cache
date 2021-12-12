diff --git a/core/src/test/java/org/elasticsearch/index/shard/IndexShardTests.java b/core/src/test/java/org/elasticsearch/index/shard/IndexShardTests.java
index c8e9872..924dd3c 100644
--- a/core/src/test/java/org/elasticsearch/index/shard/IndexShardTests.java
+++ b/core/src/test/java/org/elasticsearch/index/shard/IndexShardTests.java
@@ -1382,14 +1382,14 @@
     public void testRecoverFromStoreWithOutOfOrderDelete() throws IOException {
         final IndexShard shard = newStartedShard(false);
         final Consumer<Mapping> mappingConsumer = getMappingUpdater(shard, "test");
-        shard.applyDeleteOperationOnReplica(1, 1, 2, "test", "id", VersionType.EXTERNAL, mappingConsumer);
+        shard.applyDeleteOperationOnReplica(1, 2, "test", "id", VersionType.EXTERNAL, mappingConsumer);
         shard.getEngine().rollTranslogGeneration(); // isolate the delete in it's own generation
-        shard.applyIndexOperationOnReplica(0, 1, 1, VersionType.EXTERNAL, IndexRequest.UNSET_AUTO_GENERATED_TIMESTAMP, false,
+        shard.applyIndexOperationOnReplica(0, 1, VersionType.EXTERNAL, IndexRequest.UNSET_AUTO_GENERATED_TIMESTAMP, false,
             SourceToParse.source(shard.shardId().getIndexName(), "test", "id", new BytesArray("{}"), XContentType.JSON), mappingConsumer);
 
         // index a second item into the second generation, skipping seq# 2. Local checkpoint is now 1, which will make this generation stick
         // around
-        shard.applyIndexOperationOnReplica(3, 1, 1, VersionType.EXTERNAL, IndexRequest.UNSET_AUTO_GENERATED_TIMESTAMP, false,
+        shard.applyIndexOperationOnReplica(3, 1, VersionType.EXTERNAL, IndexRequest.UNSET_AUTO_GENERATED_TIMESTAMP, false,
             SourceToParse.source(shard.shardId().getIndexName(), "test", "id2", new BytesArray("{}"), XContentType.JSON), mappingConsumer);
 
         final int translogOps;
