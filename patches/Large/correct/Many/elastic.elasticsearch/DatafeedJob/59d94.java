diff --git a/plugin/src/main/java/org/elasticsearch/xpack/ml/datafeed/DatafeedJob.java b/plugin/src/main/java/org/elasticsearch/xpack/ml/datafeed/DatafeedJob.java
index 6777011..f30e2f0 100644
--- a/plugin/src/main/java/org/elasticsearch/xpack/ml/datafeed/DatafeedJob.java
+++ b/plugin/src/main/java/org/elasticsearch/xpack/ml/datafeed/DatafeedJob.java
@@ -274,7 +274,7 @@
 
     private long nextRealtimeTimestamp() {
         long epochMs = currentTimeSupplier.get() + frequencyMs;
-        return toIntervalStartEpochMs(epochMs) + NEXT_TASK_DELAY_MS;
+        return toIntervalStartEpochMs(epochMs) + queryDelayMs + NEXT_TASK_DELAY_MS;
     }
 
     private long toIntervalStartEpochMs(long epochMs) {
