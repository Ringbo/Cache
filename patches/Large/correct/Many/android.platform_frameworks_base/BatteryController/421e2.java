diff --git a/services/core/java/com/android/server/task/controllers/BatteryController.java b/services/core/java/com/android/server/task/controllers/BatteryController.java
index 585b41f..4727e9a 100644
--- a/services/core/java/com/android/server/task/controllers/BatteryController.java
+++ b/services/core/java/com/android/server/task/controllers/BatteryController.java
@@ -151,7 +151,7 @@
             // Initialise tracker state.
             BatteryService batteryService = (BatteryService) ServiceManager.getService("battery");
             if (batteryService != null) {
-                mBatteryHealthy = !batteryService.isBatteryLow();
+                mBatteryHealthy = !batteryService.getBatteryLevelLow();
                 mCharging = batteryService.isPowered(BatteryManager.BATTERY_PLUGGED_ANY);
             } else {
                 // Unavailable for some reason, we default to false and let ACTION_BATTERY_[OK,LOW]
