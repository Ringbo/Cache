diff --git a/library/dash/src/main/java/com/google/android/exoplayer2/source/dash/DashMediaPeriod.java b/library/dash/src/main/java/com/google/android/exoplayer2/source/dash/DashMediaPeriod.java
index bc6bbc7..f500a53 100644
--- a/library/dash/src/main/java/com/google/android/exoplayer2/source/dash/DashMediaPeriod.java
+++ b/library/dash/src/main/java/com/google/android/exoplayer2/source/dash/DashMediaPeriod.java
@@ -198,7 +198,7 @@
 
     ArrayList<ChunkSampleStream<DashChunkSource>> sampleStreamList = new ArrayList<>();
     ArrayList<EventSampleStream> eventSampleStreamList = new ArrayList<>();
-    for (SampleStream sampleStream : sampleStreams) {
+    for (SampleStream sampleStream : streams) {
       if (sampleStream instanceof ChunkSampleStream) {
         @SuppressWarnings("unchecked")
         ChunkSampleStream<DashChunkSource> stream =
