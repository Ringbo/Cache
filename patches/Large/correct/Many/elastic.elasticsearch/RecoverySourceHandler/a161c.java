diff --git a/src/main/java/org/elasticsearch/indices/recovery/RecoverySourceHandler.java b/src/main/java/org/elasticsearch/indices/recovery/RecoverySourceHandler.java
index 3f6702a..d304333 100644
--- a/src/main/java/org/elasticsearch/indices/recovery/RecoverySourceHandler.java
+++ b/src/main/java/org/elasticsearch/indices/recovery/RecoverySourceHandler.java
@@ -435,7 +435,7 @@
         stopWatch.stop();
         response.startTime = stopWatch.totalTime().millis();
         logger.trace("{} recovery [phase2] to {}: start took [{}]",
-                request.shardId(), request.targetNode(), request.targetNode(), stopWatch.totalTime());
+                request.shardId(), request.targetNode(), stopWatch.totalTime());
 
 
         logger.trace("{} recovery [phase2] to {}: updating current mapping to master", request.shardId(), request.targetNode());
