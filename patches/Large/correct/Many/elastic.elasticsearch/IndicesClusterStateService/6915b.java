diff --git a/modules/elasticsearch/src/main/java/org/elasticsearch/indices/cluster/IndicesClusterStateService.java b/modules/elasticsearch/src/main/java/org/elasticsearch/indices/cluster/IndicesClusterStateService.java
index 206e309..19b51e6 100644
--- a/modules/elasticsearch/src/main/java/org/elasticsearch/indices/cluster/IndicesClusterStateService.java
+++ b/modules/elasticsearch/src/main/java/org/elasticsearch/indices/cluster/IndicesClusterStateService.java
@@ -243,7 +243,7 @@
 
             if (!indexService.hasShard(shardId) && shardRouting.started()) {
                 // the master thinks we are started, but we don't have this shard at all, mark it as failed
-                logger.warn("[{}][{}] master [{}] marked shard as started, but shard have not been created, mark shard as failed");
+                logger.warn("[{}][{}] master [{}] marked shard as started, but shard have not been created, mark shard as failed", shardRouting.index(), shardId, nodes.masterNode());
                 shardStateAction.shardFailed(shardRouting, "master " + nodes.masterNode() + " marked shard as started, but shard have not been created, mark shard as failed");
                 continue;
             }
