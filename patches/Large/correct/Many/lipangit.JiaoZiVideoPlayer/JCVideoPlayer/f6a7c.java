diff --git a/jcvideoplayer-lib/src/main/java/fm/jiecao/jcvideoplayer_lib/JCVideoPlayer.java b/jcvideoplayer-lib/src/main/java/fm/jiecao/jcvideoplayer_lib/JCVideoPlayer.java
index babcf66..3b1f693 100644
--- a/jcvideoplayer-lib/src/main/java/fm/jiecao/jcvideoplayer_lib/JCVideoPlayer.java
+++ b/jcvideoplayer-lib/src/main/java/fm/jiecao/jcvideoplayer_lib/JCVideoPlayer.java
@@ -434,7 +434,7 @@
                     JCBuriedPoint.ON_QUIT_FULLSCREEN :
                     JCBuriedPoint.ON_QUIT_TINYSCREEN);
             if (JCVideoPlayerManager.lastListener() == null) {//directly fullscreen
-                JCVideoPlayerManager.listener().onCompletion();
+                JCVideoPlayerManager.lastListener().onCompletion();
                 showSupportActionBar(getContext());
                 return true;
             }
