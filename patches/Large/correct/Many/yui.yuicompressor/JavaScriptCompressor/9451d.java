diff --git a/src/com/yahoo/platform/yui/compressor/JavaScriptCompressor.java b/src/com/yahoo/platform/yui/compressor/JavaScriptCompressor.java
index e7590e4..781a4f5 100644
--- a/src/com/yahoo/platform/yui/compressor/JavaScriptCompressor.java
+++ b/src/com/yahoo/platform/yui/compressor/JavaScriptCompressor.java
@@ -536,7 +536,8 @@
         this.tokens = parse(in, reporter);
     }
     public void compress(Writer out, int linebreak, boolean munge, boolean verbose,
-            boolean preserveAllSemiColons, boolean disableOptimizations) {
+            boolean preserveAllSemiColons, boolean disableOptimizations) 
+            throws IOException {
         compress(out, null, linebreak, munge, verbose, preserveAllSemiColons, disableOptimizations);
     }
     public void compress(Writer out, Writer mungemap, int linebreak, boolean munge, boolean verbose,
