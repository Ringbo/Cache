diff --git a/src/test/org/apache/lucene/index/TestSegmentTermEnum.java b/src/test/org/apache/lucene/index/TestSegmentTermEnum.java
index 03091e3..381c80d 100644
--- a/src/test/org/apache/lucene/index/TestSegmentTermEnum.java
+++ b/src/test/org/apache/lucene/index/TestSegmentTermEnum.java
@@ -43,9 +43,9 @@
   {
     IndexWriter writer = null;
 
-    writer  = new IndexWriter(dir, new WhitespaceAnalyzer(), true);
+    writer  = new IndexWriter(dir, new WhitespaceAnalyzer(), true, IndexWriter.MaxFieldLength.LIMITED);
 
-    // add 100 documents with term : aaa
+    // ADD 100 documents with term : aaa
     // add 100 documents with terms: aaa bbb
     // Therefore, term 'aaa' has document frequency of 200 and term 'bbb' 100
     for (int i = 0; i < 100; i++) {
@@ -59,7 +59,7 @@
     verifyDocFreq();
 
     // merge segments by optimizing the index
-    writer = new IndexWriter(dir, new WhitespaceAnalyzer(), false);
+    writer = new IndexWriter(dir, new WhitespaceAnalyzer(), false, IndexWriter.MaxFieldLength.LIMITED);
     writer.optimize();
     writer.close();
 
@@ -70,7 +70,7 @@
   public void testPrevTermAtEnd() throws IOException
   {
     Directory dir = new MockRAMDirectory();
-    IndexWriter writer  = new IndexWriter(dir, new WhitespaceAnalyzer(), true);
+    IndexWriter writer  = new IndexWriter(dir, new WhitespaceAnalyzer(), true, IndexWriter.MaxFieldLength.LIMITED);
     addDoc(writer, "aaa bbb");
     writer.close();
     IndexReader reader = IndexReader.open(dir);
