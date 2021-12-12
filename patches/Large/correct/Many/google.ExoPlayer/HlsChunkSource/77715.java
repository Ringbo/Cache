diff --git a/library/src/main/java/com/google/android/exoplayer2/source/hls/HlsChunkSource.java b/library/src/main/java/com/google/android/exoplayer2/source/hls/HlsChunkSource.java
index 9e39b9a..6a90c88 100644
--- a/library/src/main/java/com/google/android/exoplayer2/source/hls/HlsChunkSource.java
+++ b/library/src/main/java/com/google/android/exoplayer2/source/hls/HlsChunkSource.java
@@ -215,7 +215,7 @@
     int chunkMediaSequence;
     if (previous == null || switchingVariant) {
       long targetPositionUs = previous == null ? playbackPositionUs : previous.startTimeUs;
-      if (targetPositionUs > mediaPlaylist.getEndTimeUs()) {
+      if (!mediaPlaylist.hasEndTag && targetPositionUs > mediaPlaylist.getEndTimeUs()) {
         // If the playlist is too old to contain the chunk, we need to refresh it.
         chunkMediaSequence = mediaPlaylist.mediaSequence + mediaPlaylist.segments.size();
       } else {
