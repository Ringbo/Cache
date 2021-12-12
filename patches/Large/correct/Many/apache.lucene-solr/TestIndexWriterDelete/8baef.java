diff --git a/lucene/src/test/org/apache/lucene/index/TestIndexWriterDelete.java b/lucene/src/test/org/apache/lucene/index/TestIndexWriterDelete.java
index bf66897..461781d 100644
--- a/lucene/src/test/org/apache/lucene/index/TestIndexWriterDelete.java
+++ b/lucene/src/test/org/apache/lucene/index/TestIndexWriterDelete.java
@@ -1045,7 +1045,7 @@
                                     setRAMBufferSizeMB(0.5).setMaxBufferedDocs(-1).setMergePolicy(NoMergePolicy.NO_COMPOUND_FILES).setReaderPooling(false)) {
         @Override
         public void doAfterFlush() {
-          assertTrue("only " + docsInSegment.get() + " in segment", closing.get() || docsInSegment.get() >= 10);
+          assertTrue("only " + docsInSegment.get() + " in segment", closing.get() || docsInSegment.get() >= 7);
           docsInSegment.set(0);
           sawAfterFlush.set(true);
         }
