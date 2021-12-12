diff --git a/library/ui/src/main/java/com/google/android/exoplayer2/ui/PlaybackControlView.java b/library/ui/src/main/java/com/google/android/exoplayer2/ui/PlaybackControlView.java
index a5c6676..dfa5e9a 100644
--- a/library/ui/src/main/java/com/google/android/exoplayer2/ui/PlaybackControlView.java
+++ b/library/ui/src/main/java/com/google/android/exoplayer2/ui/PlaybackControlView.java
@@ -817,7 +817,7 @@
     public void onScrubStop(TimeBar timeBar, long position, boolean canceled) {
       scrubbing = false;
       if (!canceled && player != null) {
-        if (showMultiWindowTimeBar) {
+        if (multiWindowTimeBar) {
           Timeline timeline = player.getCurrentTimeline();
           int windowCount = timeline.getWindowCount();
           long remainingMs = position;
