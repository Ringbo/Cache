diff --git a/src/test/org/apache/lucene/TestMergeSchedulerExternal.java b/src/test/org/apache/lucene/TestMergeSchedulerExternal.java
index 4a6ae20..7783f0a 100644
--- a/src/test/org/apache/lucene/TestMergeSchedulerExternal.java
+++ b/src/test/org/apache/lucene/TestMergeSchedulerExternal.java
@@ -91,7 +91,7 @@
     Field idField = new Field("id", "", Field.Store.YES, Field.Index.UN_TOKENIZED);
     doc.add(idField);
     
-    IndexWriter writer = new IndexWriter(dir, true, new WhitespaceAnalyzer(), true);
+    IndexWriter writer = new IndexWriter(dir, true, new WhitespaceAnalyzer(), true, IndexWriter.MaxFieldLength.LIMITED);
     MyMergeScheduler ms = new MyMergeScheduler();
     writer.setMergeScheduler(ms);
     writer.setMaxBufferedDocs(2);
