diff --git a/src/test/org/apache/lucene/index/TestIndexFileDeleter.java b/src/test/org/apache/lucene/index/TestIndexFileDeleter.java
index 6a34292..7ff3fc4 100644
--- a/src/test/org/apache/lucene/index/TestIndexFileDeleter.java
+++ b/src/test/org/apache/lucene/index/TestIndexFileDeleter.java
@@ -50,7 +50,7 @@
 
     Directory dir = new RAMDirectory();
 
-    IndexWriter writer = new IndexWriter(dir, new WhitespaceAnalyzer(), true);
+    IndexWriter writer = new IndexWriter(dir, new WhitespaceAnalyzer(), true, IndexWriter.MaxFieldLength.LIMITED);
     writer.setMaxBufferedDocs(10);
     int i;
     for(i=0;i<35;i++) {
@@ -155,7 +155,7 @@
 
     // Open & close a writer: it should delete the above 4
     // files and nothing more:
-    writer = new IndexWriter(dir, new WhitespaceAnalyzer(), false);
+    writer = new IndexWriter(dir, new WhitespaceAnalyzer(), false, IndexWriter.MaxFieldLength.LIMITED);
     writer.close();
 
     String[] files2 = dir.list();
