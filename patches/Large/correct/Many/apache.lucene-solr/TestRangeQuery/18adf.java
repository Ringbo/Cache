diff --git a/src/test/org/apache/lucene/search/TestRangeQuery.java b/src/test/org/apache/lucene/search/TestRangeQuery.java
index f530e0a..61a93f6 100644
--- a/src/test/org/apache/lucene/search/TestRangeQuery.java
+++ b/src/test/org/apache/lucene/search/TestRangeQuery.java
@@ -133,7 +133,7 @@
   }
 
   private void initializeIndex(String[] values) throws IOException {
-    IndexWriter writer = new IndexWriter(dir, new WhitespaceAnalyzer(), true);
+    IndexWriter writer = new IndexWriter(dir, new WhitespaceAnalyzer(), true, IndexWriter.MaxFieldLength.LIMITED);
     for (int i = 0; i < values.length; i++) {
       insertDoc(writer, values[i]);
     }
@@ -141,7 +141,7 @@
   }
 
   private void addDoc(String content) throws IOException {
-    IndexWriter writer = new IndexWriter(dir, new WhitespaceAnalyzer(), false);
+    IndexWriter writer = new IndexWriter(dir, new WhitespaceAnalyzer(), false, IndexWriter.MaxFieldLength.LIMITED);
     insertDoc(writer, content);
     writer.close();
   }
