diff --git a/demos/main/src/main/java/com/google/android/exoplayer2/demo/PlayerActivity.java b/demos/main/src/main/java/com/google/android/exoplayer2/demo/PlayerActivity.java
index 98df115..57444d0 100644
--- a/demos/main/src/main/java/com/google/android/exoplayer2/demo/PlayerActivity.java
+++ b/demos/main/src/main/java/com/google/android/exoplayer2/demo/PlayerActivity.java
@@ -340,7 +340,8 @@
       lastSeenTrackGroupArray = null;
       eventLogger = new EventLogger(trackSelector);
 
-      player = ExoPlayerFactory.newSimpleInstance(renderersFactory, trackSelector);
+      player =
+          ExoPlayerFactory.newSimpleInstance(renderersFactory, trackSelector, drmSessionManager);
       player.addListener(new PlayerEventListener());
       player.addListener(eventLogger);
       player.addMetadataOutput(eventLogger);
