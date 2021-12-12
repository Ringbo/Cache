diff --git a/src/java/org/apache/solr/analysis/PhoneticFilterFactory.java b/src/java/org/apache/solr/analysis/PhoneticFilterFactory.java
index b66f4e8..c0c4188 100644
--- a/src/java/org/apache/solr/analysis/PhoneticFilterFactory.java
+++ b/src/java/org/apache/solr/analysis/PhoneticFilterFactory.java
@@ -86,7 +86,7 @@
     }
   }
   
-  public TokenStream create(TokenStream input) {
+  public PhoneticFilter create(TokenStream input) {
     return new PhoneticFilter(input,encoder,name,inject);
   }
 }
