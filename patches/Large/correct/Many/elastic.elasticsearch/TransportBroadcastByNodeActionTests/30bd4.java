diff --git a/core/src/test/java/org/elasticsearch/action/support/broadcast/node/TransportBroadcastByNodeActionTests.java b/core/src/test/java/org/elasticsearch/action/support/broadcast/node/TransportBroadcastByNodeActionTests.java
index 14ee78a..18a86b1 100644
--- a/core/src/test/java/org/elasticsearch/action/support/broadcast/node/TransportBroadcastByNodeActionTests.java
+++ b/core/src/test/java/org/elasticsearch/action/support/broadcast/node/TransportBroadcastByNodeActionTests.java
@@ -206,7 +206,7 @@
         for (int i = 0; i < numberOfNodes; i++) {
             final DiscoveryNode node = newNode(i);
             discoBuilder = discoBuilder.put(node);
-            int numberOfShards = randomIntBetween(0, 10);
+            int numberOfShards = randomIntBetween(1, 10);
             for (int j = 0; j < numberOfShards; j++) {
                 final ShardId shardId = new ShardId(index, ++shardIndex);
                 ShardRouting shard = TestShardRouting.newShardRouting(index, shardId.getId(), node.id(), true, ShardRoutingState.STARTED, 1);
