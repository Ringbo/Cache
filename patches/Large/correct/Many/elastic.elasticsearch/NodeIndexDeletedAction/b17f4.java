diff --git a/core/src/main/java/org/elasticsearch/cluster/action/index/NodeIndexDeletedAction.java b/core/src/main/java/org/elasticsearch/cluster/action/index/NodeIndexDeletedAction.java
index 012cc66..c2c1b46 100644
--- a/core/src/main/java/org/elasticsearch/cluster/action/index/NodeIndexDeletedAction.java
+++ b/core/src/main/java/org/elasticsearch/cluster/action/index/NodeIndexDeletedAction.java
@@ -81,7 +81,7 @@
         transportService.sendRequest(clusterState.nodes().masterNode(),
                 INDEX_DELETED_ACTION_NAME, new NodeIndexDeletedMessage(index, nodeId), EmptyTransportResponseHandler.INSTANCE_SAME);
         if (nodes.localNode().isDataNode() == false) {
-            logger.trace("[{}] not acking store deletion (not a data node)");
+            logger.trace("[{}] not acking store deletion (not a data node)", index);
             return;
         }
         threadPool.generic().execute(new AbstractRunnable() {
