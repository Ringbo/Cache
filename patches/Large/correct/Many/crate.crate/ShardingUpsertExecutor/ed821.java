diff --git a/sql/src/main/java/io/crate/execution/engine/indexing/ShardingUpsertExecutor.java b/sql/src/main/java/io/crate/execution/engine/indexing/ShardingUpsertExecutor.java
index 0e2e2ff..80f10dc 100644
--- a/sql/src/main/java/io/crate/execution/engine/indexing/ShardingUpsertExecutor.java
+++ b/sql/src/main/java/io/crate/execution/engine/indexing/ShardingUpsertExecutor.java
@@ -258,7 +258,7 @@
         Predicate<ShardedRequests<ShardUpsertRequest, ShardUpsertRequest.Item>> shouldPause =
             this::shouldPauseOnPartitionCreation;
         if (batchIterator.involvesIO()) {
-            shouldPause = shouldPause.and(this::shouldPauseOnTargetNodeJobsCounter);
+            shouldPause = shouldPause.or(this::shouldPauseOnTargetNodeJobsCounter);
         }
 
         BatchIteratorBackpressureExecutor<ShardedRequests<ShardUpsertRequest, ShardUpsertRequest.Item>, UpsertResults> executor =
