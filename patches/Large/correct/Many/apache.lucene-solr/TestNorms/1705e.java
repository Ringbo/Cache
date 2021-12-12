diff --git a/lucene/core/src/test/org/apache/lucene/index/TestNorms.java b/lucene/core/src/test/org/apache/lucene/index/TestNorms.java
index 4100885..82ac27d 100644
--- a/lucene/core/src/test/org/apache/lucene/index/TestNorms.java
+++ b/lucene/core/src/test/org/apache/lucene/index/TestNorms.java
@@ -69,7 +69,8 @@
   public void buildIndex(Directory dir) throws IOException {
     Random random = random();
     MockAnalyzer analyzer = new MockAnalyzer(random());
-    analyzer.setMaxTokenLength(TestUtil.nextInt(random(), 1, IndexWriter.MAX_TERM_LENGTH));
+    // we need at least 3 for maxTokenLength otherwise norms are messed up
+    analyzer.setMaxTokenLength(TestUtil.nextInt(random(), 3, IndexWriter.MAX_TERM_LENGTH));
     IndexWriterConfig config = newIndexWriterConfig(analyzer);
     Similarity provider = new MySimProvider();
     config.setSimilarity(provider);
