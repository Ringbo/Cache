diff --git a/core/src/test/java/org/elasticsearch/cluster/routing/RoutingTableTests.java b/core/src/test/java/org/elasticsearch/cluster/routing/RoutingTableTests.java
index a76ad46..055adba 100644
--- a/core/src/test/java/org/elasticsearch/cluster/routing/RoutingTableTests.java
+++ b/core/src/test/java/org/elasticsearch/cluster/routing/RoutingTableTests.java
@@ -352,7 +352,7 @@
                 Set<String> insyncAids = shardTable.activeShards().stream().map(
                     shr -> shr.allocationId().getId()).collect(Collectors.toSet());
                 final ShardRouting primaryShard = shardTable.primaryShard();
-                if (primaryShard.initializing() && shardRouting.recoverySource().getType() == RecoverySource.Type.EXISTING_STORE) {
+                if (primaryShard.initializing() && primaryShard.recoverySource().getType() == RecoverySource.Type.EXISTING_STORE) {
                     // simulate a primary was initialized based on aid
                     insyncAids.add(primaryShard.allocationId().getId());
                 }
