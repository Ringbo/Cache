diff --git a/playbacktests/src/main/java/com/google/android/exoplayer2/playbacktests/util/DebugSimpleExoPlayer.java b/playbacktests/src/main/java/com/google/android/exoplayer2/playbacktests/util/DebugSimpleExoPlayer.java
index 6620c0d..e279bc8 100644
--- a/playbacktests/src/main/java/com/google/android/exoplayer2/playbacktests/util/DebugSimpleExoPlayer.java
+++ b/playbacktests/src/main/java/com/google/android/exoplayer2/playbacktests/util/DebugSimpleExoPlayer.java
@@ -49,7 +49,7 @@
       @ExtensionRendererMode int extensionRendererMode, VideoRendererEventListener eventListener,
       long allowedVideoJoiningTimeMs, ArrayList<Renderer> out) {
     out.add(new DebugMediaCodecVideoRenderer(context, MediaCodecSelector.DEFAULT,
-        allowedVideoJoiningTimeMs, mainHandler, eventListener,
+        allowedVideoJoiningTimeMs, mainHandler, drmSessionManager, eventListener,
         MAX_DROPPED_VIDEO_FRAME_COUNT_TO_NOTIFY));
   }
 
@@ -68,10 +68,12 @@
     private int bufferCount;
 
     public DebugMediaCodecVideoRenderer(Context context, MediaCodecSelector mediaCodecSelector,
-        long allowedJoiningTimeMs, Handler eventHandler, VideoRendererEventListener eventListener,
+        long allowedJoiningTimeMs, Handler eventHandler,
+        DrmSessionManager<FrameworkMediaCrypto> drmSessionManager,
+        VideoRendererEventListener eventListener,
         int maxDroppedFrameCountToNotify) {
-      super(context, mediaCodecSelector, allowedJoiningTimeMs, null, false, eventHandler,
-          eventListener, maxDroppedFrameCountToNotify);
+      super(context, mediaCodecSelector, allowedJoiningTimeMs, drmSessionManager, false,
+          eventHandler, eventListener, maxDroppedFrameCountToNotify);
       startIndex = 0;
       queueSize = 0;
     }
