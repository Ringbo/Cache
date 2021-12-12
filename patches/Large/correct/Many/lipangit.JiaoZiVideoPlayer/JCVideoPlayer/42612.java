diff --git a/jcvideoplayer-lib/src/main/java/fm/jiecao/jcvideoplayer_lib/JCVideoPlayer.java b/jcvideoplayer-lib/src/main/java/fm/jiecao/jcvideoplayer_lib/JCVideoPlayer.java
index c34d033..ae2fc75 100644
--- a/jcvideoplayer-lib/src/main/java/fm/jiecao/jcvideoplayer_lib/JCVideoPlayer.java
+++ b/jcvideoplayer-lib/src/main/java/fm/jiecao/jcvideoplayer_lib/JCVideoPlayer.java
@@ -549,7 +549,7 @@
 
     public void onError(int what, int extra) {
         Log.e(TAG, "onError " + what + " - " + extra + " [" + this.hashCode() + "] ");
-        if (what != 38 && what != -38) {
+        if (what != 38 && extra != -38) {
             setUiWitStateAndScreen(CURRENT_STATE_ERROR);
             if (isCurrentJcvd()) {
                 JCMediaManager.instance().releaseMediaPlayer();
