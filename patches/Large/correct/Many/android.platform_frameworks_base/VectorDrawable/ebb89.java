diff --git a/graphics/java/android/graphics/drawable/VectorDrawable.java b/graphics/java/android/graphics/drawable/VectorDrawable.java
index 5f1dcec..c5e53da 100644
--- a/graphics/java/android/graphics/drawable/VectorDrawable.java
+++ b/graphics/java/android/graphics/drawable/VectorDrawable.java
@@ -408,7 +408,7 @@
      * @hide
      */
     public float getPixelSize() {
-        if (mVectorState == null && mVectorState.mVPathRenderer == null ||
+        if (mVectorState == null || mVectorState.mVPathRenderer == null ||
                 mVectorState.mVPathRenderer.mBaseWidth == 0 ||
                 mVectorState.mVPathRenderer.mBaseHeight == 0 ||
                 mVectorState.mVPathRenderer.mViewportHeight == 0 ||
