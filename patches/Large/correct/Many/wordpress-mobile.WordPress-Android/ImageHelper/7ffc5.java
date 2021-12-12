diff --git a/src/org/wordpress/android/util/ImageHelper.java b/src/org/wordpress/android/util/ImageHelper.java
index 433f5c2..70a6667 100644
--- a/src/org/wordpress/android/util/ImageHelper.java
+++ b/src/org/wordpress/android/util/ImageHelper.java
@@ -336,7 +336,7 @@
      * @return resized bitmap
      */
     public Bitmap getThumbnailForWPImageSpan(Context context, String filePath, int targetWidth) {
-        if (filePath == null) {
+        if (filePath == null || context == null) {
             return null;
         }
         int width = getThumbnailWidth(context, targetWidth);
