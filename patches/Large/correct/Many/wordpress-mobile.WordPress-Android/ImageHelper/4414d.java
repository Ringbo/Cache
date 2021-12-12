diff --git a/src/org/wordpress/android/util/ImageHelper.java b/src/org/wordpress/android/util/ImageHelper.java
index 439b62a..f8f6671 100644
--- a/src/org/wordpress/android/util/ImageHelper.java
+++ b/src/org/wordpress/android/util/ImageHelper.java
@@ -327,7 +327,7 @@
      * @return resized bitmap
      */
     public Bitmap getThumbnailForWPImageSpan(Context context, String filePath, int targetWidth) {
-        if (filePath == null) {
+        if (filePath == null || context == null) {
             return null;
         }
         int width = getThumbnailWidth(context, targetWidth);
