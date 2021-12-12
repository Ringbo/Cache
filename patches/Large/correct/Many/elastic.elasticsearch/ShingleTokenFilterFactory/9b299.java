diff --git a/src/main/java/org/elasticsearch/index/analysis/ShingleTokenFilterFactory.java b/src/main/java/org/elasticsearch/index/analysis/ShingleTokenFilterFactory.java
index 40fceee..3a61bf2 100644
--- a/src/main/java/org/elasticsearch/index/analysis/ShingleTokenFilterFactory.java
+++ b/src/main/java/org/elasticsearch/index/analysis/ShingleTokenFilterFactory.java
@@ -54,7 +54,7 @@
 
     @Override
     public TokenStream create(TokenStream tokenStream) {
-        ShingleFilter filter = new ShingleFilter(tokenStream, maxShingleSize, minShingleSize);
+        ShingleFilter filter = new ShingleFilter(tokenStream, minShingleSize, maxShingleSize);
         filter.setOutputUnigrams(outputUnigrams);
         filter.setOutputUnigramsIfNoShingles(outputUnigramsIfNoShingles);
         filter.setTokenSeparator(tokenSeparator);
