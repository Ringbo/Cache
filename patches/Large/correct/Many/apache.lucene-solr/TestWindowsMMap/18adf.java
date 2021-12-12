diff --git a/src/test/org/apache/lucene/store/TestWindowsMMap.java b/src/test/org/apache/lucene/store/TestWindowsMMap.java
index c101228..2415310 100644
--- a/src/test/org/apache/lucene/store/TestWindowsMMap.java
+++ b/src/test/org/apache/lucene/store/TestWindowsMMap.java
@@ -72,7 +72,7 @@
 		// interior filters.
 		StandardAnalyzer analyzer = new StandardAnalyzer(new HashSet());
 		// TODO: something about lock timeouts and leftover locks.
-		IndexWriter writer = new IndexWriter(storeDirectory, analyzer, true);
+		IndexWriter writer = new IndexWriter(storeDirectory, analyzer, true, IndexWriter.MaxFieldLength.LIMITED);
 		IndexSearcher searcher = new IndexSearcher(storePathname);
 		
 		for(int dx = 0; dx < 1000; dx ++) {
