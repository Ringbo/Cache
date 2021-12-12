diff --git a/src/main/java/com/owncloud/android/utils/BitmapUtils.java b/src/main/java/com/owncloud/android/utils/BitmapUtils.java
index ef4bb7a..e1d2107 100644
--- a/src/main/java/com/owncloud/android/utils/BitmapUtils.java
+++ b/src/main/java/com/owncloud/android/utils/BitmapUtils.java
@@ -104,8 +104,7 @@
 
             // calculates the largest inSampleSize value (for smallest sample) that is a power of 2 and keeps both
             // height and width **larger** than the requested height and width.
-            while ((halfHeight / inSampleSize) > reqHeight
-                    && (halfWidth / inSampleSize) > reqWidth) {
+            while ((halfHeight / inSampleSize) > reqHeight || (halfWidth / inSampleSize) > reqWidth) {
                 inSampleSize *= 2;
             }
         }
