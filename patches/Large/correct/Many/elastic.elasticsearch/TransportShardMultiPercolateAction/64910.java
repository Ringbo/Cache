diff --git a/src/main/java/org/elasticsearch/action/percolate/TransportShardMultiPercolateAction.java b/src/main/java/org/elasticsearch/action/percolate/TransportShardMultiPercolateAction.java
index f25bc56..b738fd9 100644
--- a/src/main/java/org/elasticsearch/action/percolate/TransportShardMultiPercolateAction.java
+++ b/src/main/java/org/elasticsearch/action/percolate/TransportShardMultiPercolateAction.java
@@ -104,7 +104,7 @@
             try {
                 responseItem.response = percolatorService.percolate(item.request);
             } catch (Throwable e) {
-                logger.trace("[{}][{}] failed to multi percolate", e, request.index(), request.shardId());
+                logger.debug("[{}][{}] failed to multi percolate", e, request.index(), request.shardId());
                 if (TransportActions.isShardNotAvailableException(e)) {
                     throw new ElasticSearchException("", e);
                 } else {
