diff --git a/src/test/org/apache/lucene/search/TestThreadSafe.java b/src/test/org/apache/lucene/search/TestThreadSafe.java
index c82dba1..10b3c69 100755
--- a/src/test/org/apache/lucene/search/TestThreadSafe.java
+++ b/src/test/org/apache/lucene/search/TestThreadSafe.java
@@ -109,7 +109,7 @@
   String[] words = "now is the time for all good men to come to the aid of their country".split(" ");
 
   void buildDir(Directory dir, int nDocs, int maxFields, int maxFieldLen) throws IOException {
-    IndexWriter iw = new IndexWriter(dir, new WhitespaceAnalyzer(), true);
+    IndexWriter iw = new IndexWriter(dir, new WhitespaceAnalyzer(), true, IndexWriter.MaxFieldLength.LIMITED);
     iw.setMaxBufferedDocs(10);
     for (int j=0; j<nDocs; j++) {
       Document d = new Document();
