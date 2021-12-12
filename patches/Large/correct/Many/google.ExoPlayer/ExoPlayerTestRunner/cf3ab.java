diff --git a/testutils/src/main/java/com/google/android/exoplayer2/testutil/ExoPlayerTestRunner.java b/testutils/src/main/java/com/google/android/exoplayer2/testutil/ExoPlayerTestRunner.java
index 591e63d..30e0214 100644
--- a/testutils/src/main/java/com/google/android/exoplayer2/testutil/ExoPlayerTestRunner.java
+++ b/testutils/src/main/java/com/google/android/exoplayer2/testutil/ExoPlayerTestRunner.java
@@ -517,7 +517,7 @@
 
   @Override
   public void onPlayerError(ExoPlaybackException error) {
-    handleException(exception);
+    handleException(error);
   }
 
   @Override
