diff --git a/services/core/java/com/android/server/audio/AudioService.java b/services/core/java/com/android/server/audio/AudioService.java
index 246ff08..66e731a 100644
--- a/services/core/java/com/android/server/audio/AudioService.java
+++ b/services/core/java/com/android/server/audio/AudioService.java
@@ -280,7 +280,7 @@
         0,  // STREAM_MUSIC
         0,  // STREAM_ALARM
         0,  // STREAM_NOTIFICATION
-        1,  // STREAM_BLUETOOTH_SCO
+        0,  // STREAM_BLUETOOTH_SCO
         0,  // STREAM_SYSTEM_ENFORCED
         0,  // STREAM_DTMF
         0   // STREAM_TTS
@@ -803,7 +803,8 @@
         int numStreamTypes = AudioSystem.getNumStreamTypes();
         for (int streamType = numStreamTypes - 1; streamType >= 0; streamType--) {
             VolumeStreamState streamState = mStreamStates[streamType];
-            AudioSystem.initStreamVolume(streamType, 0, (streamState.mIndexMax + 5) / 10);
+            AudioSystem.initStreamVolume(
+                streamType, streamState.mIndexMin / 10, streamState.mIndexMax / 10);
 
             streamState.applyAllVolumes();
         }
