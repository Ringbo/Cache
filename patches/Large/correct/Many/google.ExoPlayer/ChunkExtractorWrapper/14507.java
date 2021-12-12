diff --git a/library/src/main/java/com/google/android/exoplayer2/source/chunk/ChunkExtractorWrapper.java b/library/src/main/java/com/google/android/exoplayer2/source/chunk/ChunkExtractorWrapper.java
index 489f63b..2a641b8 100644
--- a/library/src/main/java/com/google/android/exoplayer2/source/chunk/ChunkExtractorWrapper.java
+++ b/library/src/main/java/com/google/android/exoplayer2/source/chunk/ChunkExtractorWrapper.java
@@ -88,7 +88,7 @@
       extractorInitialized = true;
     } else {
       extractor.seek(0, 0);
-      if (sampleFormat != null) {
+      if (sampleFormat != null && trackOutput != null) {
         trackOutput.format(sampleFormat);
       }
     }
