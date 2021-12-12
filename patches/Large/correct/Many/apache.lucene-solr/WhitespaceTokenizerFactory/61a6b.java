diff --git a/src/java/org/apache/solr/analysis/WhitespaceTokenizerFactory.java b/src/java/org/apache/solr/analysis/WhitespaceTokenizerFactory.java
index dce1d59..ec8aca0 100644
--- a/src/java/org/apache/solr/analysis/WhitespaceTokenizerFactory.java
+++ b/src/java/org/apache/solr/analysis/WhitespaceTokenizerFactory.java
@@ -26,7 +26,7 @@
  * @version $Id$
  */
 public class WhitespaceTokenizerFactory extends BaseTokenizerFactory {
-  public TokenStream create(Reader input) {
+  public WhitespaceTokenizer create(Reader input) {
     return new WhitespaceTokenizer(input);
   }
 }
