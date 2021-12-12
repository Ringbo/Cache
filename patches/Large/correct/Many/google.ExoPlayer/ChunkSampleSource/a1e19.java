diff --git a/library/src/main/java/com/google/android/exoplayer/chunk/ChunkSampleSource.java b/library/src/main/java/com/google/android/exoplayer/chunk/ChunkSampleSource.java
index d8791f8..c51be31 100644
--- a/library/src/main/java/com/google/android/exoplayer/chunk/ChunkSampleSource.java
+++ b/library/src/main/java/com/google/android/exoplayer/chunk/ChunkSampleSource.java
@@ -417,7 +417,7 @@
     if (currentLoadable != null && mediaChunk == currentLoadable) {
       // Linearly interpolate partially-fetched chunk times.
       long chunkLength = mediaChunk.getLength();
-      if (chunkLength != C.LENGTH_UNBOUNDED) {
+      if (chunkLength != C.LENGTH_UNBOUNDED && chunkLength != 0) {
         return mediaChunk.startTimeUs + ((mediaChunk.endTimeUs - mediaChunk.startTimeUs) *
             mediaChunk.bytesLoaded()) / chunkLength;
       } else {
