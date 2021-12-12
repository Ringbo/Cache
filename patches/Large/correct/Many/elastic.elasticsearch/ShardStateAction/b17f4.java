diff --git a/core/src/main/java/org/elasticsearch/cluster/action/shard/ShardStateAction.java b/core/src/main/java/org/elasticsearch/cluster/action/shard/ShardStateAction.java
index c7f3901..626533f 100644
--- a/core/src/main/java/org/elasticsearch/cluster/action/shard/ShardStateAction.java
+++ b/core/src/main/java/org/elasticsearch/cluster/action/shard/ShardStateAction.java
@@ -151,7 +151,7 @@
             @Override
             public void onNewClusterState(ClusterState state) {
                 if (logger.isTraceEnabled()) {
-                    logger.trace("new cluster state [{}] after waiting for master election to fail shard [{}]", shardRoutingEntry.getShardRouting().shardId(), state.prettyPrint(), shardRoutingEntry);
+                    logger.trace("new cluster state [{}] after waiting for master election to fail shard [{}]", state.prettyPrint(), shardRoutingEntry);
                 }
                 sendShardAction(actionName, observer, shardRoutingEntry, listener);
             }
