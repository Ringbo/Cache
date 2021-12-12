diff --git a/wearable/src/main/java/com/google/android/apps/muzei/MuzeiWatchFace.java b/wearable/src/main/java/com/google/android/apps/muzei/MuzeiWatchFace.java
index 65d8aa6..ec9b07e 100644
--- a/wearable/src/main/java/com/google/android/apps/muzei/MuzeiWatchFace.java
+++ b/wearable/src/main/java/com/google/android/apps/muzei/MuzeiWatchFace.java
@@ -436,7 +436,7 @@
             int height = canvas.getHeight();
 
             // Draw the background
-            if (mAmbient || mBackgroundBitmap == null) {
+            if (mAmbient || mBackgroundScaledBitmap == null) {
                 canvas.drawRect(0, 0, width, height, mBackgroundPaint);
             } else {
                 // Draw the scaled background
