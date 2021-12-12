diff --git a/core/src/test/java/org/elasticsearch/action/support/replication/TransportReplicationActionTests.java b/core/src/test/java/org/elasticsearch/action/support/replication/TransportReplicationActionTests.java
index df7d4c1..ce93433 100644
--- a/core/src/test/java/org/elasticsearch/action/support/replication/TransportReplicationActionTests.java
+++ b/core/src/test/java/org/elasticsearch/action/support/replication/TransportReplicationActionTests.java
@@ -221,7 +221,7 @@
      */
     public void testNoRerouteOnStaleClusterState() throws InterruptedException, ExecutionException {
         final String index = "test";
-        final ShardId shardId = new ShardId(index, 0);
+        final ShardId shardId = new ShardId(index, "_na_", 0);
         ClusterState state = state(index, true, ShardRoutingState.RELOCATING);
         String relocationTargetNode = state.getRoutingTable().shardRoutingTable(shardId).primaryShard().relocatingNodeId();
         state = ClusterState.builder(state).nodes(DiscoveryNodes.builder(state.nodes()).localNodeId(relocationTargetNode)).build();
@@ -230,13 +230,13 @@
 
         Request request = new Request(shardId).timeout("1ms").routedBasedOnClusterVersion(clusterService.state().version() + 1);
         PlainActionFuture<Response> listener = new PlainActionFuture<>();
-        TransportReplicationAction.ReroutePhase reroutePhase = action.new ReroutePhase(request, listener);
+        TransportReplicationAction.ReroutePhase reroutePhase = action.new ReroutePhase(null, request, listener);
         reroutePhase.run();
         assertListenerThrows("cluster state too old didn't cause a timeout", listener, UnavailableShardsException.class);
 
         request = new Request(shardId).routedBasedOnClusterVersion(clusterService.state().version() + 1);
         listener = new PlainActionFuture<>();
-        reroutePhase = action.new ReroutePhase(request, listener);
+        reroutePhase = action.new ReroutePhase(null, request, listener);
         reroutePhase.run();
         assertFalse("cluster state too old didn't cause a retry", listener.isDone());
 
