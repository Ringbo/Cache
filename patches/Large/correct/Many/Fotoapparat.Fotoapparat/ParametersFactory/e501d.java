diff --git a/fotoapparat/src/main/java/io/fotoapparat/parameter/factory/ParametersFactory.java b/fotoapparat/src/main/java/io/fotoapparat/parameter/factory/ParametersFactory.java
index 27e84bd..7d9cf49 100644
--- a/fotoapparat/src/main/java/io/fotoapparat/parameter/factory/ParametersFactory.java
+++ b/fotoapparat/src/main/java/io/fotoapparat/parameter/factory/ParametersFactory.java
@@ -115,7 +115,7 @@
     }
 
     private static Integer ensureJpegQualityRange(int jpegQuality) {
-        if (jpegQuality < 1 || 100 < jpegQuality) {
+        if (jpegQuality < 0 || 100 < jpegQuality) {
             throw new IllegalArgumentException("Jpeg quality was not in 0-100 range.");
         }
         return jpegQuality;
