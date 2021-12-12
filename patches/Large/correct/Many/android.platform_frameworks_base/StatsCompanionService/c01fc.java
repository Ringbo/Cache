diff --git a/services/core/java/com/android/server/stats/StatsCompanionService.java b/services/core/java/com/android/server/stats/StatsCompanionService.java
index faafb39..b36c030 100644
--- a/services/core/java/com/android/server/stats/StatsCompanionService.java
+++ b/services/core/java/com/android/server/stats/StatsCompanionService.java
@@ -648,7 +648,7 @@
                     SynchronousResultReceiver modemReceiver = new SynchronousResultReceiver("telephony");
                     mTelephony.requestModemActivityInfo(modemReceiver);
                     final ModemActivityInfo modemInfo = awaitControllerInfo(modemReceiver);
-                    StatsLogEventWrapper e = new StatsLogEventWrapper(tagId, 6);
+                    StatsLogEventWrapper e = new StatsLogEventWrapper(tagId, 10);
                     e.writeLong(modemInfo.getTimestamp());
                     e.writeLong(modemInfo.getSleepTimeMillis());
                     e.writeLong(modemInfo.getIdleTimeMillis());
