diff --git a/library/src/main/java/com/google/android/exoplayer/MediaCodecVideoTrackRenderer.java b/library/src/main/java/com/google/android/exoplayer/MediaCodecVideoTrackRenderer.java
index a5ea858..8d3642b 100644
--- a/library/src/main/java/com/google/android/exoplayer/MediaCodecVideoTrackRenderer.java
+++ b/library/src/main/java/com/google/android/exoplayer/MediaCodecVideoTrackRenderer.java
@@ -247,7 +247,7 @@
       } else {
         // TODO[REFACTOR]: We should probably assume that we can decode at least the resolution of
         // the display, or the camera, as a sanity check?
-        decoderCapable = format.width * format.height > MediaCodecUtil.maxH264DecodableFrameSize();
+        decoderCapable = format.width * format.height <= MediaCodecUtil.maxH264DecodableFrameSize();
       }
     } else {
       // We don't know any better, so assume true.
