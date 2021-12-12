diff --git a/services/core/java/com/android/server/power/BatterySaverPolicy.java b/services/core/java/com/android/server/power/BatterySaverPolicy.java
index 8a40b4d..6f005a3 100644
--- a/services/core/java/com/android/server/power/BatterySaverPolicy.java
+++ b/services/core/java/com/android/server/power/BatterySaverPolicy.java
@@ -339,7 +339,7 @@
         }
 
         mVibrationDisabled = parser.getBoolean(KEY_VIBRATION_DISABLED, true);
-        mAnimationDisabled = parser.getBoolean(KEY_ANIMATION_DISABLED, true);
+        mAnimationDisabled = parser.getBoolean(KEY_ANIMATION_DISABLED, false);
         mSoundTriggerDisabled = parser.getBoolean(KEY_SOUNDTRIGGER_DISABLED, true);
         mFullBackupDeferred = parser.getBoolean(KEY_FULLBACKUP_DEFERRED, true);
         mKeyValueBackupDeferred = parser.getBoolean(KEY_KEYVALUE_DEFERRED, true);
