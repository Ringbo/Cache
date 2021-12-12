diff --git a/src/com/yahoo/platform/yui/compressor/YUICompressor.java b/src/com/yahoo/platform/yui/compressor/YUICompressor.java
index 4b36c97..0abfef5 100644
--- a/src/com/yahoo/platform/yui/compressor/YUICompressor.java
+++ b/src/com/yahoo/platform/yui/compressor/YUICompressor.java
@@ -131,7 +131,7 @@
 
                     String outputFilename = output;
                     // if a substitution pattern was passed in
-                    if (pattern.length > 1 && files.size() > 1) {
+                    if (pattern.length > 1 && files.size() > 0) {
                         outputFilename = inputFilename.replaceFirst(pattern[0], pattern[1]);
                     }
 
