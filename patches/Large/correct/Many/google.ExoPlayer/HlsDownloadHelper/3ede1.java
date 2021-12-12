diff --git a/library/hls/src/main/java/com/google/android/exoplayer2/source/hls/offline/HlsDownloadHelper.java b/library/hls/src/main/java/com/google/android/exoplayer2/source/hls/offline/HlsDownloadHelper.java
index c043e57..7fe03f6 100644
--- a/library/hls/src/main/java/com/google/android/exoplayer2/source/hls/offline/HlsDownloadHelper.java
+++ b/library/hls/src/main/java/com/google/android/exoplayer2/source/hls/offline/HlsDownloadHelper.java
@@ -73,7 +73,7 @@
   public TrackGroupArray getTrackGroups(int periodIndex) {
     Assertions.checkNotNull(playlist);
     if (playlist instanceof HlsMediaPlaylist) {
-      renditionGroups = new int[0];
+      renditionTypes = new int[0];
       return TrackGroupArray.EMPTY;
     }
     // TODO: Generate track groups as in playback. Reverse the mapping in getDownloadAction.
