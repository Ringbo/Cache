diff --git a/services/core/java/com/android/server/power/BatterySaverPolicy.java b/services/core/java/com/android/server/power/BatterySaverPolicy.java
index 91ef3d4..ed2b79e 100644
--- a/services/core/java/com/android/server/power/BatterySaverPolicy.java
+++ b/services/core/java/com/android/server/power/BatterySaverPolicy.java
@@ -392,7 +392,7 @@
         mForceBackgroundCheck = parser.getBoolean(KEY_FORCE_BACKGROUND_CHECK, true);
         mOptionalSensorsDisabled = parser.getBoolean(KEY_OPTIONAL_SENSORS_DISABLED, true);
         mAodDisabled = parser.getBoolean(KEY_AOD_DISABLED, true);
-        mSendTronLog = parser.getBoolean(KEY_SEND_TRON_LOG, true);
+        mSendTronLog = parser.getBoolean(KEY_SEND_TRON_LOG, false);
 
         // Get default value from Settings.Secure
         final int defaultGpsMode = Settings.Secure.getInt(mContentResolver, SECURE_KEY_GPS_MODE,
