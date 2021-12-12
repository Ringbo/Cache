diff --git a/modules/elasticsearch/src/main/java/org/elasticsearch/action/get/TransportGetAction.java b/modules/elasticsearch/src/main/java/org/elasticsearch/action/get/TransportGetAction.java
index 010d932..412e570 100644
--- a/modules/elasticsearch/src/main/java/org/elasticsearch/action/get/TransportGetAction.java
+++ b/modules/elasticsearch/src/main/java/org/elasticsearch/action/get/TransportGetAction.java
@@ -104,7 +104,7 @@
 
     @Override protected ShardIterator shards(ClusterState clusterState, GetRequest request) {
         return clusterService.operationRouting()
-                .indexShards(clusterService.state(), request.index(), request.type(), request.id(), request.routing());
+                .getShards(clusterService.state(), request.index(), request.type(), request.id(), request.routing(), request.preference());
     }
 
     @Override protected void doExecute(GetRequest request, ActionListener<GetResponse> listener) {
