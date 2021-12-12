diff --git a/src/java/org/apache/solr/analysis/SnowballPorterFilterFactory.java b/src/java/org/apache/solr/analysis/SnowballPorterFilterFactory.java
index 8538c53..ba05dbf 100644
--- a/src/java/org/apache/solr/analysis/SnowballPorterFilterFactory.java
+++ b/src/java/org/apache/solr/analysis/SnowballPorterFilterFactory.java
@@ -42,7 +42,7 @@
     SolrCore.log.fine("SnowballPorterFilterFactory: language=" + language);
   }
   
-  public TokenStream create(TokenStream input) {
+  public SnowballFilter create(TokenStream input) {
     return new SnowballFilter(input,language);
   }
 }
