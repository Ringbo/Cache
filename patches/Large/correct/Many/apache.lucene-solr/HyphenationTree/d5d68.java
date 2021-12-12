diff --git a/lucene/analysis/common/src/java/org/apache/lucene/analysis/compound/hyphenation/HyphenationTree.java b/lucene/analysis/common/src/java/org/apache/lucene/analysis/compound/hyphenation/HyphenationTree.java
index b988c46..119794e 100644
--- a/lucene/analysis/common/src/java/org/apache/lucene/analysis/compound/hyphenation/HyphenationTree.java
+++ b/lucene/analysis/common/src/java/org/apache/lucene/analysis/compound/hyphenation/HyphenationTree.java
@@ -111,7 +111,7 @@
    * @throws IOException In case the parsing fails
    */
   public void loadPatterns(File f) throws IOException {
-    InputSource src = new InputSource(f.toURL().toExternalForm());
+    InputSource src = new InputSource(f.toURI().toASCIIString());
     loadPatterns(src);
   }
 
