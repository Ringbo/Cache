diff --git a/streams/src/main/java/org/apache/kafka/streams/processor/internals/StreamThread.java b/streams/src/main/java/org/apache/kafka/streams/processor/internals/StreamThread.java
index b753cf9..867359b 100644
--- a/streams/src/main/java/org/apache/kafka/streams/processor/internals/StreamThread.java
+++ b/streams/src/main/java/org/apache/kafka/streams/processor/internals/StreamThread.java
@@ -963,7 +963,7 @@
                 streamsMetrics.commitTimeSensor.record(computeLatency() / (double) committed, timerStartedMs);
             }
             if (log.isDebugEnabled()) {
-                log.info("Committed all active tasks {} and standby tasks {} in {}ms",
+                log.debug("Committed all active tasks {} and standby tasks {} in {}ms",
                         taskManager.activeTaskIds(), taskManager.standbyTaskIds(), timerStartedMs - now);
             }
 
