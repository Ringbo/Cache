diff --git a/lucene/src/test/org/apache/lucene/index/TestIndexWriterExceptions.java b/lucene/src/test/org/apache/lucene/index/TestIndexWriterExceptions.java
index 61e167e..bb5e506 100644
--- a/lucene/src/test/org/apache/lucene/index/TestIndexWriterExceptions.java
+++ b/lucene/src/test/org/apache/lucene/index/TestIndexWriterExceptions.java
@@ -111,7 +111,7 @@
 
       doc.add(newField(r, "content7", "aaa bbb ccc ddd", Field.Store.NO, Field.Index.NOT_ANALYZED, Field.TermVector.WITH_POSITIONS_OFFSETS));
 
-      final Field idField = newField("id", "", Field.Store.YES, Field.Index.NOT_ANALYZED);
+      final Field idField = newField(r, "id", "", Field.Store.YES, Field.Index.NOT_ANALYZED);
       doc.add(idField);
 
       final long stopTime = System.currentTimeMillis() + 500;
