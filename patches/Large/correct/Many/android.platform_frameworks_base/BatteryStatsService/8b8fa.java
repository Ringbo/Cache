diff --git a/services/core/java/com/android/server/am/BatteryStatsService.java b/services/core/java/com/android/server/am/BatteryStatsService.java
index d0f68f0..322d89d 100644
--- a/services/core/java/com/android/server/am/BatteryStatsService.java
+++ b/services/core/java/com/android/server/am/BatteryStatsService.java
@@ -1261,8 +1261,8 @@
                     Slog.v(TAG, "WiFi energy data was reset, new WiFi energy data is " + result);
                 }
 
-                // There is some accuracy error in reports so allow 30 milliseconds of error.
-                final long SAMPLE_ERROR_MILLIS = 30;
+                // There is some accuracy error in reports so allow some slop in the results.
+                final long SAMPLE_ERROR_MILLIS = 750;
                 final long totalTimeMs = result.mControllerIdleTimeMs + result.mControllerRxTimeMs +
                         result.mControllerTxTimeMs;
                 if (totalTimeMs > timePeriodMs + SAMPLE_ERROR_MILLIS) {
