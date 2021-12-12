diff --git a/services/core/java/com/android/server/stats/StatsCompanionService.java b/services/core/java/com/android/server/stats/StatsCompanionService.java
index fae0b24..d4625e9 100644
--- a/services/core/java/com/android/server/stats/StatsCompanionService.java
+++ b/services/core/java/com/android/server/stats/StatsCompanionService.java
@@ -379,7 +379,7 @@
         @Override
         public void onReceive(Context context, Intent intent) {
             if (DEBUG)
-                Slog.d(TAG, "Time to poll something.");
+                Slog.d(TAG, "Time to trigger periodic alarm.");
             synchronized (sStatsdLock) {
                 if (sStatsd == null) {
                     Slog.w(TAG, "Could not access statsd to inform it of periodic alarm firing.");
@@ -455,13 +455,13 @@
     public void setAlarmForSubscriberTriggering(long timestampMs) {
         enforceCallingPermission();
         if (DEBUG)
-            Slog.d(TAG, "Setting periodic alarm at " + timestampMs);
+            Slog.d(TAG, "Setting periodic alarm in about " +
+                    (timestampMs - SystemClock.elapsedRealtime()));
         final long callingToken = Binder.clearCallingIdentity();
         try {
             // using ELAPSED_REALTIME, not ELAPSED_REALTIME_WAKEUP, so if device is asleep, will
             // only fire when it awakens.
-            // This alarm is inexact, leaving its exactness completely up to the OS optimizations.
-            mAlarmManager.set(AlarmManager.ELAPSED_REALTIME, timestampMs, mPeriodicAlarmIntent);
+            mAlarmManager.setExact(AlarmManager.ELAPSED_REALTIME, timestampMs, mPeriodicAlarmIntent);
         } finally {
             Binder.restoreCallingIdentity(callingToken);
         }
