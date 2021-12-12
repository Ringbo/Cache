diff --git a/jiaozivideoplayer/src/main/java/cn/jzvd/JZMediaSystem.java b/jiaozivideoplayer/src/main/java/cn/jzvd/JZMediaSystem.java
index 3eac402..96cf886 100644
--- a/jiaozivideoplayer/src/main/java/cn/jzvd/JZMediaSystem.java
+++ b/jiaozivideoplayer/src/main/java/cn/jzvd/JZMediaSystem.java
@@ -173,7 +173,8 @@
             public void run() {
                 if (JZVideoPlayerManager.getCurrentJzvd() != null) {
                     if (what == MediaPlayer.MEDIA_INFO_VIDEO_RENDERING_START) {
-                        if (JZVideoPlayerManager.getCurrentJzvd().currentState == JZVideoPlayer.CURRENT_STATE_PREPARING) {
+                        if (JZVideoPlayerManager.getCurrentJzvd().currentState == JZVideoPlayer.CURRENT_STATE_PREPARING
+                                ||JZVideoPlayerManager.getCurrentJzvd().currentState == JZVideoPlayer.CURRENT_STATE_PREPARING_CHANGING_URL) {
                             JZVideoPlayerManager.getCurrentJzvd().onPrepared();
                         }
                     } else {
