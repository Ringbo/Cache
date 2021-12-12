diff --git a/library/src/main/java/com/google/android/exoplayer/audio/AudioTrack.java b/library/src/main/java/com/google/android/exoplayer/audio/AudioTrack.java
index a5bc408..c973a2c 100644
--- a/library/src/main/java/com/google/android/exoplayer/audio/AudioTrack.java
+++ b/library/src/main/java/com/google/android/exoplayer/audio/AudioTrack.java
@@ -449,7 +449,7 @@
       // This is the first time we've seen this {@code buffer}.
       // Note: presentationTimeUs corresponds to the end of the sample, not the start.
       long bufferStartTime = presentationTimeUs - framesToDurationUs(bytesToFrames(size));
-      if (startMediaTimeUs == START_NOT_SET) {
+      if (startMediaTimeState == START_NOT_SET) {
         startMediaTimeUs = Math.max(0, bufferStartTime);
         startMediaTimeState = START_IN_SYNC;
       } else {
@@ -573,7 +573,7 @@
     if (isInitialized()) {
       submittedBytes = 0;
       temporaryBufferSize = 0;
-      startMediaTimeUs = START_NOT_SET;
+      startMediaTimeState = START_NOT_SET;
       latencyUs = 0;
       resetSyncParams();
       int playState = audioTrack.getPlayState();
@@ -623,7 +623,7 @@
 
   /** Returns whether {@link #getCurrentPositionUs} can return the current playback position. */
   private boolean hasCurrentPositionUs() {
-    return isInitialized() && startMediaTimeUs != START_NOT_SET;
+    return isInitialized() && startMediaTimeState != START_NOT_SET;
   }
 
   /** Updates the audio track latency and playback position parameters. */
