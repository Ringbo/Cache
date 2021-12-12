diff --git a/src/java/org/apache/solr/analysis/StandardFilterFactory.java b/src/java/org/apache/solr/analysis/StandardFilterFactory.java
index e204de0..fb4b33c 100644
--- a/src/java/org/apache/solr/analysis/StandardFilterFactory.java
+++ b/src/java/org/apache/solr/analysis/StandardFilterFactory.java
@@ -24,7 +24,7 @@
  * @version $Id$
  */
 public class StandardFilterFactory extends BaseTokenFilterFactory {
-  public TokenStream create(TokenStream input) {
+  public StandardFilter create(TokenStream input) {
     return new StandardFilter(input);
   }
 }
