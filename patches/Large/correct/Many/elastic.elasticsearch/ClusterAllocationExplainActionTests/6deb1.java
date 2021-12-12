diff --git a/core/src/test/java/org/elasticsearch/action/admin/cluster/allocation/ClusterAllocationExplainActionTests.java b/core/src/test/java/org/elasticsearch/action/admin/cluster/allocation/ClusterAllocationExplainActionTests.java
index 0f8f71a..f9785df 100644
--- a/core/src/test/java/org/elasticsearch/action/admin/cluster/allocation/ClusterAllocationExplainActionTests.java
+++ b/core/src/test/java/org/elasticsearch/action/admin/cluster/allocation/ClusterAllocationExplainActionTests.java
@@ -108,7 +108,7 @@
         final ClusterState allStartedClusterState = ClusterStateCreationUtils.state("idx", randomBoolean(),
             ShardRoutingState.STARTED, ShardRoutingState.STARTED);
         final ClusterAllocationExplainRequest anyUnassignedShardsRequest = new ClusterAllocationExplainRequest();
-        expectThrows(IllegalStateException.class, () ->
+        expectThrows(IllegalArgumentException.class, () ->
             findShardToExplain(anyUnassignedShardsRequest, routingAllocation(allStartedClusterState)));
     }
 
@@ -161,7 +161,7 @@
             }
         }
         final ClusterAllocationExplainRequest failingRequest = new ClusterAllocationExplainRequest("idx", 0, primary, explainNode);
-        expectThrows(IllegalStateException.class, () -> findShardToExplain(failingRequest, allocation));
+        expectThrows(IllegalArgumentException.class, () -> findShardToExplain(failingRequest, allocation));
     }
 
     private static RoutingAllocation routingAllocation(ClusterState clusterState) {
