diff --git a/ReactAndroid/src/main/java/com/facebook/react/views/image/ReactImageView.java b/ReactAndroid/src/main/java/com/facebook/react/views/image/ReactImageView.java
index be57d79..36fa511 100644
--- a/ReactAndroid/src/main/java/com/facebook/react/views/image/ReactImageView.java
+++ b/ReactAndroid/src/main/java/com/facebook/react/views/image/ReactImageView.java
@@ -74,14 +74,13 @@
   private class RoundedCornerPostprocessor extends BasePostprocessor {
 
     float getRadius(Bitmap source) {
-        ScalingUtils.getTransform(
+      mScaleType.getTransform(
             sMatrix,
             new Rect(0, 0, source.getWidth(), source.getHeight()),
             source.getWidth(),
             source.getHeight(),
             0.0f,
-            0.0f,
-            mScaleType);
+          0.0f);
         sMatrix.invert(sInverse);
         return sInverse.mapRadius(mBorderRadius);
     }
