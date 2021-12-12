diff --git a/core/src/com/google/zxing/qrcode/decoder/BitMatrixParser.java b/core/src/com/google/zxing/qrcode/decoder/BitMatrixParser.java
index db86fde..9543192 100644
--- a/core/src/com/google/zxing/qrcode/decoder/BitMatrixParser.java
+++ b/core/src/com/google/zxing/qrcode/decoder/BitMatrixParser.java
@@ -128,7 +128,7 @@
     versionBits = 0;
     for (int j = 5; j >= 0; j--) {
       int iMin = dimension - 11;
-      for (int i = dimension - 11; i >= iMin; i--) {
+      for (int i = dimension - 9; i >= iMin; i--) {
         versionBits = copyBit(i, j, versionBits);
       }
     }
