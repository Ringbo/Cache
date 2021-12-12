diff --git a/core/src/processing/opengl/PGraphicsOpenGL.java b/core/src/processing/opengl/PGraphicsOpenGL.java
index 8965eb5..de8a1e7 100644
--- a/core/src/processing/opengl/PGraphicsOpenGL.java
+++ b/core/src/processing/opengl/PGraphicsOpenGL.java
@@ -5991,7 +5991,7 @@
 
   protected void drawPixels(int x, int y, int w, int h) {
     int f = (int)getPixelScale();
-    int len = f * w * h;
+    int len = f * w * f * h;
     if (nativePixels == null || nativePixels.length < len) {
       nativePixels = new int[len];
       nativePixelBuffer = PGL.allocateIntBuffer(nativePixels);
