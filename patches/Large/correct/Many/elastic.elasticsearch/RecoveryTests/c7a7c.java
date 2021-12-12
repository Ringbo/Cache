diff --git a/core/src/test/java/org/elasticsearch/indices/recovery/RecoveryTests.java b/core/src/test/java/org/elasticsearch/indices/recovery/RecoveryTests.java
index 4c592d1..48f0c2f 100644
--- a/core/src/test/java/org/elasticsearch/indices/recovery/RecoveryTests.java
+++ b/core/src/test/java/org/elasticsearch/indices/recovery/RecoveryTests.java
@@ -90,15 +90,15 @@
             shards.startAll();
             // create out of order delete and index op on replica
             final IndexShard orgReplica = shards.getReplicas().get(0);
-            orgReplica.applyDeleteOperationOnReplica(1, 1, 2, "type", "id", VersionType.EXTERNAL, u -> {});
+            orgReplica.applyDeleteOperationOnReplica(1, 2, "type", "id", VersionType.EXTERNAL, u -> {});
             orgReplica.getTranslog().rollGeneration(); // isolate the delete in it's own generation
-            orgReplica.applyIndexOperationOnReplica(0, 1, 1, VersionType.EXTERNAL, IndexRequest.UNSET_AUTO_GENERATED_TIMESTAMP, false,
+            orgReplica.applyIndexOperationOnReplica(0, 1, VersionType.EXTERNAL, IndexRequest.UNSET_AUTO_GENERATED_TIMESTAMP, false,
                 SourceToParse.source(orgReplica.shardId().getIndexName(), "type", "id", new BytesArray("{}"), XContentType.JSON),
                 u -> {});
 
             // index a second item into the second generation, skipping seq# 2. Local checkpoint is now 1, which will make this generation
             // stick around
-            orgReplica.applyIndexOperationOnReplica(3, 1, 1, VersionType.EXTERNAL, IndexRequest.UNSET_AUTO_GENERATED_TIMESTAMP, false,
+            orgReplica.applyIndexOperationOnReplica(3, 1, VersionType.EXTERNAL, IndexRequest.UNSET_AUTO_GENERATED_TIMESTAMP, false,
                 SourceToParse.source(orgReplica.shardId().getIndexName(), "type", "id2", new BytesArray("{}"), XContentType.JSON), u -> {});
 
             final int translogOps;
