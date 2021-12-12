diff --git a/src/test/org/apache/lucene/document/TestBinaryDocument.java b/src/test/org/apache/lucene/document/TestBinaryDocument.java
index e438867..6785dd0 100644
--- a/src/test/org/apache/lucene/document/TestBinaryDocument.java
+++ b/src/test/org/apache/lucene/document/TestBinaryDocument.java
@@ -66,7 +66,7 @@
     
     /** add the doc to a ram index */
     RAMDirectory dir = new RAMDirectory();
-    IndexWriter writer = new IndexWriter(dir, new StandardAnalyzer(), true);
+    IndexWriter writer = new IndexWriter(dir, new StandardAnalyzer(), true, IndexWriter.MaxFieldLength.LIMITED);
     writer.addDocument(doc);
     writer.close();
     
