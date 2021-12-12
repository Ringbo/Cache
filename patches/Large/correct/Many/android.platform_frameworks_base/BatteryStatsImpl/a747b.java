diff --git a/core/java/com/android/internal/os/BatteryStatsImpl.java b/core/java/com/android/internal/os/BatteryStatsImpl.java
index 5a0da9a..1f42fbd 100644
--- a/core/java/com/android/internal/os/BatteryStatsImpl.java
+++ b/core/java/com/android/internal/os/BatteryStatsImpl.java
@@ -3987,8 +3987,8 @@
                 // we have gone through a significant charge (from a very low
                 // level to a now very high level).
                 if (oldStatus == BatteryManager.BATTERY_STATUS_FULL
-                        || level >= 100
-                        || (mDischargeCurrentLevel < 20 && level > 90)) {
+                        || level >= 95
+                        || (mDischargeCurrentLevel < 30 && level >= 90)) {
                     doWrite = true;
                     resetAllStatsLocked();
                     mDischargeStartLevel = level;
