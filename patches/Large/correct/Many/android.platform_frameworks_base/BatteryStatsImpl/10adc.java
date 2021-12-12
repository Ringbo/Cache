diff --git a/core/java/com/android/internal/os/BatteryStatsImpl.java b/core/java/com/android/internal/os/BatteryStatsImpl.java
index a050a3c..5d6d5bc 100644
--- a/core/java/com/android/internal/os/BatteryStatsImpl.java
+++ b/core/java/com/android/internal/os/BatteryStatsImpl.java
@@ -11228,7 +11228,9 @@
         reportChangesToStatsLog(mHaveBatteryLevel ? mHistoryCur : null,
                 status, plugType, level, temp);
 
-        final boolean onBattery = plugType == BATTERY_PLUGGED_NONE;
+        final boolean onBattery =
+            plugType == BATTERY_PLUGGED_NONE &&
+            status != BatteryManager.BATTERY_STATUS_UNKNOWN;
         final long uptime = mClocks.uptimeMillis();
         final long elapsedRealtime = mClocks.elapsedRealtime();
         if (!mHaveBatteryLevel) {
@@ -11262,7 +11264,8 @@
                 mRecordingHistory = true;
                 startRecordingHistory(elapsedRealtime, uptime, true);
             }
-        } else if (level < 96) {
+        } else if (level < 96 &&
+            status != BatteryManager.BATTERY_STATUS_UNKNOWN) {
             if (!mRecordingHistory) {
                 mRecordingHistory = true;
                 startRecordingHistory(elapsedRealtime, uptime, true);
@@ -11400,9 +11403,12 @@
                 addHistoryRecordLocked(elapsedRealtime, uptime);
             }
         }
-        if (!onBattery && status == BatteryManager.BATTERY_STATUS_FULL) {
-            // We don't record history while we are plugged in and fully charged.
-            // The next time we are unplugged, history will be cleared.
+        if (!onBattery &&
+            (status == BatteryManager.BATTERY_STATUS_FULL ||
+             status == BatteryManager.BATTERY_STATUS_UNKNOWN)) {
+            // We don't record history while we are plugged in and fully charged
+            // (or when battery is not present).  The next time we are
+            // unplugged, history will be cleared.
             mRecordingHistory = DEBUG;
         }
 
