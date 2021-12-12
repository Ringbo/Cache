diff --git a/src/java/org/apache/solr/analysis/SynonymFilterFactory.java b/src/java/org/apache/solr/analysis/SynonymFilterFactory.java
index ff89f46..d8d413c 100644
--- a/src/java/org/apache/solr/analysis/SynonymFilterFactory.java
+++ b/src/java/org/apache/solr/analysis/SynonymFilterFactory.java
@@ -113,7 +113,7 @@
   }
 
 
-  public TokenStream create(TokenStream input) {
+  public SynonymFilter create(TokenStream input) {
     return new SynonymFilter(input,synMap,ignoreCase);
   }
 
