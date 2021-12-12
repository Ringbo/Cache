diff --git a/services/core/java/com/android/server/power/BatterySaverPolicy.java b/services/core/java/com/android/server/power/BatterySaverPolicy.java
index 7c234f9..3ccf17e 100644
--- a/services/core/java/com/android/server/power/BatterySaverPolicy.java
+++ b/services/core/java/com/android/server/power/BatterySaverPolicy.java
@@ -328,7 +328,7 @@
         mFullBackupDeferred = parser.getBoolean(KEY_FULLBACKUP_DEFERRED, true);
         mKeyValueBackupDeferred = parser.getBoolean(KEY_KEYVALUE_DEFERRED, true);
         mFireWallDisabled = parser.getBoolean(KEY_FIREWALL_DISABLED, false);
-        mAdjustBrightnessDisabled = parser.getBoolean(KEY_ADJUST_BRIGHTNESS_DISABLED, false);
+        mAdjustBrightnessDisabled = parser.getBoolean(KEY_ADJUST_BRIGHTNESS_DISABLED, true);
         mAdjustBrightnessFactor = parser.getFloat(KEY_ADJUST_BRIGHTNESS_FACTOR, 0.5f);
         mDataSaverDisabled = parser.getBoolean(KEY_DATASAVER_DISABLED, true);
         mLaunchBoostDisabled = parser.getBoolean(KEY_LAUNCH_BOOST_DISABLED, true);
