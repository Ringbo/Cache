diff --git a/core/java/android/util/apk/ApkSignatureSchemeV2Verifier.java b/core/java/android/util/apk/ApkSignatureSchemeV2Verifier.java
index 78d3b7b..0216a07 100644
--- a/core/java/android/util/apk/ApkSignatureSchemeV2Verifier.java
+++ b/core/java/android/util/apk/ApkSignatureSchemeV2Verifier.java
@@ -579,7 +579,7 @@
             throws SignatureNotFoundException {
         // Look up the offset of ZIP Central Directory.
         long centralDirOffset = ZipUtils.getZipEocdCentralDirectoryOffset(eocd);
-        if (centralDirOffset >= eocdOffset) {
+        if (centralDirOffset > eocdOffset) {
             throw new SignatureNotFoundException(
                     "ZIP Central Directory offset out of range: " + centralDirOffset
                     + ". ZIP End of Central Directory offset: " + eocdOffset);
