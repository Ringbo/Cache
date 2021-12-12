diff --git a/library/src/main/java/com/google/android/exoplayer/extractor/mp3/XingSeeker.java b/library/src/main/java/com/google/android/exoplayer/extractor/mp3/XingSeeker.java
index bc548f6..bef49df 100644
--- a/library/src/main/java/com/google/android/exoplayer/extractor/mp3/XingSeeker.java
+++ b/library/src/main/java/com/google/android/exoplayer/extractor/mp3/XingSeeker.java
@@ -130,7 +130,7 @@
 
   @Override
   public long getTimeUs(long position) {
-    if (!isSeekable()) {
+    if (!isSeekable() || position < firstFramePosition) {
       return 0L;
     }
     double offsetByte = 256.0 * (position - firstFramePosition) / sizeBytes;
