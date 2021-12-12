diff --git a/src/main/java/org/elasticsearch/snapshots/RestoreService.java b/src/main/java/org/elasticsearch/snapshots/RestoreService.java
index 51dc725..870d69c 100644
--- a/src/main/java/org/elasticsearch/snapshots/RestoreService.java
+++ b/src/main/java/org/elasticsearch/snapshots/RestoreService.java
@@ -374,7 +374,7 @@
         clusterService.submitStateUpdateTask("update snapshot state", new ProcessedClusterStateUpdateTask() {
 
             private RestoreInfo restoreInfo = null;
-            private HashMap<ShardId, ShardRestoreStatus> shards = null;
+            private Map<ShardId, ShardRestoreStatus> shards = null;
 
             @Override
             public ClusterState execute(ClusterState currentState) {
@@ -389,7 +389,7 @@
                         if (entry.snapshotId().equals(request.snapshotId())) {
                             assert !found;
                             found = true;
-                            HashMap<ShardId, ShardRestoreStatus> shards = newHashMap(entry.shards());
+                            Map<ShardId, ShardRestoreStatus> shards = newHashMap(entry.shards());
                             logger.trace("[{}] Updating shard [{}] with status [{}]", request.snapshotId(), request.shardId(), request.status().state());
                             shards.put(request.shardId(), request.status());
                             if (!completed(shards)) {
@@ -423,7 +423,7 @@
                 if (restoreInfo != null) {
                     RoutingTable routingTable = newState.getRoutingTable();
                     final List<ShardId> waitForStarted = newArrayList();
-                    for (HashMap.Entry<ShardId, ShardRestoreStatus> shard : shards.entrySet()) {
+                    for (Map.Entry<ShardId, ShardRestoreStatus> shard : shards.entrySet()) {
                         if (shard.getValue().state() == RestoreMetaData.State.SUCCESS ) {
                             ShardId shardId = shard.getKey();
                             ShardRouting shardRouting = findPrimaryShard(routingTable, shardId);
