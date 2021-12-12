diff --git a/src/test/org/apache/lucene/index/TestIndexWriterLockRelease.java b/src/test/org/apache/lucene/index/TestIndexWriterLockRelease.java
index 8736249..e7c5868 100644
--- a/src/test/org/apache/lucene/index/TestIndexWriterLockRelease.java
+++ b/src/test/org/apache/lucene/index/TestIndexWriterLockRelease.java
@@ -75,10 +75,10 @@
         IndexWriter im;
 
         try {
-            im = new IndexWriter(this.__test_dir, new org.apache.lucene.analysis.standard.StandardAnalyzer(), false);
+            im = new IndexWriter(this.__test_dir, new org.apache.lucene.analysis.standard.StandardAnalyzer(), false, IndexWriter.MaxFieldLength.LIMITED);
         } catch (FileNotFoundException e) {
             try {
-                im = new IndexWriter(this.__test_dir, new org.apache.lucene.analysis.standard.StandardAnalyzer(), false);
+                im = new IndexWriter(this.__test_dir, new org.apache.lucene.analysis.standard.StandardAnalyzer(), false, IndexWriter.MaxFieldLength.LIMITED);
             } catch (FileNotFoundException e1) {
             }
         }
