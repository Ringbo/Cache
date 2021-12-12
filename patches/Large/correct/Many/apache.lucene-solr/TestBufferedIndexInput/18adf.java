diff --git a/src/test/org/apache/lucene/store/TestBufferedIndexInput.java b/src/test/org/apache/lucene/store/TestBufferedIndexInput.java
index 9b51c86..af1773d 100755
--- a/src/test/org/apache/lucene/store/TestBufferedIndexInput.java
+++ b/src/test/org/apache/lucene/store/TestBufferedIndexInput.java
@@ -159,7 +159,7 @@
       File indexDir = new File(System.getProperty("tempDir"), "testSetBufferSize");
       MockFSDirectory dir = new MockFSDirectory(indexDir);
       try {
-        IndexWriter writer = new IndexWriter(dir, new WhitespaceAnalyzer(), true);
+        IndexWriter writer = new IndexWriter(dir, new WhitespaceAnalyzer(), true, IndexWriter.MaxFieldLength.LIMITED);
         writer.setUseCompoundFile(false);
         for(int i=0;i<37;i++) {
           Document doc = new Document();
