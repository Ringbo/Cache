diff --git a/src/java/org/apache/solr/analysis/LetterTokenizerFactory.java b/src/java/org/apache/solr/analysis/LetterTokenizerFactory.java
index 1ee188b..9b14fd9 100644
--- a/src/java/org/apache/solr/analysis/LetterTokenizerFactory.java
+++ b/src/java/org/apache/solr/analysis/LetterTokenizerFactory.java
@@ -26,7 +26,7 @@
  * @version $Id$
  */
 public class LetterTokenizerFactory extends BaseTokenizerFactory {
-  public TokenStream create(Reader input) {
+  public LetterTokenizer create(Reader input) {
     return new LetterTokenizer(input);
   }
 }
