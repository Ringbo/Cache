diff --git a/core/test/src/com/google/zxing/qrcode/decoder/DecodedBitStreamParserTestCase.java b/core/test/src/com/google/zxing/qrcode/decoder/DecodedBitStreamParserTestCase.java
index 7d3dd89..8078b07 100644
--- a/core/test/src/com/google/zxing/qrcode/decoder/DecodedBitStreamParserTestCase.java
+++ b/core/test/src/com/google/zxing/qrcode/decoder/DecodedBitStreamParserTestCase.java
@@ -35,7 +35,7 @@
     builder.write(0xF2, 8);
     builder.write(0xF3, 8);
     String result = DecodedBitStreamParser.decode(builder.toByteArray(),
-        Version.getVersionForNumber(1), null).getText();
+        Version.getVersionForNumber(1), null, null).getText();
     assertEquals("\u00f1\u00f2\u00f3", result);
   }
 
@@ -47,7 +47,7 @@
     builder.write(0xA2, 8);
     builder.write(0xA3, 8);
     String result = DecodedBitStreamParser.decode(builder.toByteArray(),
-        Version.getVersionForNumber(1), null).getText();
+        Version.getVersionForNumber(1), null, null).getText();
     assertEquals("\uff61\uff62\uff63", result);
   }
 
@@ -61,7 +61,7 @@
     builder.write(0xA2, 8);
     builder.write(0xA3, 8);
     String result = DecodedBitStreamParser.decode(builder.toByteArray(),
-        Version.getVersionForNumber(1), null).getText();
+        Version.getVersionForNumber(1), null, null).getText();
     assertEquals("\u00ed\u00f3\u00fa", result);
   }
 
