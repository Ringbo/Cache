diff --git a/src/java/org/apache/solr/analysis/NGramTokenizerFactory.java b/src/java/org/apache/solr/analysis/NGramTokenizerFactory.java
index b9af8ad..47ce749 100755
--- a/src/java/org/apache/solr/analysis/NGramTokenizerFactory.java
+++ b/src/java/org/apache/solr/analysis/NGramTokenizerFactory.java
@@ -42,7 +42,7 @@
     }
 
     /** Creates the {@link TokenStream} of n-grams from the given {@link Reader}. */
-    public TokenStream create(Reader input) {
+    public NGramTokenizer create(Reader input) {
         return new NGramTokenizer(input, minGramSize, maxGramSize);
     }
 }
