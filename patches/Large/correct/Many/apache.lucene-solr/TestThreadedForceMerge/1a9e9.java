diff --git a/lucene/src/test/org/apache/lucene/index/TestThreadedForceMerge.java b/lucene/src/test/org/apache/lucene/index/TestThreadedForceMerge.java
index aeb883a..5207919 100644
--- a/lucene/src/test/org/apache/lucene/index/TestThreadedForceMerge.java
+++ b/lucene/src/test/org/apache/lucene/index/TestThreadedForceMerge.java
@@ -123,7 +123,7 @@
           TEST_VERSION_CURRENT, ANALYZER).setOpenMode(
           OpenMode.APPEND).setMaxBufferedDocs(2));
       
-      IndexReader reader = IndexReader.open(directory);
+      DirectoryReader reader = IndexReader.open(directory);
       assertEquals("reader=" + reader, 1, reader.getSequentialSubReaders().length);
       assertEquals(expectedDocCount, reader.numDocs());
       reader.close();
