diff --git a/src/test/org/apache/lucene/search/TestFilteredQuery.java b/src/test/org/apache/lucene/search/TestFilteredQuery.java
index c4be795..669f56d 100644
--- a/src/test/org/apache/lucene/search/TestFilteredQuery.java
+++ b/src/test/org/apache/lucene/search/TestFilteredQuery.java
@@ -50,7 +50,7 @@
   public void setUp()
   throws Exception {
     directory = new RAMDirectory();
-    IndexWriter writer = new IndexWriter (directory, new WhitespaceAnalyzer(), true);
+    IndexWriter writer = new IndexWriter (directory, new WhitespaceAnalyzer(), true, IndexWriter.MaxFieldLength.LIMITED);
 
     Document doc = new Document();
     doc.add (new Field("field", "one two three four five", Field.Store.YES, Field.Index.TOKENIZED));
