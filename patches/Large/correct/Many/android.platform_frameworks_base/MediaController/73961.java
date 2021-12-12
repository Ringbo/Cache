diff --git a/media/java/android/media/session/MediaController.java b/media/java/android/media/session/MediaController.java
index f16804c..84f85e7 100644
--- a/media/java/android/media/session/MediaController.java
+++ b/media/java/android/media/session/MediaController.java
@@ -531,7 +531,7 @@
          *
          * @param state The new playback state of the session
          */
-        public void onPlaybackStateChanged(@NonNull PlaybackState state) {
+        public void onPlaybackStateChanged(@Nullable PlaybackState state) {
         }
 
         /**
