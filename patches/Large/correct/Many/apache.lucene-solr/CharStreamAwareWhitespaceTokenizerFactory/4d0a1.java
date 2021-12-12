diff --git a/src/java/org/apache/solr/analysis/CharStreamAwareWhitespaceTokenizerFactory.java b/src/java/org/apache/solr/analysis/CharStreamAwareWhitespaceTokenizerFactory.java
index c2458ae..8dcd0d4 100644
--- a/src/java/org/apache/solr/analysis/CharStreamAwareWhitespaceTokenizerFactory.java
+++ b/src/java/org/apache/solr/analysis/CharStreamAwareWhitespaceTokenizerFactory.java
@@ -29,7 +29,7 @@
  */
 public class CharStreamAwareWhitespaceTokenizerFactory extends BaseTokenizerFactory {
 
-  public TokenStream create(Reader input) {
+  public CharStreamAwareWhitespaceTokenizer create(Reader input) {
     return new CharStreamAwareWhitespaceTokenizer( (CharStream)input );
   }
 }
