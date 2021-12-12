diff --git a/library/src/main/java/com/google/android/exoplayer2/source/chunk/ChunkSampleStream.java b/library/src/main/java/com/google/android/exoplayer2/source/chunk/ChunkSampleStream.java
index bb2f9b2..6de7c6e 100644
--- a/library/src/main/java/com/google/android/exoplayer2/source/chunk/ChunkSampleStream.java
+++ b/library/src/main/java/com/google/android/exoplayer2/source/chunk/ChunkSampleStream.java
@@ -251,7 +251,7 @@
 
   @Override
   public boolean continueLoading(long positionUs) {
-    if (loader.isLoading()) {
+    if (loadingFinished || loader.isLoading()) {
       return false;
     }
 
