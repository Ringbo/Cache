diff --git a/test/com/google/debugging/sourcemap/SourceMapGeneratorV3Test.java b/test/com/google/debugging/sourcemap/SourceMapGeneratorV3Test.java
index abc88fe..da4946c 100644
--- a/test/com/google/debugging/sourcemap/SourceMapGeneratorV3Test.java
+++ b/test/com/google/debugging/sourcemap/SourceMapGeneratorV3Test.java
@@ -52,7 +52,7 @@
     return SourceMap.Format.V3;
   }
 
-  private String getEncodedFileName() {
+  private static String getEncodedFileName() {
     if (File.separatorChar == '\\') {
       return "c:/myfile.js";
     } else {
