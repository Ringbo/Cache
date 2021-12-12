diff --git a/src/test/org/apache/lucene/index/store/TestRAMDirectory.java b/src/test/org/apache/lucene/index/store/TestRAMDirectory.java
index 9456f6c..5e80e39 100644
--- a/src/test/org/apache/lucene/index/store/TestRAMDirectory.java
+++ b/src/test/org/apache/lucene/index/store/TestRAMDirectory.java
@@ -62,7 +62,7 @@
       throw new IOException("java.io.tmpdir undefined, cannot run test");
     indexDir = new File(tempDir, "RAMDirIndex");
     
-    IndexWriter writer  = new IndexWriter(indexDir, new WhitespaceAnalyzer(), true);
+    IndexWriter writer  = new IndexWriter(indexDir, new WhitespaceAnalyzer(), true, IndexWriter.MaxFieldLength.LIMITED);
     // add some documents
     Document doc = null;
     for (int i = 0; i < docsToAdd; i++) {
@@ -159,7 +159,7 @@
   public void testRAMDirectorySize() throws IOException, InterruptedException {
       
     final MockRAMDirectory ramDir = new MockRAMDirectory(indexDir.getCanonicalPath());
-    final IndexWriter writer  = new IndexWriter(ramDir, new WhitespaceAnalyzer(), false);
+    final IndexWriter writer  = new IndexWriter(ramDir, new WhitespaceAnalyzer(), false, IndexWriter.MaxFieldLength.LIMITED);
     writer.optimize();
     
     assertEquals(ramDir.sizeInBytes(), ramDir.getRecomputedSizeInBytes());
