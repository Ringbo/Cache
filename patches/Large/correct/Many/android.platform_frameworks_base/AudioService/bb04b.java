diff --git a/media/java/android/media/AudioService.java b/media/java/android/media/AudioService.java
index 9362305..bde8a47 100644
--- a/media/java/android/media/AudioService.java
+++ b/media/java/android/media/AudioService.java
@@ -957,10 +957,10 @@
         if (AudioSystem.getForceUse(AudioSystem.FOR_COMMUNICATION) == AudioSystem.FORCE_BT_SCO) {
             // Log.v(TAG, "getActiveStreamType: Forcing STREAM_BLUETOOTH_SCO...");
             return AudioSystem.STREAM_BLUETOOTH_SCO;
-        } else if (isOffhook) {
+        } else if (isOffhook || AudioSystem.isStreamActive(AudioSystem.STREAM_VOICE_CALL)) {
             // Log.v(TAG, "getActiveStreamType: Forcing STREAM_VOICE_CALL...");
             return AudioSystem.STREAM_VOICE_CALL;
-        } else if (AudioSystem.isMusicActive()) {
+        } else if (AudioSystem.isStreamActive(AudioSystem.STREAM_MUSIC)) {
             // Log.v(TAG, "getActiveStreamType: Forcing STREAM_MUSIC...");
             return AudioSystem.STREAM_MUSIC;
         } else if (suggestedStreamType == AudioManager.USE_DEFAULT_STREAM_TYPE) {
@@ -1366,7 +1366,7 @@
                     // Force creation of new IAudioflinger interface
                     if (!mMediaServerOk) {
                         Log.e(TAG, "Media server died.");
-                        AudioSystem.isMusicActive();
+                        AudioSystem.isStreamActive(AudioSystem.STREAM_MUSIC);
                         sendMsg(mAudioHandler, MSG_MEDIA_SERVER_DIED, SHARED_MSG, SENDMSG_NOOP, 0, 0,
                                 null, 500);
                     }
