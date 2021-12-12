diff --git a/media/java/android/media/MediaPlayer.java b/media/java/android/media/MediaPlayer.java
index 706258a..2c16b5e 100644
--- a/media/java/android/media/MediaPlayer.java
+++ b/media/java/android/media/MediaPlayer.java
@@ -3128,7 +3128,7 @@
                 if (refreshTime ||
                         nanoTime >= mLastNanoTime + MAX_NS_WITHOUT_POSITION_CHECK) {
                     try {
-                        mLastTimeUs = mPlayer.getCurrentPosition() * 1000;
+                        mLastTimeUs = mPlayer.getCurrentPosition() * 1000L;
                         mPaused = !mPlayer.isPlaying();
                         if (DEBUG) Log.v(TAG, (mPaused ? "paused" : "playing") + " at " + mLastTimeUs);
                     } catch (IllegalStateException e) {
