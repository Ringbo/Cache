diff --git a/src/java/org/apache/solr/analysis/LengthFilterFactory.java b/src/java/org/apache/solr/analysis/LengthFilterFactory.java
index 5edf5a5..15e96d0 100644
--- a/src/java/org/apache/solr/analysis/LengthFilterFactory.java
+++ b/src/java/org/apache/solr/analysis/LengthFilterFactory.java
@@ -33,7 +33,7 @@
     min=Integer.parseInt(args.get("min"));
     max=Integer.parseInt(args.get("max"));
   }
-  public TokenStream create(TokenStream input) {
+  public LengthFilter create(TokenStream input) {
     return new LengthFilter(input,min,max);
   }
 }
