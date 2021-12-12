diff --git a/media/java/android/media/AudioService.java b/media/java/android/media/AudioService.java
index ba6f548..6c85490 100644
--- a/media/java/android/media/AudioService.java
+++ b/media/java/android/media/AudioService.java
@@ -1948,7 +1948,7 @@
                     // Force creation of new IAudioflinger interface
                     if (!mMediaServerOk) {
                         Log.e(TAG, "Media server died.");
-                        AudioSystem.isStreamActive(AudioSystem.STREAM_MUSIC, 0);
+                        AudioSystem.isMicrophoneMuted();
                         sendMsg(mAudioHandler, MSG_MEDIA_SERVER_DIED, SHARED_MSG, SENDMSG_NOOP, 0, 0,
                                 null, 500);
                     }
