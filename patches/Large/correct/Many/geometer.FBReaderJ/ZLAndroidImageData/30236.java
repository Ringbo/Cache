diff --git a/src/org/geometerplus/zlibrary/ui/android/image/ZLAndroidImageData.java b/src/org/geometerplus/zlibrary/ui/android/image/ZLAndroidImageData.java
index 26cf035..2b085e0 100644
--- a/src/org/geometerplus/zlibrary/ui/android/image/ZLAndroidImageData.java
+++ b/src/org/geometerplus/zlibrary/ui/android/image/ZLAndroidImageData.java
@@ -45,7 +45,7 @@
 	}
 
 	private synchronized Bitmap getBitmap(int maxWidth, int maxHeight, boolean ignoreSize) {
-		if (!ignoreSize && (maxWidth == 0 || maxHeight == 0)) {
+		if (!ignoreSize && (maxWidth <= 0 || maxHeight <= 0)) {
 			return null;
 		}
 		if (maxWidth != myLastRequestedWidth || maxHeight != myLastRequestedHeight) {
@@ -81,10 +81,10 @@
 							final int w, h;
 							if (bWidth * maxHeight > bHeight * maxWidth) {
 								w = maxWidth;
-								h = bHeight * maxWidth / bWidth;
+								h = Math.max(1, bHeight * maxWidth / bWidth);
 							} else {
 								h = maxHeight;
-								w = bWidth * maxHeight / bHeight;
+								w = Math.max(1, bWidth * maxHeight / bHeight);
 							}
 							myBitmap = Bitmap.createScaledBitmap(myBitmap, w, h, false);
 						}
