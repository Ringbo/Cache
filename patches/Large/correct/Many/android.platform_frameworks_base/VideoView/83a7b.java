diff --git a/core/java/android/widget/VideoView.java b/core/java/android/widget/VideoView.java
index 50c88db..88a0e01 100644
--- a/core/java/android/widget/VideoView.java
+++ b/core/java/android/widget/VideoView.java
@@ -534,14 +534,14 @@
                 }
                 return true;
             } else if (keyCode == KeyEvent.KEYCODE_MEDIA_PLAY) {
-                if (mMediaPlayer.isPlaying()) {
+                if (!mMediaPlayer.isPlaying()) {
                     start();
                     mMediaController.hide();
                 }
                 return true;
             } else if (keyCode == KeyEvent.KEYCODE_MEDIA_STOP
                     || keyCode == KeyEvent.KEYCODE_MEDIA_PAUSE) {
-                if (!mMediaPlayer.isPlaying()) {
+                if (mMediaPlayer.isPlaying()) {
                     pause();
                     mMediaController.show();
                 }
