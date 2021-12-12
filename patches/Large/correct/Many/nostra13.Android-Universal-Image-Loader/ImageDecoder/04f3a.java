diff --git a/UniversalImageLoader/src/com/nostra13/universalimageloader/core/ImageDecoder.java b/UniversalImageLoader/src/com/nostra13/universalimageloader/core/ImageDecoder.java
index 21e0ab2..28e332f 100644
--- a/UniversalImageLoader/src/com/nostra13/universalimageloader/core/ImageDecoder.java
+++ b/UniversalImageLoader/src/com/nostra13/universalimageloader/core/ImageDecoder.java
@@ -102,7 +102,7 @@
 		int imageWidth = options.outWidth;
 		int imageHeight = options.outHeight;
 		int widthScale = imageWidth / targetWidth;
-		int heightScale = imageWidth / targetHeight;
+		int heightScale = imageHeight / targetHeight;
 		switch (viewScaleType) {
 			case FIT_CENTER:
 			case FIT_XY:
