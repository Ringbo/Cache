diff --git a/library/core/src/main/java/com/google/android/exoplayer2/source/ExtractorMediaPeriod.java b/library/core/src/main/java/com/google/android/exoplayer2/source/ExtractorMediaPeriod.java
index 8a35034..189391f 100644
--- a/library/core/src/main/java/com/google/android/exoplayer2/source/ExtractorMediaPeriod.java
+++ b/library/core/src/main/java/com/google/android/exoplayer2/source/ExtractorMediaPeriod.java
@@ -217,7 +217,7 @@
         streamResetFlags[i] = true;
         // If there's still a chance of avoiding a seek, try and seek within the sample queue.
         if (!seekRequired) {
-          SampleQueue sampleQueue = sampleQueues[i];
+          SampleQueue sampleQueue = sampleQueues[track];
           sampleQueue.rewind();
           seekRequired = !sampleQueue.advanceTo(positionUs, true, true)
               && sampleQueue.getReadIndex() != 0;
