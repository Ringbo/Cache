diff --git a/src/java/org/apache/solr/analysis/StopFilterFactory.java b/src/java/org/apache/solr/analysis/StopFilterFactory.java
index 56e50ac..4acd153 100644
--- a/src/java/org/apache/solr/analysis/StopFilterFactory.java
+++ b/src/java/org/apache/solr/analysis/StopFilterFactory.java
@@ -51,7 +51,7 @@
   private Set stopWords = StopFilter.makeStopSet(StopAnalyzer.ENGLISH_STOP_WORDS);
   private boolean ignoreCase;
 
-  public TokenStream create(TokenStream input) {
+  public StopFilter create(TokenStream input) {
     return new StopFilter(input,stopWords,ignoreCase);
   }
 }
