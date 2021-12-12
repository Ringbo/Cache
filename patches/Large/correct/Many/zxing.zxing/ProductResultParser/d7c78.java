diff --git a/core/src/main/java/com/google/zxing/client/result/ProductResultParser.java b/core/src/main/java/com/google/zxing/client/result/ProductResultParser.java
index dfe6b22..bed1a7d 100644
--- a/core/src/main/java/com/google/zxing/client/result/ProductResultParser.java
+++ b/core/src/main/java/com/google/zxing/client/result/ProductResultParser.java
@@ -43,7 +43,7 @@
 
     String normalizedProductID;
     // Expand UPC-E for purposes of searching
-    if (format == BarcodeFormat.UPC_E) {
+    if (format == BarcodeFormat.UPC_E && rawText.length() == 8) {
       normalizedProductID = UPCEReader.convertUPCEtoUPCA(rawText);
     } else {
       normalizedProductID = rawText;
