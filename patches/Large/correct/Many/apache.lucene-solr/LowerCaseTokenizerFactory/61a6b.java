diff --git a/src/java/org/apache/solr/analysis/LowerCaseTokenizerFactory.java b/src/java/org/apache/solr/analysis/LowerCaseTokenizerFactory.java
index 4a99a72..6246e24 100644
--- a/src/java/org/apache/solr/analysis/LowerCaseTokenizerFactory.java
+++ b/src/java/org/apache/solr/analysis/LowerCaseTokenizerFactory.java
@@ -26,7 +26,7 @@
  * @version $Id$
  */
 public class LowerCaseTokenizerFactory extends BaseTokenizerFactory {
-  public TokenStream create(Reader input) {
+  public LowerCaseTokenizer create(Reader input) {
     return new LowerCaseTokenizer(input);
   }
 }
