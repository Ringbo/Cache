diff --git a/src/test/org/apache/lucene/search/TestMatchAllDocsQuery.java b/src/test/org/apache/lucene/search/TestMatchAllDocsQuery.java
index ba7c9bf..04f14b6 100644
--- a/src/test/org/apache/lucene/search/TestMatchAllDocsQuery.java
+++ b/src/test/org/apache/lucene/search/TestMatchAllDocsQuery.java
@@ -36,7 +36,7 @@
 
   public void testQuery() throws IOException {
     RAMDirectory dir = new RAMDirectory();
-    IndexWriter iw = new IndexWriter(dir, new StandardAnalyzer(), true);
+    IndexWriter iw = new IndexWriter(dir, new StandardAnalyzer(), true, IndexWriter.MaxFieldLength.LIMITED);
     addDoc("one", iw);
     addDoc("two", iw);
     addDoc("three four", iw);
