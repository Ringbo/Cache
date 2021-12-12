diff --git a/src/java/org/apache/solr/analysis/CapitalizationFilterFactory.java b/src/java/org/apache/solr/analysis/CapitalizationFilterFactory.java
index e48bb10..6beafd8 100644
--- a/src/java/org/apache/solr/analysis/CapitalizationFilterFactory.java
+++ b/src/java/org/apache/solr/analysis/CapitalizationFilterFactory.java
@@ -153,7 +153,7 @@
     return word.toString();
   }
   
-  public TokenStream create(TokenStream input) {
+  public CapitalizationFilter create(TokenStream input) {
     return new CapitalizationFilter(input,this);
   }
 }
