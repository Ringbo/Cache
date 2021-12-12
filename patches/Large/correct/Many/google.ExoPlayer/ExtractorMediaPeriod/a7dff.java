diff --git a/library/src/main/java/com/google/android/exoplayer2/source/ExtractorMediaPeriod.java b/library/src/main/java/com/google/android/exoplayer2/source/ExtractorMediaPeriod.java
index 3b18a06..13f3346 100644
--- a/library/src/main/java/com/google/android/exoplayer2/source/ExtractorMediaPeriod.java
+++ b/library/src/main/java/com/google/android/exoplayer2/source/ExtractorMediaPeriod.java
@@ -231,7 +231,7 @@
 
   @Override
   public boolean continueLoading(long playbackPositionUs) {
-    if (loadingFinished) {
+    if (loadingFinished || (prepared && enabledTrackCount == 0)) {
       return false;
     }
     boolean continuedLoading = loadCondition.open();
