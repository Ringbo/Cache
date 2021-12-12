diff --git a/library/core/src/main/java/com/google/android/exoplayer2/audio/DefaultAudioSink.java b/library/core/src/main/java/com/google/android/exoplayer2/audio/DefaultAudioSink.java
index 6d12dc6..ee0fd94 100644
--- a/library/core/src/main/java/com/google/android/exoplayer2/audio/DefaultAudioSink.java
+++ b/library/core/src/main/java/com/google/android/exoplayer2/audio/DefaultAudioSink.java
@@ -590,7 +590,7 @@
       // position for a short time after is has been released. Avoid writing data until the playback
       // head position actually returns to zero.
       if (audioTrack.getPlayState() == PLAYSTATE_STOPPED
-          && audioTrackUtil.getPlaybackHeadPosition() != 0) {
+          && audioTrack.getPlaybackHeadPosition() != 0) {
         return false;
       }
     }
