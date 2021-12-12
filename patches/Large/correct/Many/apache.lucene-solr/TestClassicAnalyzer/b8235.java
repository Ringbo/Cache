diff --git a/modules/analysis/common/src/test/org/apache/lucene/analysis/core/TestClassicAnalyzer.java b/modules/analysis/common/src/test/org/apache/lucene/analysis/core/TestClassicAnalyzer.java
index e106359..3ab1efb 100644
--- a/modules/analysis/common/src/test/org/apache/lucene/analysis/core/TestClassicAnalyzer.java
+++ b/modules/analysis/common/src/test/org/apache/lucene/analysis/core/TestClassicAnalyzer.java
@@ -270,7 +270,7 @@
     writer.addDocument(doc);
     writer.close();
 
-    IndexReader reader = IndexReader.open(dir, true);
+    IndexReader reader = IndexReader.open(dir);
 
     // Make sure all terms < max size were indexed
     assertEquals(2, reader.docFreq(new Term("content", "abc")));
@@ -303,7 +303,7 @@
     writer  = new IndexWriter(dir, new IndexWriterConfig(TEST_VERSION_CURRENT, sa));
     writer.addDocument(doc);
     writer.close();
-    reader = IndexReader.open(dir, true);
+    reader = IndexReader.open(dir);
     assertEquals(1, reader.docFreq(new Term("content", bigTerm)));
     reader.close();
 
