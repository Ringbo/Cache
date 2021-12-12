diff --git a/library/dash/src/main/java/com/google/android/exoplayer2/source/dash/DashMediaPeriod.java b/library/dash/src/main/java/com/google/android/exoplayer2/source/dash/DashMediaPeriod.java
index dd41db2..ddb655f 100644
--- a/library/dash/src/main/java/com/google/android/exoplayer2/source/dash/DashMediaPeriod.java
+++ b/library/dash/src/main/java/com/google/android/exoplayer2/source/dash/DashMediaPeriod.java
@@ -193,7 +193,7 @@
 
     ArrayList<ChunkSampleStream<DashChunkSource>> sampleStreamList = new ArrayList<>();
     ArrayList<EventSampleStream> eventSampleStreamList = new ArrayList<>();
-    for (SampleStream sampleStream : sampleStreams) {
+    for (SampleStream sampleStream : streams) {
       if (sampleStream instanceof ChunkSampleStream) {
         @SuppressWarnings("unchecked")
         ChunkSampleStream<DashChunkSource> stream =
