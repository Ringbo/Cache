diff --git a/src/java/org/apache/solr/analysis/EdgeNGramTokenizerFactory.java b/src/java/org/apache/solr/analysis/EdgeNGramTokenizerFactory.java
index 38f2f62..b837832 100755
--- a/src/java/org/apache/solr/analysis/EdgeNGramTokenizerFactory.java
+++ b/src/java/org/apache/solr/analysis/EdgeNGramTokenizerFactory.java
@@ -48,7 +48,7 @@
         }
     }
 
-    public TokenStream create(Reader input) {
+    public EdgeNGramTokenizer create(Reader input) {
         return new EdgeNGramTokenizer(input, side, minGramSize, maxGramSize);
     }
 }
