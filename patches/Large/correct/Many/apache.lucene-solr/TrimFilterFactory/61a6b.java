diff --git a/src/java/org/apache/solr/analysis/TrimFilterFactory.java b/src/java/org/apache/solr/analysis/TrimFilterFactory.java
index b441bee..2a89999 100644
--- a/src/java/org/apache/solr/analysis/TrimFilterFactory.java
+++ b/src/java/org/apache/solr/analysis/TrimFilterFactory.java
@@ -46,7 +46,7 @@
     }
   }
   
-  public TokenStream create(TokenStream input) {
+  public TrimFilter create(TokenStream input) {
     return new TrimFilter(input, updateOffsets);
   }
 }
