diff --git a/services/core/java/com/android/server/stats/StatsCompanionService.java b/services/core/java/com/android/server/stats/StatsCompanionService.java
index 8214aad..3798416 100644
--- a/services/core/java/com/android/server/stats/StatsCompanionService.java
+++ b/services/core/java/com/android/server/stats/StatsCompanionService.java
@@ -815,7 +815,7 @@
             SynchronousResultReceiver modemReceiver = new SynchronousResultReceiver("telephony");
             mTelephony.requestModemActivityInfo(modemReceiver);
             final ModemActivityInfo modemInfo = awaitControllerInfo(modemReceiver);
-            StatsLogEventWrapper e = new StatsLogEventWrapper(SystemClock.elapsedRealtimeNanos(), tagId, 6);
+            StatsLogEventWrapper e = new StatsLogEventWrapper(SystemClock.elapsedRealtimeNanos(), tagId, 10);
             e.writeLong(modemInfo.getTimestamp());
             e.writeLong(modemInfo.getSleepTimeMillis());
             e.writeLong(modemInfo.getIdleTimeMillis());
