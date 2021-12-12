diff --git a/core/src/main/java/com/google/zxing/pdf417/encoder/PDF417HighLevelEncoder.java b/core/src/main/java/com/google/zxing/pdf417/encoder/PDF417HighLevelEncoder.java
index 8a5db25..28e6e94 100644
--- a/core/src/main/java/com/google/zxing/pdf417/encoder/PDF417HighLevelEncoder.java
+++ b/core/src/main/java/com/google/zxing/pdf417/encoder/PDF417HighLevelEncoder.java
@@ -166,7 +166,7 @@
     //the codewords 0..928 are encoded as Unicode characters
     StringBuilder sb = new StringBuilder(msg.length());
 
-    if (encoding != null || !DEFAULT_ENCODING_NAMES.contains(encoding.name())) {
+    if (encoding != null && !DEFAULT_ENCODING_NAMES.contains(encoding.name())) {
       CharacterSetECI eci = CharacterSetECI.getCharacterSetECIByName(encoding.name());
       if (eci != null) {
         encodingECI(eci.getValue(), sb);
