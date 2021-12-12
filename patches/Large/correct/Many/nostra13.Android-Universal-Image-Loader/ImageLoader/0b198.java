diff --git a/library/src/com/nostra13/universalimageloader/core/ImageLoader.java b/library/src/com/nostra13/universalimageloader/core/ImageLoader.java
index 49239ad..54c534a 100644
--- a/library/src/com/nostra13/universalimageloader/core/ImageLoader.java
+++ b/library/src/com/nostra13/universalimageloader/core/ImageLoader.java
@@ -470,7 +470,7 @@
 		if (width <= 0) width = configuration.maxImageWidthForMemoryCache;
 		if (width <= 0) width = displayMetrics.widthPixels;
 
-		int height = params.height != LayoutParams.WRAP_CONTENT ? 0 : imageView.getHeight(); // Get actual image height
+		int height = params.height == LayoutParams.WRAP_CONTENT ? 0 : imageView.getHeight(); // Get actual image height
 		if (height <= 0) height = params.height; // Get layout height parameter
 		if (height <= 0) height = getFieldValue(imageView, "mMaxHeight"); // Check maxHeight parameter
 		if (height <= 0) height = configuration.maxImageHeightForMemoryCache;
