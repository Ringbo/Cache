diff --git a/src/java/org/apache/solr/analysis/ArabicStemFilterFactory.java b/src/java/org/apache/solr/analysis/ArabicStemFilterFactory.java
index b0408fc..7f273a2 100644
--- a/src/java/org/apache/solr/analysis/ArabicStemFilterFactory.java
+++ b/src/java/org/apache/solr/analysis/ArabicStemFilterFactory.java
@@ -11,7 +11,7 @@
 public class ArabicStemFilterFactory extends BaseTokenFilterFactory{
 
 
-  public TokenStream create(TokenStream input) {
+  public ArabicStemFilter create(TokenStream input) {
     return new ArabicStemFilter(input);
   }
 }
