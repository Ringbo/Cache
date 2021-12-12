diff --git a/compressor/src/main/java/id/zelory/compressor/ImageUtil.java b/compressor/src/main/java/id/zelory/compressor/ImageUtil.java
index c1ac167..8f5d40b 100644
--- a/compressor/src/main/java/id/zelory/compressor/ImageUtil.java
+++ b/compressor/src/main/java/id/zelory/compressor/ImageUtil.java
@@ -58,7 +58,7 @@
         float imgRatio = (float) actualWidth / (float) actualHeight;
         float maxRatio = reqWidth / reqHeight;
 
-        if (actualHeight > reqWidth || actualWidth > reqHeight) {
+        if (actualHeight > reqHeight || actualWidth > reqWidth) {
             //If Height is greater
             if (imgRatio < maxRatio) {
                 imgRatio = reqHeight / actualHeight;
