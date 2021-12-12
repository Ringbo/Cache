diff --git a/src/test/org/apache/lucene/index/TestIndexWriterMerging.java b/src/test/org/apache/lucene/index/TestIndexWriterMerging.java
index 915e084..5cf5402 100644
--- a/src/test/org/apache/lucene/index/TestIndexWriterMerging.java
+++ b/src/test/org/apache/lucene/index/TestIndexWriterMerging.java
@@ -56,7 +56,7 @@
 
     Directory merged = new MockRAMDirectory();
 
-    IndexWriter writer = new IndexWriter(merged, new StandardAnalyzer(), true);
+    IndexWriter writer = new IndexWriter(merged, new StandardAnalyzer(), true, IndexWriter.MaxFieldLength.LIMITED);
     writer.setMergeFactor(2);
 
     writer.addIndexes(new Directory[]{indexA, indexB});
@@ -92,7 +92,7 @@
   private void fillIndex(Directory dir, int start, int numDocs) throws IOException
   {
 
-    IndexWriter writer = new IndexWriter(dir, new StandardAnalyzer(), true);
+    IndexWriter writer = new IndexWriter(dir, new StandardAnalyzer(), true, IndexWriter.MaxFieldLength.LIMITED);
     writer.setMergeFactor(2);
     writer.setMaxBufferedDocs(2);
 
