diff --git a/picasso/src/main/java/com/squareup/picasso/BitmapHunter.java b/picasso/src/main/java/com/squareup/picasso/BitmapHunter.java
index 527255c..4df98e8 100644
--- a/picasso/src/main/java/com/squareup/picasso/BitmapHunter.java
+++ b/picasso/src/main/java/com/squareup/picasso/BitmapHunter.java
@@ -310,7 +310,7 @@
     }
 
     Bitmap newResult =
-        Bitmap.createBitmap(result, drawX, drawY, drawWidth, drawHeight, matrix, false);
+        Bitmap.createBitmap(result, drawX, drawY, drawWidth, drawHeight, matrix, true);
     if (newResult != result) {
       result.recycle();
       result = newResult;
