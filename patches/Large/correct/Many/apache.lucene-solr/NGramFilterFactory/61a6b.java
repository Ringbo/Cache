diff --git a/src/java/org/apache/solr/analysis/NGramFilterFactory.java b/src/java/org/apache/solr/analysis/NGramFilterFactory.java
index 758b62a..428acee 100644
--- a/src/java/org/apache/solr/analysis/NGramFilterFactory.java
+++ b/src/java/org/apache/solr/analysis/NGramFilterFactory.java
@@ -43,7 +43,7 @@
         : NGramTokenFilter.DEFAULT_MIN_NGRAM_SIZE);
   }
 
-  public TokenStream create(TokenStream input) {
+  public NGramTokenFilter create(TokenStream input) {
     return new NGramTokenFilter(input, minGramSize, maxGramSize);
   }
 }
