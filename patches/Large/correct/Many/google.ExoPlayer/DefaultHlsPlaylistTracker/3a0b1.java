diff --git a/library/hls/src/main/java/com/google/android/exoplayer2/source/hls/playlist/DefaultHlsPlaylistTracker.java b/library/hls/src/main/java/com/google/android/exoplayer2/source/hls/playlist/DefaultHlsPlaylistTracker.java
index 4e34c55..4269b66 100644
--- a/library/hls/src/main/java/com/google/android/exoplayer2/source/hls/playlist/DefaultHlsPlaylistTracker.java
+++ b/library/hls/src/main/java/com/google/android/exoplayer2/source/hls/playlist/DefaultHlsPlaylistTracker.java
@@ -162,9 +162,9 @@
   }
 
   @Override
-  public HlsMediaPlaylist getPlaylistSnapshot(HlsUrl url) {
+  public HlsMediaPlaylist getPlaylistSnapshot(HlsUrl url, boolean isForPlayback) {
     HlsMediaPlaylist snapshot = playlistBundles.get(url).getPlaylistSnapshot();
-    if (snapshot != null) {
+    if (snapshot != null && isForPlayback) {
       maybeSetPrimaryUrl(url);
     }
     return snapshot;
