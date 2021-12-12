diff --git a/src/test/org/apache/lucene/search/TestWildcard.java b/src/test/org/apache/lucene/search/TestWildcard.java
index e2abc91..b29bafd 100644
--- a/src/test/org/apache/lucene/search/TestWildcard.java
+++ b/src/test/org/apache/lucene/search/TestWildcard.java
@@ -135,7 +135,7 @@
         writer.addDocument(doc4);
 	writer.optimize();
 	IndexSearcher searcher = new IndexSearcher(indexStore);
-	Query query1 = new TermQuery(new Term("body", "m?tal"));       // 1
+	    Query query1 = new WildcardQuery(new Term("body", "m?tal"));       // 1
         Query query2 = new WildcardQuery(new Term("body", "metal?"));  // 2
         Query query3 = new WildcardQuery(new Term("body", "metals?")); // 1
         Query query4 = new WildcardQuery(new Term("body", "m?t?ls"));  // 3
