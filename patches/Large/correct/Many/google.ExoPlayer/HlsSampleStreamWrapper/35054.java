diff --git a/library/src/main/java/com/google/android/exoplayer2/source/hls/HlsSampleStreamWrapper.java b/library/src/main/java/com/google/android/exoplayer2/source/hls/HlsSampleStreamWrapper.java
index 1bcc7fe..863b06e 100644
--- a/library/src/main/java/com/google/android/exoplayer2/source/hls/HlsSampleStreamWrapper.java
+++ b/library/src/main/java/com/google/android/exoplayer2/source/hls/HlsSampleStreamWrapper.java
@@ -329,7 +329,7 @@
 
   @Override
   public boolean continueLoading(long positionUs) {
-    if (loader.isLoading()) {
+    if (loadingFinished || loader.isLoading()) {
       return false;
     }
 
