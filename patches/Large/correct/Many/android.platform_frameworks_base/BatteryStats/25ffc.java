diff --git a/core/java/android/os/BatteryStats.java b/core/java/android/os/BatteryStats.java
index ecb7f5a..80169a9 100644
--- a/core/java/android/os/BatteryStats.java
+++ b/core/java/android/os/BatteryStats.java
@@ -2615,7 +2615,9 @@
                 getMobileRadioActiveAdjustedTime(which) / 1000, interactiveTime / 1000,
                 powerSaveModeEnabledTime / 1000, connChanges, deviceIdleModeEnabledTime / 1000,
                 getDeviceIdleModeEnabledCount(which), deviceIdlingTime / 1000,
-                getDeviceIdlingCount(which));
+                getDeviceIdlingCount(which),
+                getMobileRadioActiveCount(which),
+                getMobileRadioActiveUnknownTime(which) / 1000);
         
         // Dump screen brightness stats
         Object[] args = new Object[NUM_SCREEN_BRIGHTNESS_BINS];
