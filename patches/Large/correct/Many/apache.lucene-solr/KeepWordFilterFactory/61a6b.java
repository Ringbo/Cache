diff --git a/src/java/org/apache/solr/analysis/KeepWordFilterFactory.java b/src/java/org/apache/solr/analysis/KeepWordFilterFactory.java
index 9a40061..55a6c39 100644
--- a/src/java/org/apache/solr/analysis/KeepWordFilterFactory.java
+++ b/src/java/org/apache/solr/analysis/KeepWordFilterFactory.java
@@ -66,7 +66,7 @@
     this.ignoreCase = ignoreCase;
   }
   
-  public TokenStream create(TokenStream input) {
+  public KeepWordFilter create(TokenStream input) {
     return new KeepWordFilter(input,words,ignoreCase);
   }
 }
