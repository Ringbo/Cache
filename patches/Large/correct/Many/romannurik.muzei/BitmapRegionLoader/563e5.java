diff --git a/main/src/main/java/com/google/android/apps/muzei/render/BitmapRegionLoader.java b/main/src/main/java/com/google/android/apps/muzei/render/BitmapRegionLoader.java
index 180566d..956ee94 100644
--- a/main/src/main/java/com/google/android/apps/muzei/render/BitmapRegionLoader.java
+++ b/main/src/main/java/com/google/android/apps/muzei/render/BitmapRegionLoader.java
@@ -119,7 +119,7 @@
             return null;
         }
         Bitmap bitmap = mBitmapRegionDecoder.decodeRegion(mTempRect, options);
-        if (bitmap == null) {
+        if (bitmap == null || bitmap.getWidth() == 0 || bitmap.getHeight() == 0) {
             return null;
         }
 
