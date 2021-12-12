diff --git a/src/java/org/apache/solr/analysis/StandardTokenizerFactory.java b/src/java/org/apache/solr/analysis/StandardTokenizerFactory.java
index ad3f8f9..503eca7 100644
--- a/src/java/org/apache/solr/analysis/StandardTokenizerFactory.java
+++ b/src/java/org/apache/solr/analysis/StandardTokenizerFactory.java
@@ -27,7 +27,7 @@
  */
 
 public class StandardTokenizerFactory extends BaseTokenizerFactory {
-  public TokenStream create(Reader input) {
+  public StandardTokenizer create(Reader input) {
     return new StandardTokenizer(input);
   }
 }
