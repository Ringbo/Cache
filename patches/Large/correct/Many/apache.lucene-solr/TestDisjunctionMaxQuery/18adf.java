diff --git a/src/test/org/apache/lucene/search/TestDisjunctionMaxQuery.java b/src/test/org/apache/lucene/search/TestDisjunctionMaxQuery.java
index cefb3c5..0138485 100644
--- a/src/test/org/apache/lucene/search/TestDisjunctionMaxQuery.java
+++ b/src/test/org/apache/lucene/search/TestDisjunctionMaxQuery.java
@@ -78,7 +78,7 @@
         index = new RAMDirectory();
         IndexWriter writer = new IndexWriter(index,
                                              new WhitespaceAnalyzer(),
-                                             true);
+                                             true, IndexWriter.MaxFieldLength.LIMITED);
         writer.setSimilarity(sim);
 
         // hed is the most important field, dek is secondary
