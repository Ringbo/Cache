diff --git a/media/java/android/media/MediaPlayer.java b/media/java/android/media/MediaPlayer.java
index a4d3485..13b2878 100644
--- a/media/java/android/media/MediaPlayer.java
+++ b/media/java/android/media/MediaPlayer.java
@@ -2292,7 +2292,7 @@
 
     private void scanInternalSubtitleTracks() {
         if (mSubtitleController == null) {
-            Log.w(TAG, "setSubtitleAnchor in MediaPlayer");
+            Log.d(TAG, "setSubtitleAnchor in MediaPlayer");
             setSubtitleAnchor();
         }
 
