diff --git a/src/test/org/apache/lucene/search/TestSort.java b/src/test/org/apache/lucene/search/TestSort.java
index 8e021cc..a93a22c 100644
--- a/src/test/org/apache/lucene/search/TestSort.java
+++ b/src/test/org/apache/lucene/search/TestSort.java
@@ -120,7 +120,7 @@
 	private Searcher getIndex (boolean even, boolean odd)
 	throws IOException {
 		RAMDirectory indexStore = new RAMDirectory ();
-		IndexWriter writer = new IndexWriter (indexStore, new SimpleAnalyzer(), true);
+		IndexWriter writer = new IndexWriter (indexStore, new SimpleAnalyzer(), true, IndexWriter.MaxFieldLength.LIMITED);
 		for (int i=0; i<data.length; ++i) {
 			if (((i%2)==0 && even) || ((i%2)==1 && odd)) {
 				Document doc = new Document();
