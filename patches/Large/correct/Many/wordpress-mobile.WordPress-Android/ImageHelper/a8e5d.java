diff --git a/src/org/wordpress/android/util/ImageHelper.java b/src/org/wordpress/android/util/ImageHelper.java
index efd06ee..a6451a9 100644
--- a/src/org/wordpress/android/util/ImageHelper.java
+++ b/src/org/wordpress/android/util/ImageHelper.java
@@ -117,7 +117,7 @@
 				try {
 					bm = BitmapFactory
 							.decodeByteArray(bytes, 0, bytes.length, opts);
-				} catch (Exception e) {
+				} catch (OutOfMemoryError e) {
 					// out of memory
 					return null;
 				}
