diff --git a/src/java/org/apache/solr/analysis/PorterStemFilterFactory.java b/src/java/org/apache/solr/analysis/PorterStemFilterFactory.java
index 6fdf6e7..36bc0f9 100644
--- a/src/java/org/apache/solr/analysis/PorterStemFilterFactory.java
+++ b/src/java/org/apache/solr/analysis/PorterStemFilterFactory.java
@@ -24,7 +24,7 @@
  * @version $Id$
  */
 public class PorterStemFilterFactory extends BaseTokenFilterFactory {
-  public TokenStream create(TokenStream input) {
+  public PorterStemFilter create(TokenStream input) {
     return new PorterStemFilter(input);
   }
 }
