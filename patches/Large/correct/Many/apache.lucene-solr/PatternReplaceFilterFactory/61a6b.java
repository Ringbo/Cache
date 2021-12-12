diff --git a/src/java/org/apache/solr/analysis/PatternReplaceFilterFactory.java b/src/java/org/apache/solr/analysis/PatternReplaceFilterFactory.java
index 6d137b4..0306a80 100644
--- a/src/java/org/apache/solr/analysis/PatternReplaceFilterFactory.java
+++ b/src/java/org/apache/solr/analysis/PatternReplaceFilterFactory.java
@@ -60,7 +60,7 @@
     }
 
   }
-  public TokenStream create(TokenStream input) {
+  public PatternReplaceFilter create(TokenStream input) {
     return new PatternReplaceFilter(input, p, replacement, all);
   }
 }
