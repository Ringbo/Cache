diff --git a/library/src/main/java/com/google/android/exoplayer/extractor/ExtractorSampleSource.java b/library/src/main/java/com/google/android/exoplayer/extractor/ExtractorSampleSource.java
index 7a14a5a..d57d94f 100644
--- a/library/src/main/java/com/google/android/exoplayer/extractor/ExtractorSampleSource.java
+++ b/library/src/main/java/com/google/android/exoplayer/extractor/ExtractorSampleSource.java
@@ -313,7 +313,7 @@
   @Override
   public void release() {
     Assertions.checkState(remainingReleaseCount > 0);
-    if (--remainingReleaseCount == 0) {
+    if (--remainingReleaseCount == 0 && loader != null) {
       loader.release();
       loader = null;
     }
