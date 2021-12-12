diff --git a/core/java/com/android/internal/util/ImageUtils.java b/core/java/com/android/internal/util/ImageUtils.java
index a0d0b20..7d56e9e 100644
--- a/core/java/com/android/internal/util/ImageUtils.java
+++ b/core/java/com/android/internal/util/ImageUtils.java
@@ -66,7 +66,7 @@
                         COMPACT_BITMAP_SIZE, COMPACT_BITMAP_SIZE, Bitmap.Config.ARGB_8888
                 );
                 mTempCompactBitmapCanvas = new Canvas(mTempCompactBitmap);
-                mTempCompactBitmapPaint = new Paint();
+                mTempCompactBitmapPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
                 mTempCompactBitmapPaint.setFilterBitmap(true);
             }
             mTempMatrix.reset();
