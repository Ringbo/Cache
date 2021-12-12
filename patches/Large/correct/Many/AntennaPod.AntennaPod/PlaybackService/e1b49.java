diff --git a/core/src/main/java/de/danoeh/antennapod/core/service/playback/PlaybackService.java b/core/src/main/java/de/danoeh/antennapod/core/service/playback/PlaybackService.java
index 3f6769e..43a9193 100644
--- a/core/src/main/java/de/danoeh/antennapod/core/service/playback/PlaybackService.java
+++ b/core/src/main/java/de/danoeh/antennapod/core/service/playback/PlaybackService.java
@@ -634,7 +634,7 @@
 
         writePlaybackPreferencesNoMediaPlaying();
         if (nextMedia != null) {
-            stream = !playable.localFileAvailable();
+            stream = !nextMedia.localFileAvailable();
             mediaPlayer.playMediaObject(nextMedia, stream, startWhenPrepared, prepareImmediately);
             sendNotificationBroadcast(NOTIFICATION_TYPE_RELOAD,
                     (nextMedia.getMediaType() == MediaType.VIDEO) ? EXTRA_CODE_VIDEO : EXTRA_CODE_AUDIO);
