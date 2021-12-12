diff --git a/main/src/main/java/com/google/android/apps/muzei/render/MuzeiBlurRenderer.java b/main/src/main/java/com/google/android/apps/muzei/render/MuzeiBlurRenderer.java
index dc15430..d08f9ea 100644
--- a/main/src/main/java/com/google/android/apps/muzei/render/MuzeiBlurRenderer.java
+++ b/main/src/main/java/com/google/android/apps/muzei/render/MuzeiBlurRenderer.java
@@ -312,7 +312,8 @@
         }
 
         public void load(BitmapRegionLoader bitmapRegionLoader) {
-            mHasBitmap = (bitmapRegionLoader != null);
+            mHasBitmap = bitmapRegionLoader != null
+                    && bitmapRegionLoader.getWidth() != 0 && bitmapRegionLoader.getHeight() != 0;
             mBitmapAspectRatio = mHasBitmap
                     ? bitmapRegionLoader.getWidth() * 1f / bitmapRegionLoader.getHeight()
                     : 1f;
@@ -321,7 +322,7 @@
 
             destroyPictures();
 
-            if (bitmapRegionLoader != null) {
+            if (mHasBitmap) {
                 BitmapFactory.Options options = new BitmapFactory.Options();
                 Rect rect = new Rect();
                 int originalWidth = bitmapRegionLoader.getWidth();
@@ -367,7 +368,8 @@
                     rect.set(0, 0, originalWidth, originalHeight);
                     tempBitmap = bitmapRegionLoader.decodeRegion(rect, options);
 
-                    if (tempBitmap != null) {
+                    if (tempBitmap != null
+                            && tempBitmap.getWidth() != 0 && tempBitmap.getHeight() != 0) {
                         // Next, create a scaled down version of the bitmap so that the blur radius
                         // looks appropriate (tempBitmap will likely be bigger than the final
                         // blurred bitmap, and thus the blur may look smaller if we just used
