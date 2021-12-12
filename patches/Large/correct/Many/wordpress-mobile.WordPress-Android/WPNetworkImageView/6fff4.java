diff --git a/WordPress/src/main/java/org/wordpress/android/widgets/WPNetworkImageView.java b/WordPress/src/main/java/org/wordpress/android/widgets/WPNetworkImageView.java
index f25775f..38aeb72 100644
--- a/WordPress/src/main/java/org/wordpress/android/widgets/WPNetworkImageView.java
+++ b/WordPress/src/main/java/org/wordpress/android/widgets/WPNetworkImageView.java
@@ -272,7 +272,7 @@
 
     private void handleResponse(ImageLoader.ImageContainer response, boolean isCached, ImageLoadListener
             imageLoadListener) {
-        if (response.getBitmap() != null) {
+        if (response != null && response.getBitmap() != null) {
             Bitmap bitmap = response.getBitmap();
 
             if (mImageType == ImageType.GONE_UNTIL_AVAILABLE) {
