diff --git a/library/src/main/java/com/google/android/exoplayer2/source/ConcatenatingMediaSource.java b/library/src/main/java/com/google/android/exoplayer2/source/ConcatenatingMediaSource.java
index 59466e1..5c4bdf4 100644
--- a/library/src/main/java/com/google/android/exoplayer2/source/ConcatenatingMediaSource.java
+++ b/library/src/main/java/com/google/android/exoplayer2/source/ConcatenatingMediaSource.java
@@ -226,7 +226,7 @@
     @Override
     public long getWindowOffsetInFirstPeriodUs(int windowIndex) {
       int sourceIndex = getSourceIndexForWindow(windowIndex);
-      int firstWindowIndexInSource = getFirstPeriodIndexInSource(sourceIndex);
+      int firstWindowIndexInSource = getFirstWindowIndexInSource(sourceIndex);
       return timelines[sourceIndex].getWindowOffsetInFirstPeriodUs(
           windowIndex - firstWindowIndexInSource);
     }
