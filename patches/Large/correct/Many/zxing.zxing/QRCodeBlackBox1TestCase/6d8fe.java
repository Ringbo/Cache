diff --git a/core/test/src/com/google/zxing/qrcode/QRCodeBlackBox1TestCase.java b/core/test/src/com/google/zxing/qrcode/QRCodeBlackBox1TestCase.java
index e36b080..b03d5cd 100644
--- a/core/test/src/com/google/zxing/qrcode/QRCodeBlackBox1TestCase.java
+++ b/core/test/src/com/google/zxing/qrcode/QRCodeBlackBox1TestCase.java
@@ -29,7 +29,7 @@
 
   public QRCodeBlackBox1TestCase() {
     super(new File("test/data/blackbox/qrcode-1"), new MultiFormatReader(), BarcodeFormat.QR_CODE);
-    addTest(17, 18, 0.0f);
+    addTest(18, 18, 0.0f);
     addTest(14, 14, 90.0f);
     addTest(18, 18, 180.0f);
     addTest(13, 14, 270.0f);
