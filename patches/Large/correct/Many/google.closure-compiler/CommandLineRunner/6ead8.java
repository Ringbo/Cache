diff --git a/src/com/google/javascript/jscomp/CommandLineRunner.java b/src/com/google/javascript/jscomp/CommandLineRunner.java
index d7ecd32..bcfc68b 100644
--- a/src/com/google/javascript/jscomp/CommandLineRunner.java
+++ b/src/com/google/javascript/jscomp/CommandLineRunner.java
@@ -1754,7 +1754,7 @@
     ConformanceConfig.Builder builder = ConformanceConfig.newBuilder();
 
     // Looking for BOM.
-    if (textProto.charAt(0) == UTF8_BOM_CODE) {
+    if (!textProto.isEmpty() && textProto.charAt(0) == UTF8_BOM_CODE) {
       // Stripping the BOM.
       textProto = textProto.substring(1);
     }
