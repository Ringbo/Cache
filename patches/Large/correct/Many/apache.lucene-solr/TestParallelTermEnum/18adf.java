diff --git a/src/test/org/apache/lucene/index/TestParallelTermEnum.java b/src/test/org/apache/lucene/index/TestParallelTermEnum.java
index 573428c..25b7bae 100755
--- a/src/test/org/apache/lucene/index/TestParallelTermEnum.java
+++ b/src/test/org/apache/lucene/index/TestParallelTermEnum.java
@@ -38,7 +38,7 @@
         Document doc;
 
         RAMDirectory rd1 = new RAMDirectory();
-        IndexWriter iw1 = new IndexWriter(rd1, new SimpleAnalyzer(), true);
+        IndexWriter iw1 = new IndexWriter(rd1, new SimpleAnalyzer(), true, IndexWriter.MaxFieldLength.LIMITED);
 
         doc = new Document();
         doc.add(new Field("field1", "the quick brown fox jumps", Store.YES,
@@ -50,7 +50,7 @@
 
         iw1.close();
         RAMDirectory rd2 = new RAMDirectory();
-        IndexWriter iw2 = new IndexWriter(rd2, new SimpleAnalyzer(), true);
+        IndexWriter iw2 = new IndexWriter(rd2, new SimpleAnalyzer(), true, IndexWriter.MaxFieldLength.LIMITED);
 
         doc = new Document();
         doc.add(new Field("field0", "", Store.NO, Index.TOKENIZED));
