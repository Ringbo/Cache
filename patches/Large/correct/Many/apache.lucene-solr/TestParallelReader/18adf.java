diff --git a/src/test/org/apache/lucene/index/TestParallelReader.java b/src/test/org/apache/lucene/index/TestParallelReader.java
index a813b74..6034bbb 100644
--- a/src/test/org/apache/lucene/index/TestParallelReader.java
+++ b/src/test/org/apache/lucene/index/TestParallelReader.java
@@ -106,7 +106,7 @@
 
     // one document only:
     Directory dir2 = new MockRAMDirectory();
-    IndexWriter w2 = new IndexWriter(dir2, new StandardAnalyzer(), true);
+    IndexWriter w2 = new IndexWriter(dir2, new StandardAnalyzer(), true, IndexWriter.MaxFieldLength.LIMITED);
     Document d3 = new Document();
     d3.add(new Field("f3", "v1", Field.Store.YES, Field.Index.TOKENIZED));
     w2.addDocument(d3);
@@ -151,13 +151,13 @@
     Directory dir2 = getDir1();
     
     // add another document to ensure that the indexes are not optimized
-    IndexWriter modifier = new IndexWriter(dir1, new StandardAnalyzer());
+    IndexWriter modifier = new IndexWriter(dir1, new StandardAnalyzer(), IndexWriter.MaxFieldLength.LIMITED);
     Document d = new Document();
     d.add(new Field("f1", "v1", Field.Store.YES, Field.Index.TOKENIZED));
     modifier.addDocument(d);
     modifier.close();
     
-    modifier = new IndexWriter(dir2, new StandardAnalyzer());
+    modifier = new IndexWriter(dir2, new StandardAnalyzer(), IndexWriter.MaxFieldLength.LIMITED);
     d = new Document();
     d.add(new Field("f2", "v2", Field.Store.YES, Field.Index.TOKENIZED));
     modifier.addDocument(d);
@@ -170,7 +170,7 @@
     assertFalse(pr.isOptimized());
     pr.close();
     
-    modifier = new IndexWriter(dir1, new StandardAnalyzer());
+    modifier = new IndexWriter(dir1, new StandardAnalyzer(), IndexWriter.MaxFieldLength.LIMITED);
     modifier.optimize();
     modifier.close();
     
@@ -182,7 +182,7 @@
     pr.close();
 
     
-    modifier = new IndexWriter(dir2, new StandardAnalyzer());
+    modifier = new IndexWriter(dir2, new StandardAnalyzer(), IndexWriter.MaxFieldLength.LIMITED);
     modifier.optimize();
     modifier.close();
     
@@ -214,7 +214,7 @@
   // Fields 1-4 indexed together:
   private Searcher single() throws IOException {
     Directory dir = new MockRAMDirectory();
-    IndexWriter w = new IndexWriter(dir, new StandardAnalyzer(), true);
+    IndexWriter w = new IndexWriter(dir, new StandardAnalyzer(), true, IndexWriter.MaxFieldLength.LIMITED);
     Document d1 = new Document();
     d1.add(new Field("f1", "v1", Field.Store.YES, Field.Index.TOKENIZED));
     d1.add(new Field("f2", "v1", Field.Store.YES, Field.Index.TOKENIZED));
@@ -244,7 +244,7 @@
 
   private Directory getDir1() throws IOException {
     Directory dir1 = new MockRAMDirectory();
-    IndexWriter w1 = new IndexWriter(dir1, new StandardAnalyzer(), true);
+    IndexWriter w1 = new IndexWriter(dir1, new StandardAnalyzer(), true, IndexWriter.MaxFieldLength.LIMITED);
     Document d1 = new Document();
     d1.add(new Field("f1", "v1", Field.Store.YES, Field.Index.TOKENIZED));
     d1.add(new Field("f2", "v1", Field.Store.YES, Field.Index.TOKENIZED));
@@ -259,7 +259,7 @@
 
   private Directory getDir2() throws IOException {
     Directory dir2 = new RAMDirectory();
-    IndexWriter w2 = new IndexWriter(dir2, new StandardAnalyzer(), true);
+    IndexWriter w2 = new IndexWriter(dir2, new StandardAnalyzer(), true, IndexWriter.MaxFieldLength.LIMITED);
     Document d3 = new Document();
     d3.add(new Field("f3", "v1", Field.Store.YES, Field.Index.TOKENIZED));
     d3.add(new Field("f4", "v1", Field.Store.YES, Field.Index.TOKENIZED));
