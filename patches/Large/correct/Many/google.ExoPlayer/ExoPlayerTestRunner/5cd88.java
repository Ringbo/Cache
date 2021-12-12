diff --git a/testutils/src/main/java/com/google/android/exoplayer2/testutil/ExoPlayerTestRunner.java b/testutils/src/main/java/com/google/android/exoplayer2/testutil/ExoPlayerTestRunner.java
index 5ada65e..759af41 100644
--- a/testutils/src/main/java/com/google/android/exoplayer2/testutil/ExoPlayerTestRunner.java
+++ b/testutils/src/main/java/com/google/android/exoplayer2/testutil/ExoPlayerTestRunner.java
@@ -567,7 +567,7 @@
 
   @Override
   public void onPlayerError(ExoPlaybackException error) {
-    handleException(exception);
+    handleException(error);
   }
 
   @Override
