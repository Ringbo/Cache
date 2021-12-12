diff --git a/src/java/org/apache/solr/analysis/RemoveDuplicatesTokenFilterFactory.java b/src/java/org/apache/solr/analysis/RemoveDuplicatesTokenFilterFactory.java
index b9e8c44..202eb0e 100644
--- a/src/java/org/apache/solr/analysis/RemoveDuplicatesTokenFilterFactory.java
+++ b/src/java/org/apache/solr/analysis/RemoveDuplicatesTokenFilterFactory.java
@@ -23,7 +23,7 @@
  * @version $Id:$
  */
 public class RemoveDuplicatesTokenFilterFactory extends BaseTokenFilterFactory {
-  public TokenStream create(TokenStream input) {
+  public RemoveDuplicatesTokenFilter create(TokenStream input) {
     return new RemoveDuplicatesTokenFilter(input);
   }
 }
