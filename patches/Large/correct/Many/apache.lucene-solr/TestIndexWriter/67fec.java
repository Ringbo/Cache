diff --git a/lucene/src/test/org/apache/lucene/index/TestIndexWriter.java b/lucene/src/test/org/apache/lucene/index/TestIndexWriter.java
index 407fb39..89bafd9 100644
--- a/lucene/src/test/org/apache/lucene/index/TestIndexWriter.java
+++ b/lucene/src/test/org/apache/lucene/index/TestIndexWriter.java
@@ -688,7 +688,7 @@
     // Make sure it's OK to change RAM buffer size and
     // maxBufferedDocs in a write session
     public void testChangingRAMBuffer() throws IOException {
-      RAMDirectory dir = new RAMDirectory();      
+      Directory dir = newDirectory();      
       IndexWriter writer  = new IndexWriter(dir, newIndexWriterConfig(TEST_VERSION_CURRENT, new MockAnalyzer()));
       writer.getConfig().setMaxBufferedDocs(10);
       writer.getConfig().setRAMBufferSizeMB(IndexWriterConfig.DISABLE_AUTO_FLUSH);
@@ -742,7 +742,7 @@
     }
 
     public void testChangingRAMBuffer2() throws IOException {
-      RAMDirectory dir = new RAMDirectory();      
+      Directory dir = newDirectory();      
       IndexWriter writer  = new IndexWriter(dir, newIndexWriterConfig(TEST_VERSION_CURRENT, new MockAnalyzer()));
       writer.getConfig().setMaxBufferedDocs(10);
       writer.getConfig().setMaxBufferedDeleteTerms(10);
