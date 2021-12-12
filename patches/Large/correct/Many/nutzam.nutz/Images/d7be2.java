diff --git a/src/org/nutz/img/Images.java b/src/org/nutz/img/Images.java
index c9c4e3f..d380fdc 100644
--- a/src/org/nutz/img/Images.java
+++ b/src/org/nutz/img/Images.java
@@ -226,7 +226,7 @@
      */
     public static BufferedImage zoomScale(BufferedImage im, int w, int h, Color bgColor) {
         if (w == -1 || h == -1) {
-            return zoomScale(im, w, h);
+            return scale(im, w, h);
         }
 
         // 检查背景颜色
