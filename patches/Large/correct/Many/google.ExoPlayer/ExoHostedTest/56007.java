diff --git a/playbacktests/src/main/java/com/google/android/exoplayer2/playbacktests/util/ExoHostedTest.java b/playbacktests/src/main/java/com/google/android/exoplayer2/playbacktests/util/ExoHostedTest.java
index 692aa63..b8ac1eb 100644
--- a/playbacktests/src/main/java/com/google/android/exoplayer2/playbacktests/util/ExoHostedTest.java
+++ b/playbacktests/src/main/java/com/google/android/exoplayer2/playbacktests/util/ExoHostedTest.java
@@ -311,7 +311,7 @@
   protected SimpleExoPlayer buildExoPlayer(HostActivity host, Surface surface,
       MappingTrackSelector trackSelector, DrmSessionManager drmSessionManager) {
     SimpleExoPlayer player = ExoPlayerFactory.newSimpleInstance(host, trackSelector,
-        new DefaultLoadControl(), drmSessionManager);
+        new DefaultLoadControl(), drmSessionManager, false, 0);
     player.setVideoSurface(surface);
     return player;
   }
