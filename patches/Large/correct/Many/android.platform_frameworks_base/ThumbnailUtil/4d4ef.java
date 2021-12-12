diff --git a/media/java/android/media/ThumbnailUtil.java b/media/java/android/media/ThumbnailUtil.java
index 3db10b8..eeee266 100644
--- a/media/java/android/media/ThumbnailUtil.java
+++ b/media/java/android/media/ThumbnailUtil.java
@@ -245,7 +245,7 @@
         }
         Matrix matrix = new Matrix();
         matrix.setScale(scale, scale);
-        Bitmap miniThumbnail = transform(matrix, source, width, height, false, recycle);
+        Bitmap miniThumbnail = transform(matrix, source, width, height, true, recycle);
         return miniThumbnail;
     }
 
