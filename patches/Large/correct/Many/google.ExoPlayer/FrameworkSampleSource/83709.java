diff --git a/library/src/main/java/com/google/android/exoplayer/FrameworkSampleSource.java b/library/src/main/java/com/google/android/exoplayer/FrameworkSampleSource.java
index afe735c..bfc4ca6 100644
--- a/library/src/main/java/com/google/android/exoplayer/FrameworkSampleSource.java
+++ b/library/src/main/java/com/google/android/exoplayer/FrameworkSampleSource.java
@@ -234,7 +234,7 @@
   @Override
   public void release() {
     Assertions.checkState(remainingReleaseCount > 0);
-    if (--remainingReleaseCount == 0) {
+    if (--remainingReleaseCount == 0 && extractor != null) {
       extractor.release();
       extractor = null;
     }
