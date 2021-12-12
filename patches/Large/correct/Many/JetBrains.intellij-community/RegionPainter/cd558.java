diff --git a/platform/util/src/com/intellij/util/ui/RegionPainter.java b/platform/util/src/com/intellij/util/ui/RegionPainter.java
index 798e77f..5426958 100644
--- a/platform/util/src/com/intellij/util/ui/RegionPainter.java
+++ b/platform/util/src/com/intellij/util/ui/RegionPainter.java
@@ -134,7 +134,7 @@
     @Override
     public void paint(Graphics2D g, int x, int y, int width, int height, Object object) {
       if (width > 0 && height > 0) {
-        if (myImage == null || width != ImageUtil.getUserWidth(myImage) || height != ImageUtil.getRealHeight(myImage)) {
+        if (myImage == null || width != ImageUtil.getUserWidth(myImage) || height != ImageUtil.getUserHeight(myImage)) {
           myImage = createImage(width, height);
         }
         else if (myImage != null) {
