diff --git a/src/java/org/apache/solr/analysis/ArabicLetterTokenizerFactory.java b/src/java/org/apache/solr/analysis/ArabicLetterTokenizerFactory.java
index 4730a7e..86524c8 100644
--- a/src/java/org/apache/solr/analysis/ArabicLetterTokenizerFactory.java
+++ b/src/java/org/apache/solr/analysis/ArabicLetterTokenizerFactory.java
@@ -12,7 +12,7 @@
  **/
 public class ArabicLetterTokenizerFactory extends BaseTokenizerFactory{
 
-  public TokenStream create(Reader input) {
+  public ArabicLetterTokenizer create(Reader input) {
     return new ArabicLetterTokenizer(input);
   }
 }
