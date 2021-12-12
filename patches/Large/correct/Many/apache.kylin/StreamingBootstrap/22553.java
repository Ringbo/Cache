diff --git a/job/src/main/java/org/apache/kylin/job/streaming/StreamingBootstrap.java b/job/src/main/java/org/apache/kylin/job/streaming/StreamingBootstrap.java
index 2ea1789..ae6b282 100644
--- a/job/src/main/java/org/apache/kylin/job/streaming/StreamingBootstrap.java
+++ b/job/src/main/java/org/apache/kylin/job/streaming/StreamingBootstrap.java
@@ -249,7 +249,7 @@
                         try {
                             partitionIdOffsetMap.put(idx, StreamingUtil.findClosestOffsetWithDataTimestamp(kafkaClusterConfig, idx, targetTimestamp, streamParser));
                         } catch (Exception e) {
-                            logger.error(String.format("fail to get start offset partitionId: %d, target timestamp: %d", idx, targetTimestamp));
+                            logger.error(String.format("fail to get start offset partitionId: %d, target timestamp: %d", idx, targetTimestamp), e);
                         } finally {
                             countDownLatch.countDown();
                         }
