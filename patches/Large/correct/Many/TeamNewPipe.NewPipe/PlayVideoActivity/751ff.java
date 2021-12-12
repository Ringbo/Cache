diff --git a/app/src/main/java/org/schabi/newpipe/PlayVideoActivity.java b/app/src/main/java/org/schabi/newpipe/PlayVideoActivity.java
index ae632cf..823fb76 100644
--- a/app/src/main/java/org/schabi/newpipe/PlayVideoActivity.java
+++ b/app/src/main/java/org/schabi/newpipe/PlayVideoActivity.java
@@ -130,7 +130,7 @@
             public void onPrepared(MediaPlayer mp) {
                 progressBar.setVisibility(View.GONE);
                 videoView.seekTo(position);
-                if (position == 0) {
+                if (position <= 0) {
                     videoView.start();
                     showUi();
                 } else {
