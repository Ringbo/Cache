diff --git a/src/test/org/apache/lucene/search/TestBooleanOr.java b/src/test/org/apache/lucene/search/TestBooleanOr.java
index 4cfdaab..1895aea 100644
--- a/src/test/org/apache/lucene/search/TestBooleanOr.java
+++ b/src/test/org/apache/lucene/search/TestBooleanOr.java
@@ -140,7 +140,7 @@
 		RAMDirectory rd = new RAMDirectory();
 
 		//
-		IndexWriter writer = new IndexWriter(rd, new StandardAnalyzer(), true);
+		IndexWriter writer = new IndexWriter(rd, new StandardAnalyzer(), true, IndexWriter.MaxFieldLength.LIMITED);
 
 		//
 		Document d = new Document();
