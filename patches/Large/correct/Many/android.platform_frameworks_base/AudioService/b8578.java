diff --git a/media/java/android/media/AudioService.java b/media/java/android/media/AudioService.java
index e18220a..6458e37 100644
--- a/media/java/android/media/AudioService.java
+++ b/media/java/android/media/AudioService.java
@@ -1940,7 +1940,7 @@
                     // Force creation of new IAudioflinger interface
                     if (!mMediaServerOk) {
                         Log.e(TAG, "Media server died.");
-                        AudioSystem.isStreamActive(AudioSystem.STREAM_MUSIC, 0);
+                        AudioSystem.isMicrophoneMuted();
                         sendMsg(mAudioHandler, MSG_MEDIA_SERVER_DIED, SHARED_MSG, SENDMSG_NOOP, 0, 0,
                                 null, 500);
                     }
