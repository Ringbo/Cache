diff --git a/core/src/com/google/zxing/qrcode/decoder/BitMatrixParser.java b/core/src/com/google/zxing/qrcode/decoder/BitMatrixParser.java
index 9543192..9b8ae48 100644
--- a/core/src/com/google/zxing/qrcode/decoder/BitMatrixParser.java
+++ b/core/src/com/google/zxing/qrcode/decoder/BitMatrixParser.java
@@ -120,7 +120,7 @@
     }
 
     parsedVersion = Version.decodeVersionInformation(versionBits);
-    if (parsedVersion != null) {
+    if (parsedVersion != null && parsedVersion.getDimensionForVersion() == dimension) {
       return parsedVersion;
     }
 
@@ -134,7 +134,7 @@
     }
 
     parsedVersion = Version.decodeVersionInformation(versionBits);
-    if (parsedVersion != null) {
+    if (parsedVersion != null && parsedVersion.getDimensionForVersion() == dimension) {
       return parsedVersion;
     }
     throw ReaderException.getInstance();
