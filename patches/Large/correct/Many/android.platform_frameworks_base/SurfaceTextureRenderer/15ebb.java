diff --git a/core/java/android/hardware/camera2/legacy/SurfaceTextureRenderer.java b/core/java/android/hardware/camera2/legacy/SurfaceTextureRenderer.java
index a0a0716..615b2c8 100644
--- a/core/java/android/hardware/camera2/legacy/SurfaceTextureRenderer.java
+++ b/core/java/android/hardware/camera2/legacy/SurfaceTextureRenderer.java
@@ -269,21 +269,23 @@
             throw new IllegalStateException("Illegal intermediate texture with dimension of 0");
         }
 
-        // Letterbox or pillerbox output dimensions into intermediate dimensions.
+        // Letterbox or pillar-box output dimensions into intermediate dimensions.
         RectF intermediate = new RectF(/*left*/0, /*top*/0, /*right*/texWidth, /*bottom*/texHeight);
         RectF output = new RectF(/*left*/0, /*top*/0, /*right*/width, /*bottom*/height);
         android.graphics.Matrix boxingXform = new android.graphics.Matrix();
         boxingXform.setRectToRect(output, intermediate, android.graphics.Matrix.ScaleToFit.CENTER);
         boxingXform.mapRect(output);
 
-        // Find scaling factor from pillerboxed/letterboxed output dimensions to intermediate
+        // Find scaling factor from pillar-boxed/letter-boxed output dimensions to intermediate
         // buffer dimensions.
         float scaleX = intermediate.width() / output.width();
         float scaleY = intermediate.height() / output.height();
 
-        // Scale opposite dimension in clip coordinates so output is letterboxed/pillerboxed into
-        // the intermediate dimensions (rather than vice-versa).
-        Matrix.scaleM(mMVPMatrix, /*offset*/0, /*x*/scaleY, /*y*/scaleX, /*z*/1);
+        // Intermediate texture is implicitly scaled to 'fill' the output dimensions in clip space
+        // coordinates in the shader.  To avoid stretching, we need to scale the larger dimension
+        // of the intermediate buffer so that the output buffer is actually letter-boxed
+        // or pillar-boxed into the intermediate buffer after clipping.
+        Matrix.scaleM(mMVPMatrix, /*offset*/0, /*x*/scaleX, /*y*/scaleY, /*z*/1);
 
         if (DEBUG) {
             Log.d(TAG, "Scaling factors (S_x = " + scaleX + ",S_y = " + scaleY + ") used for " +
