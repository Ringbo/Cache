diff --git a/picasso/src/main/java/com/squareup/picasso/BitmapHunter.java b/picasso/src/main/java/com/squareup/picasso/BitmapHunter.java
index 5a3a7e3..aaa7f30 100644
--- a/picasso/src/main/java/com/squareup/picasso/BitmapHunter.java
+++ b/picasso/src/main/java/com/squareup/picasso/BitmapHunter.java
@@ -115,7 +115,7 @@
 
     if (bitmap != null) {
       stats.dispatchBitmapDecoded(bitmap);
-      if (data.needsTransformation()) {
+      if (data.needsTransformation() || exifRotation != 0) {
         synchronized (DECODE_LOCK) {
           if (data.needsMatrixTransform() || exifRotation != 0) {
             bitmap = transformResult(data, bitmap, exifRotation);
