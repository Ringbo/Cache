diff --git a/media/java/android/media/ThumbnailUtils.java b/media/java/android/media/ThumbnailUtils.java
index 23f850a..5062e87 100644
--- a/media/java/android/media/ThumbnailUtils.java
+++ b/media/java/android/media/ThumbnailUtils.java
@@ -568,7 +568,7 @@
         fullThumbWidth = fullOptions.outWidth / fullOptions.inSampleSize;
 
         // Choose the larger thumbnail as the returning sizedThumbBitmap.
-        if (exifThumbWidth >= fullThumbWidth) {
+        if (thumbData != null && exifThumbWidth >= fullThumbWidth) {
             int width = exifOptions.outWidth;
             int height = exifOptions.outHeight;
             exifOptions.inJustDecodeBounds = false;
