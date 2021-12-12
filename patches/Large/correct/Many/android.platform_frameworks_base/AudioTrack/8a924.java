diff --git a/media/java/android/media/AudioTrack.java b/media/java/android/media/AudioTrack.java
index f37cbe5..547d87e 100644
--- a/media/java/android/media/AudioTrack.java
+++ b/media/java/android/media/AudioTrack.java
@@ -1070,7 +1070,7 @@
      *    {@link #ERROR_INVALID_OPERATION}
      */
     public int setPlaybackHeadPosition(int positionInFrames) {
-        if (mDataLoadMode == MODE_STREAM || mState != STATE_INITIALIZED ||
+        if (mDataLoadMode == MODE_STREAM || mState == STATE_UNINITIALIZED ||
                 getPlayState() == PLAYSTATE_PLAYING) {
             return ERROR_INVALID_OPERATION;
         }
@@ -1100,7 +1100,7 @@
      *    {@link #ERROR_INVALID_OPERATION}
      */
     public int setLoopPoints(int startInFrames, int endInFrames, int loopCount) {
-        if (mDataLoadMode == MODE_STREAM || mState != STATE_INITIALIZED ||
+        if (mDataLoadMode == MODE_STREAM || mState == STATE_UNINITIALIZED ||
                 getPlayState() == PLAYSTATE_PLAYING) {
             return ERROR_INVALID_OPERATION;
         }
