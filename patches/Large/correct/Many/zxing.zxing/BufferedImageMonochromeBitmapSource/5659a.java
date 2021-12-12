diff --git a/javase/src/com/google/zxing/client/j2se/BufferedImageMonochromeBitmapSource.java b/javase/src/com/google/zxing/client/j2se/BufferedImageMonochromeBitmapSource.java
index bfe97bc..dd7c584 100644
--- a/javase/src/com/google/zxing/client/j2se/BufferedImageMonochromeBitmapSource.java
+++ b/javase/src/com/google/zxing/client/j2se/BufferedImageMonochromeBitmapSource.java
@@ -53,10 +53,25 @@
   private static final int LUMINANCE_SHIFT = 8 - LUMINANCE_BITS;
   private static final int LUMINANCE_BUCKETS = 1 << LUMINANCE_BITS;
 
+  /**
+   * Creates an instance that uses the entire given image as a source of pixels to decode.
+   *
+   * @param image image to decode
+   */
   public BufferedImageMonochromeBitmapSource(BufferedImage image) {
     this(image, 0, 0, image.getWidth(), image.getHeight());
   }
 
+  /**
+   * Creates an instance that uses only a region of the given image as a source of pixels to decode.
+   *
+   * @param image image to decode a region of
+   * @param left x coordinate of leftmost pixels to decode
+   * @param top y coordinate of topmost pixels to decode
+   * @param right one more than the x coordinate of rightmost pixels to decode. That is, we will decode
+   *  pixels whose x coordinate is in [left,right)
+   * @param bottom likewise, one more than the y coordinate of the bottommost pixels to decode
+   */
   public BufferedImageMonochromeBitmapSource(BufferedImage image, int left, int top, int right, int bottom) {
     this.image = image;
     blackPoint = 0x7F;
@@ -64,7 +79,7 @@
     lastArgument = 0;
     int sourceHeight = image.getHeight();
     int sourceWidth = image.getWidth();
-    if (left < 0 || top < 0 || right >= sourceWidth || bottom >= sourceHeight || right <= left || bottom <= top) {
+    if (left < 0 || top < 0 || right > sourceWidth || bottom > sourceHeight || right <= left || bottom <= top) {
       throw new IllegalArgumentException("Invalid bounds: (" + top + ',' + left + ") (" + right + ',' + bottom + ')');
     }
     this.left = left;
