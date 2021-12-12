diff --git a/library/core/src/main/java/com/google/android/exoplayer2/mediacodec/MediaCodecRenderer.java b/library/core/src/main/java/com/google/android/exoplayer2/mediacodec/MediaCodecRenderer.java
index d965b66..ef7d691 100644
--- a/library/core/src/main/java/com/google/android/exoplayer2/mediacodec/MediaCodecRenderer.java
+++ b/library/core/src/main/java/com/google/android/exoplayer2/mediacodec/MediaCodecRenderer.java
@@ -1141,8 +1141,9 @@
    * @return The mode specifying when the adaptation workaround should be enabled.
    */
   private @AdaptationWorkaroundMode int codecAdaptationWorkaroundMode(String name) {
-    if (Util.SDK_INT <= 24 && "OMX.Exynos.avc.dec.secure".equals(name)
-        && (Util.MODEL.startsWith("SM-T585") || Util.MODEL.startsWith("SM-A520"))) {
+    if (Util.SDK_INT <= 25 && "OMX.Exynos.avc.dec.secure".equals(name)
+        && (Util.MODEL.startsWith("SM-T585") || Util.MODEL.startsWith("SM-A510")
+        || Util.MODEL.startsWith("SM-A520") || Util.MODEL.startsWith("SM-J700"))) {
       return ADAPTATION_WORKAROUND_MODE_ALWAYS;
     } else if (Util.SDK_INT < 24
         && ("OMX.Nvidia.h264.decode".equals(name) || "OMX.Nvidia.h264.decode.secure".equals(name))
