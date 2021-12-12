diff --git a/src/test/org/apache/lucene/search/TestCachingWrapperFilter.java b/src/test/org/apache/lucene/search/TestCachingWrapperFilter.java
index 9a4c7d0..c40495d 100644
--- a/src/test/org/apache/lucene/search/TestCachingWrapperFilter.java
+++ b/src/test/org/apache/lucene/search/TestCachingWrapperFilter.java
@@ -27,7 +27,7 @@
 public class TestCachingWrapperFilter extends LuceneTestCase {
   public void testCachingWorks() throws Exception {
     Directory dir = new RAMDirectory();
-    IndexWriter writer = new IndexWriter(dir, new StandardAnalyzer(), true);
+    IndexWriter writer = new IndexWriter(dir, new StandardAnalyzer(), true, IndexWriter.MaxFieldLength.LIMITED);
     writer.close();
 
     IndexReader reader = IndexReader.open(dir);
