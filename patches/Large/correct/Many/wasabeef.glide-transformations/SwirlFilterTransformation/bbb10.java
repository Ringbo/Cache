diff --git a/transformations/src/main/java/jp/wasabeef/glide/transformations/gpu/SwirlFilterTransformation.java b/transformations/src/main/java/jp/wasabeef/glide/transformations/gpu/SwirlFilterTransformation.java
index cc298f9..acc21fd 100644
--- a/transformations/src/main/java/jp/wasabeef/glide/transformations/gpu/SwirlFilterTransformation.java
+++ b/transformations/src/main/java/jp/wasabeef/glide/transformations/gpu/SwirlFilterTransformation.java
@@ -64,10 +64,10 @@
         gpuImage.setImage(source);
         GPUImageSwirlFilter filter = new GPUImageSwirlFilter();
         if (mRadius != 0) {
-            filter.setAngle(mAngle);
+            filter.setRadius(mRadius);
         }
         if (mAngle != 0) {
-            filter.setRadius(mAngle);
+            filter.setAngle(mAngle);
         }
         if (mCenter != null) {
             filter.setCenter(mCenter);
