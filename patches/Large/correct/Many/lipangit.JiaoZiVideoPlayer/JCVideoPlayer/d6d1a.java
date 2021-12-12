diff --git a/jcvideoplayer-lib/src/main/java/fm/jiecao/jcvideoplayer_lib/JCVideoPlayer.java b/jcvideoplayer-lib/src/main/java/fm/jiecao/jcvideoplayer_lib/JCVideoPlayer.java
index 7666045..babcf66 100644
--- a/jcvideoplayer-lib/src/main/java/fm/jiecao/jcvideoplayer_lib/JCVideoPlayer.java
+++ b/jcvideoplayer-lib/src/main/java/fm/jiecao/jcvideoplayer_lib/JCVideoPlayer.java
@@ -865,14 +865,14 @@
             float x = event.values[SensorManager.DATA_X];
             float y = event.values[SensorManager.DATA_Y];
             float z = event.values[SensorManager.DATA_Z];
-            if (x < -11) {
+            if (x < -10) {
                 //direction right
-            } else if (x > 11) {
+            } else if (x > 10) {
                 //direction left
                 if (JCVideoPlayerManager.listener() != null) {
                     JCVideoPlayerManager.listener().autoFullscreenLeft();
                 }
-            } else if (y > 11) {
+            } else if (y > 9) {
                 if (JCVideoPlayerManager.listener() != null) {
                     JCVideoPlayerManager.listener().autoQuitFullscreen();
                 }
