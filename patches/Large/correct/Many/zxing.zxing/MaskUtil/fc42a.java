diff --git a/core/src/com/google/zxing/qrcode/encoder/MaskUtil.java b/core/src/com/google/zxing/qrcode/encoder/MaskUtil.java
index 4120e41..9a4a7f1 100644
--- a/core/src/com/google/zxing/qrcode/encoder/MaskUtil.java
+++ b/core/src/com/google/zxing/qrcode/encoder/MaskUtil.java
@@ -208,7 +208,7 @@
           prevBit = bit;
         }
       }
-      if (numSameBitCells > 5) {
+      if (numSameBitCells >= 5) {
         penalty += N1 + (numSameBitCells - 5);
       }
     }
