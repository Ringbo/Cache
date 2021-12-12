diff --git a/tools/layoutlib/bridge/src/android/view/ShadowPainter.java b/tools/layoutlib/bridge/src/android/view/ShadowPainter.java
index c734ea1..f09fffd 100644
--- a/tools/layoutlib/bridge/src/android/view/ShadowPainter.java
+++ b/tools/layoutlib/bridge/src/android/view/ShadowPainter.java
@@ -34,12 +34,15 @@
      * new image. This method attempts to mimic the same visual characteristics as the rectangular
      * shadow painting methods in this class, {@link #createRectangularDropShadow(java.awt.image.BufferedImage)}
      * and {@link #createSmallRectangularDropShadow(java.awt.image.BufferedImage)}.
+     * <p/>
+     * If shadowSize is less or equals to 1, no shadow will be painted and the source image will be
+     * returned instead.
      *
      * @param source the source image
      * @param shadowSize the size of the shadow, normally {@link #SHADOW_SIZE or {@link
      * #SMALL_SHADOW_SIZE}}
      *
-     * @return a new image with the shadow painted in
+     * @return an image with the shadow painted in or the source image if shadowSize <= 1
      */
     @NonNull
     public static BufferedImage createDropShadow(BufferedImage source, int shadowSize) {
@@ -60,12 +63,13 @@
      * @param shadowOpacity the opacity of the shadow, with 0=transparent and 1=opaque
      * @param shadowRgb the RGB int to use for the shadow color
      *
-     * @return a new image with the source image on top of its shadow
+     * @return a new image with the source image on top of its shadow when shadowSize > 0 or the
+     * source image otherwise
      */
     @SuppressWarnings({"SuspiciousNameCombination", "UnnecessaryLocalVariable"})  // Imported code
     public static BufferedImage createDropShadow(BufferedImage source, int shadowSize,
             float shadowOpacity, int shadowRgb) {
-        if (shadowSize == 0) {
+        if (shadowSize <= 0) {
             return source;
         }
 
