diff --git a/modules/queryparser/src/test/org/apache/lucene/queryparser/xml/builders/TestNumericRangeFilterBuilder.java b/modules/queryparser/src/test/org/apache/lucene/queryparser/xml/builders/TestNumericRangeFilterBuilder.java
index e409fa3..27948f1 100644
--- a/modules/queryparser/src/test/org/apache/lucene/queryparser/xml/builders/TestNumericRangeFilterBuilder.java
+++ b/modules/queryparser/src/test/org/apache/lucene/queryparser/xml/builders/TestNumericRangeFilterBuilder.java
@@ -63,7 +63,7 @@
     IndexWriter writer = new IndexWriter(ramDir, newIndexWriterConfig(TEST_VERSION_CURRENT, null));
     writer.commit();
     try {
-      IndexReader reader = new SlowMultiReaderWrapper(IndexReader.open(ramDir, true));
+      IndexReader reader = new SlowMultiReaderWrapper(IndexReader.open(ramDir));
       try {
         assertNull(filter.getDocIdSet((AtomicReaderContext) reader.getTopReaderContext(), reader.getLiveDocs()));
       }
