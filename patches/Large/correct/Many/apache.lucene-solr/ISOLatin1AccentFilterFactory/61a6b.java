diff --git a/src/java/org/apache/solr/analysis/ISOLatin1AccentFilterFactory.java b/src/java/org/apache/solr/analysis/ISOLatin1AccentFilterFactory.java
index 14d4f84..8181edd 100644
--- a/src/java/org/apache/solr/analysis/ISOLatin1AccentFilterFactory.java
+++ b/src/java/org/apache/solr/analysis/ISOLatin1AccentFilterFactory.java
@@ -24,7 +24,7 @@
  *  $Id$ 
  */
 public class ISOLatin1AccentFilterFactory extends BaseTokenFilterFactory {
-  public TokenStream create(TokenStream input) {
+  public ISOLatin1AccentFilter create(TokenStream input) {
     return new ISOLatin1AccentFilter(input);
   }
 }
