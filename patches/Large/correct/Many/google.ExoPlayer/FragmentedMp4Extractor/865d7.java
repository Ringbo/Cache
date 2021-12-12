diff --git a/library/core/src/main/java/com/google/android/exoplayer2/extractor/mp4/FragmentedMp4Extractor.java b/library/core/src/main/java/com/google/android/exoplayer2/extractor/mp4/FragmentedMp4Extractor.java
index 6dcae9c..6b2077e 100644
--- a/library/core/src/main/java/com/google/android/exoplayer2/extractor/mp4/FragmentedMp4Extractor.java
+++ b/library/core/src/main/java/com/google/android/exoplayer2/extractor/mp4/FragmentedMp4Extractor.java
@@ -815,7 +815,7 @@
         // here, because unsigned integers will still be parsed correctly (unless their top bit is
         // set, which is never true in practice because sample offsets are always small).
         int sampleOffset = trun.readInt();
-        sampleCompositionTimeOffsetTable[i] = (int) ((sampleOffset * 1000) / timescale);
+        sampleCompositionTimeOffsetTable[i] = (int) ((sampleOffset * 1000L) / timescale);
       } else {
         sampleCompositionTimeOffsetTable[i] = 0;
       }
