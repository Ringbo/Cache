diff --git a/src/java/org/apache/solr/analysis/ArabicNormalizationFilterFactory.java b/src/java/org/apache/solr/analysis/ArabicNormalizationFilterFactory.java
index 74cefb1..8646412 100644
--- a/src/java/org/apache/solr/analysis/ArabicNormalizationFilterFactory.java
+++ b/src/java/org/apache/solr/analysis/ArabicNormalizationFilterFactory.java
@@ -10,7 +10,7 @@
  **/
 public class ArabicNormalizationFilterFactory extends BaseTokenFilterFactory{
 
-  public TokenStream create(TokenStream input) {
+  public ArabicNormalizationFilter create(TokenStream input) {
     return new ArabicNormalizationFilter(input);
   }
 }
