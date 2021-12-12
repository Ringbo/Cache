diff --git a/core/src/processing/opengl/PJOGL.java b/core/src/processing/opengl/PJOGL.java
index 1ecb147..da19a93 100644
--- a/core/src/processing/opengl/PJOGL.java
+++ b/core/src/processing/opengl/PJOGL.java
@@ -1935,7 +1935,7 @@
 
   @Override
   public void copyTexSubImage2D(int target, int level, int xOffset, int yOffset, int x, int y, int width, int height) {
-    gl.glCopyTexSubImage2D(target, level, x, y, xOffset, xOffset, width, height);
+    gl.glCopyTexSubImage2D(target, level, x, y, xOffset, yOffset, width, height);
   }
 
   @Override
