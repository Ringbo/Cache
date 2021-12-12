diff --git a/graphics/java/android/graphics/drawable/VectorDrawable.java b/graphics/java/android/graphics/drawable/VectorDrawable.java
index 8b0f635..dd26019 100644
--- a/graphics/java/android/graphics/drawable/VectorDrawable.java
+++ b/graphics/java/android/graphics/drawable/VectorDrawable.java
@@ -396,7 +396,7 @@
      * @hide
      */
     public float getPixelSize() {
-        if (mVectorState == null && mVectorState.mVPathRenderer == null ||
+        if (mVectorState == null || mVectorState.mVPathRenderer == null ||
                 mVectorState.mVPathRenderer.mBaseWidth == 0 ||
                 mVectorState.mVPathRenderer.mBaseHeight == 0 ||
                 mVectorState.mVPathRenderer.mViewportHeight == 0 ||
