diff --git a/core/src/processing/core/PGraphics.java b/core/src/processing/core/PGraphics.java
index 9c8195d..a4425e1 100644
--- a/core/src/processing/core/PGraphics.java
+++ b/core/src/processing/core/PGraphics.java
@@ -7352,7 +7352,7 @@
    * @param image PImage to set as background (must be same size as the sketch window)
    */
   public void background(PImage image) {
-    if ((image.pixelWidth != width) || (image.pixelHeight != height)) {
+    if ((image.pixelWidth != pixelWidth) || (image.pixelHeight != pixelHeight)) {
       throw new RuntimeException(ERROR_BACKGROUND_IMAGE_SIZE);
     }
     if ((image.format != RGB) && (image.format != ARGB)) {
