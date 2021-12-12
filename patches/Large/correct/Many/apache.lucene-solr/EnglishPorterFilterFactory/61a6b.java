diff --git a/src/java/org/apache/solr/analysis/EnglishPorterFilterFactory.java b/src/java/org/apache/solr/analysis/EnglishPorterFilterFactory.java
index 812bf8d..ba467dd 100644
--- a/src/java/org/apache/solr/analysis/EnglishPorterFilterFactory.java
+++ b/src/java/org/apache/solr/analysis/EnglishPorterFilterFactory.java
@@ -48,7 +48,7 @@
 
   private Set protectedWords = null;
 
-  public TokenStream create(TokenStream input) {
+  public EnglishPorterFilter create(TokenStream input) {
     return new EnglishPorterFilter(input,protectedWords);
   }
 }
