diff --git a/graphics/java/android/graphics/drawable/VectorDrawable.java b/graphics/java/android/graphics/drawable/VectorDrawable.java
index dbe2f3f..f4df14e 100644
--- a/graphics/java/android/graphics/drawable/VectorDrawable.java
+++ b/graphics/java/android/graphics/drawable/VectorDrawable.java
@@ -974,7 +974,7 @@
 
             if (vPath.isClipPath()) {
                 mRenderPath.addPath(path, mFinalPathMatrix);
-                canvas.clipPath(mRenderPath, Region.Op.REPLACE);
+                canvas.clipPath(mRenderPath);
             } else {
                 VFullPath fullPath = (VFullPath) vPath;
                 if (fullPath.mTrimPathStart != 0.0f || fullPath.mTrimPathEnd != 1.0f) {
