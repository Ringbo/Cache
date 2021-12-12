diff --git a/app/src/main/java/com/kickstarter/ui/activities/VideoPlayerActivity.java b/app/src/main/java/com/kickstarter/ui/activities/VideoPlayerActivity.java
index e09ccaa..052aff7 100644
--- a/app/src/main/java/com/kickstarter/ui/activities/VideoPlayerActivity.java
+++ b/app/src/main/java/com/kickstarter/ui/activities/VideoPlayerActivity.java
@@ -72,7 +72,7 @@
   @Override
   public void onStateChanged(final boolean playWhenReady, final int playbackState) {
     if (playbackState == ExoPlayer.STATE_ENDED) {
-      mediaController.show();
+      finish();
     }
 
     if (playbackState == ExoPlayer.STATE_BUFFERING) {
@@ -125,7 +125,7 @@
     if (mediaController.isShowing()) {
       mediaController.hide();
     } else {
-      mediaController.show(0);
+      mediaController.show();
     }
   }
 }
