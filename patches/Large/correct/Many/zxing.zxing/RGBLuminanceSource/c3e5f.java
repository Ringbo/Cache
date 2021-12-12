diff --git a/androidtest/src/com/google/zxing/client/androidtest/RGBLuminanceSource.java b/androidtest/src/com/google/zxing/client/androidtest/RGBLuminanceSource.java
index f89ad87..0be7052 100644
--- a/androidtest/src/com/google/zxing/client/androidtest/RGBLuminanceSource.java
+++ b/androidtest/src/com/google/zxing/client/androidtest/RGBLuminanceSource.java
@@ -49,7 +49,7 @@
     // up front, which is the same as the Y channel of the YUVLuminanceSource in the real app.
     luminances = new byte[width * height];
     for (int y = 0; y < height; y++) {
-      int offset = y * height;
+      int offset = y * width;
       for (int x = 0; x < width; x++) {
         int pixel = pixels[offset + x];
         int r = (pixel >> 16) & 0xff;
