diff --git a/src/test/org/apache/lucene/search/TestFuzzyQuery.java b/src/test/org/apache/lucene/search/TestFuzzyQuery.java
index 81df1fa..e443818 100644
--- a/src/test/org/apache/lucene/search/TestFuzzyQuery.java
+++ b/src/test/org/apache/lucene/search/TestFuzzyQuery.java
@@ -36,7 +36,7 @@
 
   public void testFuzziness() throws Exception {
     RAMDirectory directory = new RAMDirectory();
-    IndexWriter writer = new IndexWriter(directory, new WhitespaceAnalyzer(), true);
+    IndexWriter writer = new IndexWriter(directory, new WhitespaceAnalyzer(), true, IndexWriter.MaxFieldLength.LIMITED);
     addDoc("aaaaa", writer);
     addDoc("aaaab", writer);
     addDoc("aaabb", writer);
@@ -164,7 +164,7 @@
 
   public void testFuzzinessLong() throws Exception {
     RAMDirectory directory = new RAMDirectory();
-    IndexWriter writer = new IndexWriter(directory, new WhitespaceAnalyzer(), true);
+    IndexWriter writer = new IndexWriter(directory, new WhitespaceAnalyzer(), true, IndexWriter.MaxFieldLength.LIMITED);
     addDoc("aaaaaaa", writer);
     addDoc("segment", writer);
     writer.optimize();
