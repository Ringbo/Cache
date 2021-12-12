diff --git a/core/src/com/google/zxing/multi/qrcode/QRCodeMultiReader.java b/core/src/com/google/zxing/multi/qrcode/QRCodeMultiReader.java
index b51fbfe..003cf8f 100644
--- a/core/src/com/google/zxing/multi/qrcode/QRCodeMultiReader.java
+++ b/core/src/com/google/zxing/multi/qrcode/QRCodeMultiReader.java
@@ -55,7 +55,7 @@
     DetectorResult[] detectorResults = new MultiDetector(image.getBlackMatrix()).detectMulti(hints);
     for (DetectorResult detectorResult : detectorResults) {
       try {
-        DecoderResult decoderResult = getDecoder().decode(detectorResult.getBits());
+        DecoderResult decoderResult = getDecoder().decode(detectorResult.getBits(), hints);
         ResultPoint[] points = detectorResult.getPoints();
         Result result = new Result(decoderResult.getText(), decoderResult.getRawBytes(), points,
                                    BarcodeFormat.QR_CODE);
