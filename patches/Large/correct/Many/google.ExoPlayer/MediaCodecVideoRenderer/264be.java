diff --git a/library/core/src/main/java/com/google/android/exoplayer2/video/MediaCodecVideoRenderer.java b/library/core/src/main/java/com/google/android/exoplayer2/video/MediaCodecVideoRenderer.java
index f5e5f7d..b0234c4 100644
--- a/library/core/src/main/java/com/google/android/exoplayer2/video/MediaCodecVideoRenderer.java
+++ b/library/core/src/main/java/com/google/android/exoplayer2/video/MediaCodecVideoRenderer.java
@@ -1180,23 +1180,35 @@
   }
 
   /**
-   * Returns whether the device is known to handle {@link DummySurface} incorrectly.
+   * Returns whether the codec is known to handle {@link DummySurface} incorrectly.
    *
    * <p>If true is returned then use of {@link DummySurface} is disabled.
+   *
+   * @param name The name of the codec.
+   * @return True if the device is known to handle {@link DummySurface} incorrectly.
    */
-  private static boolean codecNeedsDummySurfaceWorkaround(String name) {
+  protected boolean codecNeedsDummySurfaceWorkaround(String name) {
     // Work around https://github.com/google/ExoPlayer/issues/4419.
     return ("Amazon".equals(Util.MANUFACTURER) && "AFTN".equals(Util.MODEL)) // FireTV 4K
         && "OMX.amlogic.avc.decoder.awesome".equals(name);
   }
 
   /**
-   * Returns whether the device is known to implement {@link MediaCodec#setOutputSurface(Surface)}
+   * Returns whether the codec is known to implement {@link MediaCodec#setOutputSurface(Surface)}
    * incorrectly.
-   * <p>
-   * If true is returned then we fall back to releasing and re-instantiating the codec instead.
+   *
+   * <p>If true is returned then we fall back to releasing and re-instantiating the codec instead.
+   *
+   * <p>Note: This workaround should only be used if {@link MediaCodec#setOutputSurface(Surface)}
+   * doesn't work when transitioning between two real surfaces. If an issue only occurs when
+   * transitioning to or from {@link DummySurface}, then {@link
+   * #codecNeedsDummySurfaceWorkaround(String)} should be used instead.
+   *
+   * @param name The name of the codec.
+   * @return True if the device is known to implement {@link MediaCodec#setOutputSurface(Surface)}
+   *     incorrectly.
    */
-  private static boolean codecNeedsSetOutputSurfaceWorkaround(String name) {
+  protected boolean codecNeedsSetOutputSurfaceWorkaround(String name) {
     // Work around https://github.com/google/ExoPlayer/issues/3236,
     // https://github.com/google/ExoPlayer/issues/3355,
     // https://github.com/google/ExoPlayer/issues/3439,
