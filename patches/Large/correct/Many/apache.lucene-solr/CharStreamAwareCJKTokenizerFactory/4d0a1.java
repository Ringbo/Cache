diff --git a/src/java/org/apache/solr/analysis/CharStreamAwareCJKTokenizerFactory.java b/src/java/org/apache/solr/analysis/CharStreamAwareCJKTokenizerFactory.java
index fdb4ec9..13f7887 100644
--- a/src/java/org/apache/solr/analysis/CharStreamAwareCJKTokenizerFactory.java
+++ b/src/java/org/apache/solr/analysis/CharStreamAwareCJKTokenizerFactory.java
@@ -29,7 +29,7 @@
  */
 public class CharStreamAwareCJKTokenizerFactory extends BaseTokenizerFactory {
 
-  public TokenStream create(Reader input) {
+  public CharStreamAwareCJKTokenizer create(Reader input) {
     return new CharStreamAwareCJKTokenizer( (CharStream)input );
   }
 }
