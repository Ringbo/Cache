diff --git a/services/core/java/com/android/server/stats/StatsCompanionService.java b/services/core/java/com/android/server/stats/StatsCompanionService.java
index 8101b56..4bc9404 100644
--- a/services/core/java/com/android/server/stats/StatsCompanionService.java
+++ b/services/core/java/com/android/server/stats/StatsCompanionService.java
@@ -290,7 +290,8 @@
     public final static class AnomalyAlarmReceiver extends BroadcastReceiver {
         @Override
         public void onReceive(Context context, Intent intent) {
-            Slog.i(TAG, "StatsCompanionService believes an anomaly has occurred.");
+            Slog.i(TAG, "StatsCompanionService believes an anomaly has occurred at time "
+                    + System.currentTimeMillis() + "ms.");
             synchronized (sStatsdLock) {
                 if (sStatsd == null) {
                     Slog.w(TAG, "Could not access statsd to inform it of anomaly alarm firing");
@@ -361,9 +362,8 @@
         final long callingToken = Binder.clearCallingIdentity();
         try {
             // using RTC, not RTC_WAKEUP, so if device is asleep, will only fire when it awakens.
-            // This alarm is inexact, leaving its exactness completely up to the OS optimizations.
             // AlarmManager will automatically cancel any previous mAnomalyAlarmIntent alarm.
-            mAlarmManager.set(AlarmManager.RTC, timestampMs, mAnomalyAlarmIntent);
+            mAlarmManager.setExact(AlarmManager.RTC, timestampMs, mAnomalyAlarmIntent);
         } finally {
             Binder.restoreCallingIdentity(callingToken);
         }
