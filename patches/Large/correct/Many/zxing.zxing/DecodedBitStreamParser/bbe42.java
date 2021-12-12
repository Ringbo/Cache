diff --git a/core/src/com/google/zxing/qrcode/decoder/DecodedBitStreamParser.java b/core/src/com/google/zxing/qrcode/decoder/DecodedBitStreamParser.java
index f271ac3..e69ca8d 100644
--- a/core/src/com/google/zxing/qrcode/decoder/DecodedBitStreamParser.java
+++ b/core/src/com/google/zxing/qrcode/decoder/DecodedBitStreamParser.java
@@ -217,7 +217,7 @@
         int nextValue = bytes[i + 1] & 0xFF;
         if ((value & 0x1) == 0) {
           // if even,
-          if (nextValue >= 0x9F && nextValue <= 0x7C) {
+          if (nextValue >= 0x9F && nextValue <= 0xFC) {
             return SHIFT_JIS;
           }
         } else {
