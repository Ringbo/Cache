diff --git a/src/test/org/apache/lucene/search/spans/TestSpansAdvanced2.java b/src/test/org/apache/lucene/search/spans/TestSpansAdvanced2.java
index 2321fed..a6b7c94 100644
--- a/src/test/org/apache/lucene/search/spans/TestSpansAdvanced2.java
+++ b/src/test/org/apache/lucene/search/spans/TestSpansAdvanced2.java
@@ -40,7 +40,7 @@
         super.setUp();
 
         // create test index
-        final IndexWriter writer = new IndexWriter(mDirectory, new StandardAnalyzer(), false);
+        final IndexWriter writer = new IndexWriter(mDirectory, new StandardAnalyzer(), false, IndexWriter.MaxFieldLength.LIMITED);
         addDocument(writer, "A", "Should we, could we, would we?");
         addDocument(writer, "B", "It should.  Should it?");
         addDocument(writer, "C", "It shouldn't.");
