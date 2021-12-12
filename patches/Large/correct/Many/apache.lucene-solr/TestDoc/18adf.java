diff --git a/src/test/org/apache/lucene/index/TestDoc.java b/src/test/org/apache/lucene/index/TestDoc.java
index 343a3a3..e001de9 100644
--- a/src/test/org/apache/lucene/index/TestDoc.java
+++ b/src/test/org/apache/lucene/index/TestDoc.java
@@ -107,7 +107,7 @@
       PrintWriter out = new PrintWriter(sw, true);
 
       Directory directory = FSDirectory.getDirectory(indexDir);
-      IndexWriter writer = new IndexWriter(directory, new SimpleAnalyzer(), true);
+      IndexWriter writer = new IndexWriter(directory, new SimpleAnalyzer(), true, IndexWriter.MaxFieldLength.LIMITED);
 
       SegmentInfo si1 = indexDoc(writer, "test.txt");
       printSegment(out, si1);
@@ -135,7 +135,7 @@
       out = new PrintWriter(sw, true);
 
       directory = FSDirectory.getDirectory(indexDir);
-      writer = new IndexWriter(directory, new SimpleAnalyzer(), true);
+      writer = new IndexWriter(directory, new SimpleAnalyzer(), true, IndexWriter.MaxFieldLength.LIMITED);
 
       si1 = indexDoc(writer, "test.txt");
       printSegment(out, si1);
