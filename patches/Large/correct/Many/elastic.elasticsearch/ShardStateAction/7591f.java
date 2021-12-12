diff --git a/core/src/main/java/org/elasticsearch/cluster/action/shard/ShardStateAction.java b/core/src/main/java/org/elasticsearch/cluster/action/shard/ShardStateAction.java
index 7a74248..95d6d09 100644
--- a/core/src/main/java/org/elasticsearch/cluster/action/shard/ShardStateAction.java
+++ b/core/src/main/java/org/elasticsearch/cluster/action/shard/ShardStateAction.java
@@ -137,7 +137,7 @@
                         try {
                             channel.sendResponse(t);
                         } catch (Throwable channelThrowable) {
-                            logger.warn("{} failed to send failure [{}] while failing shard [{}]", channelThrowable, t, request.shardRouting.shardId(), request.shardRouting);
+                            logger.warn("{} failed to send failure [{}] while failing shard [{}]", channelThrowable, request.shardRouting.shardId(), t, request.shardRouting);
                         }
                     }
 
