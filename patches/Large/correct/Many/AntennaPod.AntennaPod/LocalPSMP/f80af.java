diff --git a/core/src/main/java/de/danoeh/antennapod/core/service/playback/LocalPSMP.java b/core/src/main/java/de/danoeh/antennapod/core/service/playback/LocalPSMP.java
index 0336c24..97d607a 100644
--- a/core/src/main/java/de/danoeh/antennapod/core/service/playback/LocalPSMP.java
+++ b/core/src/main/java/de/danoeh/antennapod/core/service/playback/LocalPSMP.java
@@ -316,11 +316,12 @@
             videoSize = new Pair<>(vp.getVideoWidth(), vp.getVideoHeight());
         }
 
+        // TODO this call has no effect!
         if (media.getPosition() > 0) {
             seekToSync(media.getPosition());
         }
 
-        if (media.getDuration() == 0) {
+        if (media.getDuration() <= 0) {
             Log.d(TAG, "Setting duration of media");
             media.setDuration(mediaPlayer.getDuration());
         }
