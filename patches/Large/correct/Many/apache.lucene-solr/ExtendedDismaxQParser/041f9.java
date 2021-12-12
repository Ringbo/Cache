diff --git a/solr/core/src/java/org/apache/solr/search/ExtendedDismaxQParser.java b/solr/core/src/java/org/apache/solr/search/ExtendedDismaxQParser.java
index 75d550e..2f0c372 100644
--- a/solr/core/src/java/org/apache/solr/search/ExtendedDismaxQParser.java
+++ b/solr/core/src/java/org/apache/solr/search/ExtendedDismaxQParser.java
@@ -1494,7 +1494,7 @@
       try {
         queryFields = DisMaxQParser.parseQueryFields(req.getSchema(), solrParams);  // req.getSearcher() here causes searcher refcount imbalance
       } catch (SyntaxError e) {
-        throw new RuntimeException();
+        throw new RuntimeException(e);
       }
       // Phrase slop array
       int pslop[] = new int[4];
