diff --git a/core/src/main/java/org/elasticsearch/gateway/ReplicaShardAllocator.java b/core/src/main/java/org/elasticsearch/gateway/ReplicaShardAllocator.java
index bdab92b..a830aa6 100644
--- a/core/src/main/java/org/elasticsearch/gateway/ReplicaShardAllocator.java
+++ b/core/src/main/java/org/elasticsearch/gateway/ReplicaShardAllocator.java
@@ -196,7 +196,7 @@
         // calculate delay and store it in UnassignedInfo to be used by RoutingService
         long delay = shard.unassignedInfo().updateDelay(timeNowNanos, settings, indexMetaData.getSettings());
         if (delay > 0) {
-            logger.debug("[{}][{}]: delaying allocation of [{}] for [{}]", shard.index(), shard.id(), shard, TimeValue.timeValueMillis(delay));
+            logger.debug("[{}][{}]: delaying allocation of [{}] for [{}]", shard.index(), shard.id(), shard, TimeValue.timeValueNanos(delay));
             /**
              * mark it as changed, since we want to kick a publishing to schedule future allocation,
              * see {@link org.elasticsearch.cluster.routing.RoutingService#clusterChanged(ClusterChangedEvent)}).
