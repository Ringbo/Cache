diff --git a/src/test/org/apache/lucene/search/TestScorerPerf.java b/src/test/org/apache/lucene/search/TestScorerPerf.java
index 6f5dcdc..1b0074c 100755
--- a/src/test/org/apache/lucene/search/TestScorerPerf.java
+++ b/src/test/org/apache/lucene/search/TestScorerPerf.java
@@ -50,7 +50,7 @@
       // Create a dummy index with nothing in it.
     // This could possibly fail if Lucene starts checking for docid ranges...
     RAMDirectory rd = new RAMDirectory();
-    IndexWriter iw = new IndexWriter(rd,new WhitespaceAnalyzer(), true);
+    IndexWriter iw = new IndexWriter(rd,new WhitespaceAnalyzer(), true, IndexWriter.MaxFieldLength.LIMITED);
     iw.close();
     s = new IndexSearcher(rd);
   }
@@ -64,7 +64,7 @@
       terms[i] = new Term("f",Character.toString((char)('A'+i)));
     }
 
-    IndexWriter iw = new IndexWriter(dir,new WhitespaceAnalyzer(), true);
+    IndexWriter iw = new IndexWriter(dir,new WhitespaceAnalyzer(), true, IndexWriter.MaxFieldLength.LIMITED);
     for (int i=0; i<nDocs; i++) {
       Document d = new Document();
       for (int j=0; j<nTerms; j++) {
