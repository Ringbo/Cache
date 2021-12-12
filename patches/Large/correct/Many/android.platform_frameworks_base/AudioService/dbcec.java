diff --git a/media/java/android/media/AudioService.java b/media/java/android/media/AudioService.java
index a5c60d4..2bd1424 100644
--- a/media/java/android/media/AudioService.java
+++ b/media/java/android/media/AudioService.java
@@ -636,7 +636,7 @@
     private void readDockAudioSettings(ContentResolver cr)
     {
         mDockAudioMediaEnabled = Settings.Global.getInt(
-                                        cr, Settings.Global.DOCK_AUDIO_MEDIA_ENABLED, 1) == 1;
+                                        cr, Settings.Global.DOCK_AUDIO_MEDIA_ENABLED, 0) == 1;
 
         if (mDockAudioMediaEnabled) {
             mBecomingNoisyIntentDevices |= AudioSystem.DEVICE_OUT_ANLG_DOCK_HEADSET;
