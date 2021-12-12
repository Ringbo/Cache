diff --git a/lucene/src/test/org/apache/lucene/search/TestPhraseQuery.java b/lucene/src/test/org/apache/lucene/search/TestPhraseQuery.java
index 71621a3..162befd 100644
--- a/lucene/src/test/org/apache/lucene/search/TestPhraseQuery.java
+++ b/lucene/src/test/org/apache/lucene/search/TestPhraseQuery.java
@@ -335,7 +335,7 @@
   
   public void testSlopScoring() throws IOException {
     Directory directory = newDirectory();
-    RandomIndexWriter writer = new RandomIndexWriter(random, directory);
+    RandomIndexWriter writer = new RandomIndexWriter(random, directory, newIndexWriterConfig(TEST_VERSION_CURRENT, new MockAnalyzer()).setMergePolicy(newInOrderLogMergePolicy()));
 
     Document doc = new Document();
     doc.add(newField("field", "foo firstname lastname foo", Field.Store.YES, Field.Index.ANALYZED));
