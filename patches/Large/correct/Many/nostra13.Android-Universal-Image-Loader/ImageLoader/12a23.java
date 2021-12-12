diff --git a/UniversalImageLoader/src/com/nostra13/universalimageloader/core/ImageLoader.java b/UniversalImageLoader/src/com/nostra13/universalimageloader/core/ImageLoader.java
index 3294f0e..f6f2ec0 100644
--- a/UniversalImageLoader/src/com/nostra13/universalimageloader/core/ImageLoader.java
+++ b/UniversalImageLoader/src/com/nostra13/universalimageloader/core/ImageLoader.java
@@ -311,14 +311,14 @@
 			Log.e(TAG, e.getMessage(), e);
 		}
 
-		if (width < 0 && height < 0) {
+		if (width <= 0 && height <= 0) {
 			// Get layout width and height parameters
 			LayoutParams params = imageView.getLayoutParams();
 			width = params.width;
 			height = params.height;
 		}
 
-		if (width < 0 && height < 0) {
+		if (width <= 0 && height <= 0) {
 			// Get device screen dimensions
 			width = configuration.maxImageWidthForMemoryCache;
 			height = configuration.maxImageHeightForMemoryCache;
