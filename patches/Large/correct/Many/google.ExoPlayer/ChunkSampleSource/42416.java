diff --git a/library/src/main/java/com/google/android/exoplayer/chunk/ChunkSampleSource.java b/library/src/main/java/com/google/android/exoplayer/chunk/ChunkSampleSource.java
index c943b7c..71c5773 100644
--- a/library/src/main/java/com/google/android/exoplayer/chunk/ChunkSampleSource.java
+++ b/library/src/main/java/com/google/android/exoplayer/chunk/ChunkSampleSource.java
@@ -219,7 +219,7 @@
     boolean haveSamples = !sampleQueue.isEmpty();
     BaseMediaChunk currentChunk = mediaChunks.getFirst();
     while (haveSamples && mediaChunks.size() > 1
-        && mediaChunks.get(1).getFirstSampleIndex() == sampleQueue.getReadIndex()) {
+        && mediaChunks.get(1).getFirstSampleIndex() <= sampleQueue.getReadIndex()) {
       mediaChunks.removeFirst();
       currentChunk = mediaChunks.getFirst();
     }
