diff --git a/graphics/java/android/graphics/drawable/GradientDrawable.java b/graphics/java/android/graphics/drawable/GradientDrawable.java
index bcc354c..3dbd2a9 100644
--- a/graphics/java/android/graphics/drawable/GradientDrawable.java
+++ b/graphics/java/android/graphics/drawable/GradientDrawable.java
@@ -699,7 +699,7 @@
             float rad = mStrokePaint.getStrokeWidth();
             canvas.saveLayer(mRect.left - rad, mRect.top - rad,
                              mRect.right + rad, mRect.bottom + rad,
-                             mLayerPaint, Canvas.HAS_ALPHA_LAYER_SAVE_FLAG);
+                             mLayerPaint);
 
             // don't perform the filter in our individual paints
             // since the layer will do it for us
