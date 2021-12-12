diff --git a/src/java/org/apache/solr/analysis/KeywordTokenizerFactory.java b/src/java/org/apache/solr/analysis/KeywordTokenizerFactory.java
index a8ddc16..8b9318a 100644
--- a/src/java/org/apache/solr/analysis/KeywordTokenizerFactory.java
+++ b/src/java/org/apache/solr/analysis/KeywordTokenizerFactory.java
@@ -26,7 +26,7 @@
  * @version $Id: LowerCaseTokenizerFactory.java 382610 2006-03-03 01:43:03Z yonik $
  */
 public class KeywordTokenizerFactory extends BaseTokenizerFactory {
-  public TokenStream create(Reader input) {
+  public KeywordTokenizer create(Reader input) {
     return new KeywordTokenizer(input);
   }
 }
