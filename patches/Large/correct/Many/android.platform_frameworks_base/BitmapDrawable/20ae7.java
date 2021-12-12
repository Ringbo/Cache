diff --git a/graphics/java/android/graphics/drawable/BitmapDrawable.java b/graphics/java/android/graphics/drawable/BitmapDrawable.java
index 40adf94..e52d778 100644
--- a/graphics/java/android/graphics/drawable/BitmapDrawable.java
+++ b/graphics/java/android/graphics/drawable/BitmapDrawable.java
@@ -602,9 +602,9 @@
     @Override
     public void getOutline(@NonNull Outline outline) {
         super.getOutline(outline);
-        if (mBitmapState.mBitmap.hasAlpha()) {
-            // Bitmaps with alpha can't report a non-0 alpha,
-            // since they may not fill their rectangular bounds
+        if (mBitmapState.mBitmap == null || mBitmapState.mBitmap.hasAlpha()) {
+            // Only opaque Bitmaps can report a non-0 alpha,
+            // since only they are guaranteed to fill their bounds
             outline.setAlpha(0.0f);
         }
     }
