diff --git a/library/src/main/java/com/google/android/exoplayer2/source/hls/HlsMediaPeriod.java b/library/src/main/java/com/google/android/exoplayer2/source/hls/HlsMediaPeriod.java
index 2530a18..288412c 100644
--- a/library/src/main/java/com/google/android/exoplayer2/source/hls/HlsMediaPeriod.java
+++ b/library/src/main/java/com/google/android/exoplayer2/source/hls/HlsMediaPeriod.java
@@ -163,7 +163,8 @@
           mayRetainStreamFlags, childStreams, streamResetFlags, !seenFirstTrackSelection);
       boolean wrapperEnabled = false;
       for (int j = 0; j < selections.length; j++) {
-        if (selectionChildIndices[j] == i) {
+        if (selectionChildIndices[j] == i
+            || (selectionChildIndices[j] == C.INDEX_UNSET && streamChildIndices[j] == i)) {
           streams[j] = childStreams[j];
           if (childStreams[j] != null) {
             wrapperEnabled = true;
@@ -291,7 +292,7 @@
     callback.onPrepared(this);
 
     // TODO[playlists]: Calculate the window.
-    Timeline timeline = new SinglePeriodTimeline(durationUs, !isLive);
+    Timeline timeline = new SinglePeriodTimeline(durationUs, durationUs, 0, 0, !isLive, isLive);
     sourceListener.onSourceInfoRefreshed(timeline, playlist);
   }
 
