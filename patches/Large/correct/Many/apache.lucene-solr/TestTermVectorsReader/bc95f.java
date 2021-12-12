diff --git a/lucene/src/test/org/apache/lucene/index/TestTermVectorsReader.java b/lucene/src/test/org/apache/lucene/index/TestTermVectorsReader.java
index a708ff9..12ed832 100644
--- a/lucene/src/test/org/apache/lucene/index/TestTermVectorsReader.java
+++ b/lucene/src/test/org/apache/lucene/index/TestTermVectorsReader.java
@@ -184,7 +184,7 @@
 
   public void test() throws IOException {
     //Check to see the files were created properly in setup
-    IndexReader reader = IndexReader.open(dir);
+    DirectoryReader reader = IndexReader.open(dir);
     for (IndexReader r : reader.getSequentialSubReaders()) {
       SegmentInfo s = ((SegmentReader) r).getSegmentInfo();
       assertTrue(s.getHasVectors());
