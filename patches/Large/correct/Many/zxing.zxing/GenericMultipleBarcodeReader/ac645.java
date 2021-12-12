diff --git a/core/src/com/google/zxing/multi/GenericMultipleBarcodeReader.java b/core/src/com/google/zxing/multi/GenericMultipleBarcodeReader.java
index 25079e1..b25a688 100644
--- a/core/src/com/google/zxing/multi/GenericMultipleBarcodeReader.java
+++ b/core/src/com/google/zxing/multi/GenericMultipleBarcodeReader.java
@@ -129,12 +129,12 @@
     }
     // Decode right of barcode
     if (maxX < width - MIN_DIMENSION_TO_RECUR) {
-      doDecodeMultiple(image.crop((int) maxX, 0, MIN_DIMENSION_TO_RECUR - (int) maxX, height),
+      doDecodeMultiple(image.crop((int) maxX, 0, width - (int) maxX, height),
                        hints, results, (int) maxX, 0);
     }
     // Decode below barcode
     if (maxY < height - MIN_DIMENSION_TO_RECUR) {
-      doDecodeMultiple(image.crop(0, (int) maxY, width, MIN_DIMENSION_TO_RECUR - (int) maxY),
+      doDecodeMultiple(image.crop(0, (int) maxY, width, height - (int) maxY),
                        hints, results, 0, (int) maxY);
     }
   }
