diff --git a/core/src/test/java/com/google/zxing/qrcode/QRCodeBlackBox6TestCase.java b/core/src/test/java/com/google/zxing/qrcode/QRCodeBlackBox6TestCase.java
index 62dea8c..531ffa6 100644
--- a/core/src/test/java/com/google/zxing/qrcode/QRCodeBlackBox6TestCase.java
+++ b/core/src/test/java/com/google/zxing/qrcode/QRCodeBlackBox6TestCase.java
@@ -30,7 +30,7 @@
     super("src/test/resources/blackbox/qrcode-6", new MultiFormatReader(), BarcodeFormat.QR_CODE);
     addTest(15, 15, 0.0f);
     addTest(14, 14, 90.0f);
-    addTest(12, 13, 180.0f);
+    addTest(13, 13, 180.0f);
     addTest(14, 14, 270.0f);
   }
 
