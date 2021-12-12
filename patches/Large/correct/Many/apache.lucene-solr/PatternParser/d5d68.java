diff --git a/lucene/analysis/common/src/java/org/apache/lucene/analysis/compound/hyphenation/PatternParser.java b/lucene/analysis/common/src/java/org/apache/lucene/analysis/compound/hyphenation/PatternParser.java
index 448adfb..d658977 100644
--- a/lucene/analysis/common/src/java/org/apache/lucene/analysis/compound/hyphenation/PatternParser.java
+++ b/lucene/analysis/common/src/java/org/apache/lucene/analysis/compound/hyphenation/PatternParser.java
@@ -98,7 +98,7 @@
    * @throws IOException In case of an exception while parsing
    */
   public void parse(File file) throws IOException {
-    InputSource src = new InputSource(file.toURL().toExternalForm());
+    InputSource src = new InputSource(file.toURI().toASCIIString());
     parse(src);
   }
 
