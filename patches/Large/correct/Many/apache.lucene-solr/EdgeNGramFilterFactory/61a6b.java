diff --git a/src/java/org/apache/solr/analysis/EdgeNGramFilterFactory.java b/src/java/org/apache/solr/analysis/EdgeNGramFilterFactory.java
index 3ec106f..0c2235d 100644
--- a/src/java/org/apache/solr/analysis/EdgeNGramFilterFactory.java
+++ b/src/java/org/apache/solr/analysis/EdgeNGramFilterFactory.java
@@ -49,7 +49,7 @@
     }
   }
 
-  public TokenStream create(TokenStream input) {
+  public EdgeNGramTokenFilter create(TokenStream input) {
     return new EdgeNGramTokenFilter(input, side, minGramSize, maxGramSize);
   }
 }
