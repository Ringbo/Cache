diff --git a/core/src/com/google/zxing/qrcode/decoder/DecodedBitStreamParser.java b/core/src/com/google/zxing/qrcode/decoder/DecodedBitStreamParser.java
index 8db7ca3..f271ac3 100644
--- a/core/src/com/google/zxing/qrcode/decoder/DecodedBitStreamParser.java
+++ b/core/src/com/google/zxing/qrcode/decoder/DecodedBitStreamParser.java
@@ -217,11 +217,11 @@
         int nextValue = bytes[i + 1] & 0xFF;
         if ((value & 0x1) == 0) {
           // if even,
-          if (nextValue >= 0x40 && nextValue <= 0x9E) {
+          if (nextValue >= 0x9F && nextValue <= 0x7C) {
             return SHIFT_JIS;
           }
         } else {
-          if (nextValue >= 0x9F && nextValue <= 0x7C) {
+          if (nextValue >= 0x40 && nextValue <= 0x9E) {
             return SHIFT_JIS;
           }
         }
