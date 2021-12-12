diff --git a/src/test/org/apache/lucene/search/TestCustomSearcherSort.java b/src/test/org/apache/lucene/search/TestCustomSearcherSort.java
index 0aced13..1c85d22 100644
--- a/src/test/org/apache/lucene/search/TestCustomSearcherSort.java
+++ b/src/test/org/apache/lucene/search/TestCustomSearcherSort.java
@@ -71,7 +71,7 @@
 	private Directory getIndex()
 	throws IOException {
 	        RAMDirectory indexStore = new RAMDirectory ();
-	        IndexWriter writer = new IndexWriter (indexStore, new StandardAnalyzer(), true);
+	        IndexWriter writer = new IndexWriter (indexStore, new StandardAnalyzer(), true, IndexWriter.MaxFieldLength.LIMITED);
 	        RandomGen random = new RandomGen();
 	        for (int i=0; i<INDEX_SIZE; ++i) { // don't decrease; if to low the problem doesn't show up
 	        Document doc = new Document();
