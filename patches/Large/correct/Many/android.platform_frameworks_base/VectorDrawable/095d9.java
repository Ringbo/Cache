diff --git a/graphics/java/android/graphics/drawable/VectorDrawable.java b/graphics/java/android/graphics/drawable/VectorDrawable.java
index b827682..ff258dd 100644
--- a/graphics/java/android/graphics/drawable/VectorDrawable.java
+++ b/graphics/java/android/graphics/drawable/VectorDrawable.java
@@ -966,7 +966,7 @@
 
             if (vPath.isClipPath()) {
                 mRenderPath.addPath(path, mFinalPathMatrix);
-                canvas.clipPath(mRenderPath, Region.Op.REPLACE);
+                canvas.clipPath(mRenderPath);
             } else {
                 VFullPath fullPath = (VFullPath) vPath;
                 if (fullPath.mTrimPathStart != 0.0f || fullPath.mTrimPathEnd != 1.0f) {
