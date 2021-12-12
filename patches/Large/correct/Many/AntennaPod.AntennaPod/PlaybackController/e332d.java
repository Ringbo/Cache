diff --git a/core/src/main/java/de/danoeh/antennapod/core/util/playback/PlaybackController.java b/core/src/main/java/de/danoeh/antennapod/core/util/playback/PlaybackController.java
index a0d12d3..ba5428b 100644
--- a/core/src/main/java/de/danoeh/antennapod/core/util/playback/PlaybackController.java
+++ b/core/src/main/java/de/danoeh/antennapod/core/util/playback/PlaybackController.java
@@ -555,7 +555,7 @@
      * Should be used by classes which implement the OnSeekBarChanged interface.
      */
     public void onSeekBarStopTrackingTouch(SeekBar seekBar, float prog) {
-        if (playbackService != null) {
+        if (playbackService != null && media != null) {
             playbackService.seekTo((int) (prog * media.getDuration()));
             setupPositionObserver();
         }
