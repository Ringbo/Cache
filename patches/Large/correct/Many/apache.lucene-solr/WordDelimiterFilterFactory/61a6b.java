diff --git a/src/java/org/apache/solr/analysis/WordDelimiterFilterFactory.java b/src/java/org/apache/solr/analysis/WordDelimiterFilterFactory.java
index 83ed445..dcc533a 100644
--- a/src/java/org/apache/solr/analysis/WordDelimiterFilterFactory.java
+++ b/src/java/org/apache/solr/analysis/WordDelimiterFilterFactory.java
@@ -42,7 +42,7 @@
     splitOnCaseChange = getInt("splitOnCaseChange", 1);
   }
 
-  public TokenStream create(TokenStream input) {
+  public WordDelimiterFilter create(TokenStream input) {
     return new WordDelimiterFilter(input,
                                    generateWordParts, generateNumberParts,
                                    catenateWords, catenateNumbers, catenateAll,
