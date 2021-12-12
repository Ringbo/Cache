diff --git a/src/test/org/apache/lucene/index/TestFieldsReader.java b/src/test/org/apache/lucene/index/TestFieldsReader.java
index 79454c9..71c3e64 100644
--- a/src/test/org/apache/lucene/index/TestFieldsReader.java
+++ b/src/test/org/apache/lucene/index/TestFieldsReader.java
@@ -46,7 +46,7 @@
     fieldInfos = new FieldInfos();
     DocHelper.setupDoc(testDoc);
     fieldInfos.add(testDoc);
-    IndexWriter writer = new IndexWriter(dir, new WhitespaceAnalyzer(), true);
+    IndexWriter writer = new IndexWriter(dir, new WhitespaceAnalyzer(), true, IndexWriter.MaxFieldLength.LIMITED);
     writer.setUseCompoundFile(false);
     writer.addDocument(testDoc);
     writer.close();
@@ -204,7 +204,7 @@
     FSDirectory tmpDir = FSDirectory.getDirectory(file);
     assertTrue(tmpDir != null);
 
-    IndexWriter writer = new IndexWriter(tmpDir, new WhitespaceAnalyzer(), true);
+    IndexWriter writer = new IndexWriter(tmpDir, new WhitespaceAnalyzer(), true, IndexWriter.MaxFieldLength.LIMITED);
     writer.setUseCompoundFile(false);
     writer.addDocument(testDoc);
     writer.close();
