diff --git a/src/main/java/org/elasticsearch/indices/flush/SyncedFlushService.java b/src/main/java/org/elasticsearch/indices/flush/SyncedFlushService.java
index 537392a..6c6e38e 100644
--- a/src/main/java/org/elasticsearch/indices/flush/SyncedFlushService.java
+++ b/src/main/java/org/elasticsearch/indices/flush/SyncedFlushService.java
@@ -381,7 +381,7 @@
 
                 @Override
                 public void handleException(TransportException exp) {
-                    logger.trace("{} error while performing pre synced flush on [{}], skipping", shardId, exp, shard);
+                    logger.trace("{} error while performing pre synced flush on [{}], skipping", exp, shardId, shard);
                     if (countDown.countDown()) {
                         listener.onResponse(commitIds);
                     }
