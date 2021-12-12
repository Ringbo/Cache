diff --git a/src/test/org/apache/lucene/index/TestAddIndexesNoOptimize.java b/src/test/org/apache/lucene/index/TestAddIndexesNoOptimize.java
index 70e9c33..781579f 100755
--- a/src/test/org/apache/lucene/index/TestAddIndexesNoOptimize.java
+++ b/src/test/org/apache/lucene/index/TestAddIndexesNoOptimize.java
@@ -326,7 +326,7 @@
 
   private IndexWriter newWriter(Directory dir, boolean create)
       throws IOException {
-    final IndexWriter writer = new IndexWriter(dir, new WhitespaceAnalyzer(), create);
+    final IndexWriter writer = new IndexWriter(dir, new WhitespaceAnalyzer(), create, IndexWriter.MaxFieldLength.LIMITED);
     writer.setMergePolicy(new LogDocMergePolicy());
     return writer;
   }
