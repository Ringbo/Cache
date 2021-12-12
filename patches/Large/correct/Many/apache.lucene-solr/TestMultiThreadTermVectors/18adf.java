diff --git a/src/test/org/apache/lucene/search/TestMultiThreadTermVectors.java b/src/test/org/apache/lucene/search/TestMultiThreadTermVectors.java
index 2c4aef3..eb728df 100644
--- a/src/test/org/apache/lucene/search/TestMultiThreadTermVectors.java
+++ b/src/test/org/apache/lucene/search/TestMultiThreadTermVectors.java
@@ -44,7 +44,7 @@
   public void setUp() throws Exception {
     super.setUp();
     IndexWriter writer
-            = new IndexWriter(directory, new SimpleAnalyzer(), true);
+            = new IndexWriter(directory, new SimpleAnalyzer(), true, IndexWriter.MaxFieldLength.LIMITED);
     //writer.setUseCompoundFile(false);
     //writer.infoStream = System.out;
     for (int i = 0; i < numDocs; i++) {
