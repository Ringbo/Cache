diff --git a/src/java/org/apache/solr/analysis/LowerCaseFilterFactory.java b/src/java/org/apache/solr/analysis/LowerCaseFilterFactory.java
index ba2b08c..bc2ce5f 100644
--- a/src/java/org/apache/solr/analysis/LowerCaseFilterFactory.java
+++ b/src/java/org/apache/solr/analysis/LowerCaseFilterFactory.java
@@ -24,7 +24,7 @@
  * @version $Id$
  */
 public class LowerCaseFilterFactory extends BaseTokenFilterFactory {
-  public TokenStream create(TokenStream input) {
+  public LowerCaseFilter create(TokenStream input) {
     return new LowerCaseFilter(input);
   }
 }
