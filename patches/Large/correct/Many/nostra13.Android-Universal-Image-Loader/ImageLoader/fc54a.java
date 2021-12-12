diff --git a/library/src/com/nostra13/universalimageloader/core/ImageLoader.java b/library/src/com/nostra13/universalimageloader/core/ImageLoader.java
index d67e269..7f9972f 100644
--- a/library/src/com/nostra13/universalimageloader/core/ImageLoader.java
+++ b/library/src/com/nostra13/universalimageloader/core/ImageLoader.java
@@ -195,7 +195,7 @@
 			if (options.shouldShowImageForEmptyUri()) {
 				imageView.setImageResource(options.getImageForEmptyUri());
 			} else {
-				imageView.setImageBitmap(null);
+				imageView.setImageDrawable(null);
 			}
 			listener.onLoadingComplete(uri, imageView, null);
 			return;
@@ -225,7 +225,7 @@
 				imageView.setImageResource(options.getStubImage());
 			} else {
 				if (options.isResetViewBeforeLoading()) {
-					imageView.setImageBitmap(null);
+					imageView.setImageDrawable(null);
 				}
 			}
 
