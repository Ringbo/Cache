diff --git a/platform/platform-api/src/com/intellij/util/ui/RegionPainter.java b/platform/platform-api/src/com/intellij/util/ui/RegionPainter.java
index 296f60a..5fb8f81 100644
--- a/platform/platform-api/src/com/intellij/util/ui/RegionPainter.java
+++ b/platform/platform-api/src/com/intellij/util/ui/RegionPainter.java
@@ -102,7 +102,7 @@
 
     @Override
     public void paint(Graphics2D g, int x, int y, int width, int height, Object object) {
-      if (width > 0 && width > 0) {
+      if (width > 0 && height > 0) {
         if (myImage == null || width != myImage.getWidth() || height != myImage.getHeight()) {
           myImage = createImage(width, height);
         }
