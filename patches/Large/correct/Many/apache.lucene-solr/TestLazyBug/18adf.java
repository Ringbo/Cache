diff --git a/src/test/org/apache/lucene/index/TestLazyBug.java b/src/test/org/apache/lucene/index/TestLazyBug.java
index 1965f64..b7325b4 100755
--- a/src/test/org/apache/lucene/index/TestLazyBug.java
+++ b/src/test/org/apache/lucene/index/TestLazyBug.java
@@ -67,7 +67,7 @@
     try {
       Random r = new Random(BASE_SEED + 42) ; 
       Analyzer analyzer = new SimpleAnalyzer();
-      IndexWriter writer = new IndexWriter(dir, analyzer, true);
+      IndexWriter writer = new IndexWriter(dir, analyzer, true, IndexWriter.MaxFieldLength.LIMITED);
       
       writer.setUseCompoundFile(false);
       
