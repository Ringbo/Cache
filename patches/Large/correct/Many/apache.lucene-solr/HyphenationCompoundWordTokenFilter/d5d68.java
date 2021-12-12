diff --git a/lucene/analysis/common/src/java/org/apache/lucene/analysis/compound/HyphenationCompoundWordTokenFilter.java b/lucene/analysis/common/src/java/org/apache/lucene/analysis/compound/HyphenationCompoundWordTokenFilter.java
index bdb22a2..909b380 100644
--- a/lucene/analysis/common/src/java/org/apache/lucene/analysis/compound/HyphenationCompoundWordTokenFilter.java
+++ b/lucene/analysis/common/src/java/org/apache/lucene/analysis/compound/HyphenationCompoundWordTokenFilter.java
@@ -148,7 +148,7 @@
    */
   public static HyphenationTree getHyphenationTree(File hyphenationFile)
       throws IOException {
-    return getHyphenationTree(new InputSource(hyphenationFile.toURL().toExternalForm()));
+    return getHyphenationTree(new InputSource(hyphenationFile.toURI().toASCIIString()));
   }
 
   /**
