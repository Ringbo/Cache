diff --git a/media/java/android/media/MediaPlayer.java b/media/java/android/media/MediaPlayer.java
index aa4cdbe..9ed9de0 100644
--- a/media/java/android/media/MediaPlayer.java
+++ b/media/java/android/media/MediaPlayer.java
@@ -737,7 +737,7 @@
      * @see MediaPlayer#VIDEO_SCALING_MODE_SCALE_TO_FIT_WITH_CROPPING
      */
     public void setVideoScalingMode(int mode) {
-        if (isVideoScalingModeSupported(mode)) {
+        if (!isVideoScalingModeSupported(mode)) {
             final String msg = "Scaling mode " + mode + " is not supported";
             throw new IllegalArgumentException(msg);
         }
