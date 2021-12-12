diff --git a/ReactAndroid/src/main/java/com/facebook/react/views/image/ReactImageView.java b/ReactAndroid/src/main/java/com/facebook/react/views/image/ReactImageView.java
index a30d1c8..09de651 100644
--- a/ReactAndroid/src/main/java/com/facebook/react/views/image/ReactImageView.java
+++ b/ReactAndroid/src/main/java/com/facebook/react/views/image/ReactImageView.java
@@ -87,14 +87,13 @@
   private class RoundedCornerPostprocessor extends BasePostprocessor {
 
     void getRadii(Bitmap source, float[] computedCornerRadii, float[] mappedRadii) {
-        ScalingUtils.getTransform(
+      mScaleType.getTransform(
             sMatrix,
             new Rect(0, 0, source.getWidth(), source.getHeight()),
             source.getWidth(),
             source.getHeight(),
             0.0f,
-            0.0f,
-            mScaleType);
+            0.0f);
         sMatrix.invert(sInverse);
 
         mappedRadii[0] = sInverse.mapRadius(computedCornerRadii[0]);
