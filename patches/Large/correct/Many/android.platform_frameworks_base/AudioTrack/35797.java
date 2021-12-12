diff --git a/media/java/android/media/AudioTrack.java b/media/java/android/media/AudioTrack.java
index cba7e03..0a0796a 100644
--- a/media/java/android/media/AudioTrack.java
+++ b/media/java/android/media/AudioTrack.java
@@ -813,7 +813,7 @@
      *    {@link #ERROR_INVALID_OPERATION}
      */
     public int setPlaybackRate(int sampleRateInHz) {
-        if (mState == STATE_UNINITIALIZED) {
+        if (mState != STATE_INITIALIZED) {
             return ERROR_INVALID_OPERATION;
         }
         if (sampleRateInHz <= 0) {
