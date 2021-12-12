diff --git a/services/core/java/com/android/server/VibratorService.java b/services/core/java/com/android/server/VibratorService.java
index 7f3eb15..ab036c7 100644
--- a/services/core/java/com/android/server/VibratorService.java
+++ b/services/core/java/com/android/server/VibratorService.java
@@ -487,7 +487,7 @@
 
     private boolean shouldVibrateForRingtone() {
         AudioManager audioManager = (AudioManager) mContext.getSystemService(Context.AUDIO_SERVICE);
-        int ringerMode = audioManager.getRingerMode();
+        int ringerMode = audioManager.getRingerModeInternal();
         // "Also vibrate for calls" Setting in Sound
         if (Settings.System.getInt(
                 mContext.getContentResolver(), Settings.System.VIBRATE_WHEN_RINGING, 0) != 0) {
