diff --git a/src/java/org/apache/solr/update/DirectUpdateHandler.java b/src/java/org/apache/solr/update/DirectUpdateHandler.java
index 8db3285..d935ac0 100644
--- a/src/java/org/apache/solr/update/DirectUpdateHandler.java
+++ b/src/java/org/apache/solr/update/DirectUpdateHandler.java
@@ -109,7 +109,7 @@
   }
 
   protected boolean existsInIndex(String indexedId) throws IOException {
-    if (idField == null) throw new SolrException(2,"Operation requires schema to have a unique key field");
+    if (idField == null) throw new SolrException(400,"Operation requires schema to have a unique key field");
 
     closeWriter();
     openSearcher();
@@ -127,7 +127,7 @@
 
 
   protected int deleteInIndex(String indexedId) throws IOException {
-    if (idField == null) throw new SolrException(2,"Operation requires schema to have a unique key field");
+    if (idField == null) throw new SolrException(400,"Operation requires schema to have a unique key field");
 
     closeWriter(); openSearcher();
     IndexReader ir = searcher.getReader();
