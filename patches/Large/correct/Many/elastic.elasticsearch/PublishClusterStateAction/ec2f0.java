diff --git a/modules/elasticsearch/src/main/java/org/elasticsearch/discovery/zen/publish/PublishClusterStateAction.java b/modules/elasticsearch/src/main/java/org/elasticsearch/discovery/zen/publish/PublishClusterStateAction.java
index 482932b..5a4cae4 100644
--- a/modules/elasticsearch/src/main/java/org/elasticsearch/discovery/zen/publish/PublishClusterStateAction.java
+++ b/modules/elasticsearch/src/main/java/org/elasticsearch/discovery/zen/publish/PublishClusterStateAction.java
@@ -67,7 +67,11 @@
                 // no need to send to our self
                 continue;
             }
-            transportService.sendRequest(node, PublishClusterStateRequestHandler.ACTION, new PublishClusterStateRequest(clusterState), new VoidTransportResponseHandler(false) {
+            transportService.sendRequest(node, PublishClusterStateRequestHandler.ACTION,
+                    new PublishClusterStateRequest(clusterState),
+                    TransportRequestOptions.options().withHighType(),
+
+                    new VoidTransportResponseHandler(false) {
                 @Override public void handleException(TransportException exp) {
                     logger.debug("failed to send cluster state to [{}], should be detected as failed soon...", exp, node);
                 }
