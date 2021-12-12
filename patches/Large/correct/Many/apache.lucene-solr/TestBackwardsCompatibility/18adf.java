diff --git a/src/test/org/apache/lucene/index/TestBackwardsCompatibility.java b/src/test/org/apache/lucene/index/TestBackwardsCompatibility.java
index 52d8bd8..f64ad65 100644
--- a/src/test/org/apache/lucene/index/TestBackwardsCompatibility.java
+++ b/src/test/org/apache/lucene/index/TestBackwardsCompatibility.java
@@ -202,7 +202,7 @@
     Directory dir = FSDirectory.getDirectory(dirName);
 
     // open writer
-    IndexWriter writer = new IndexWriter(dir, autoCommit, new WhitespaceAnalyzer(), false);
+    IndexWriter writer = new IndexWriter(dir, autoCommit, new WhitespaceAnalyzer(), false, IndexWriter.MaxFieldLength.LIMITED);
 
     // add 10 docs
     for(int i=0;i<10;i++) {
@@ -240,7 +240,7 @@
     searcher.close();
 
     // optimize
-    writer = new IndexWriter(dir, autoCommit, new WhitespaceAnalyzer(), false);
+    writer = new IndexWriter(dir, autoCommit, new WhitespaceAnalyzer(), false, IndexWriter.MaxFieldLength.LIMITED);
     writer.optimize();
     writer.close();
 
@@ -290,7 +290,7 @@
     searcher.close();
 
     // optimize
-    IndexWriter writer = new IndexWriter(dir, autoCommit, new WhitespaceAnalyzer(), false);
+    IndexWriter writer = new IndexWriter(dir, autoCommit, new WhitespaceAnalyzer(), false, IndexWriter.MaxFieldLength.LIMITED);
     writer.optimize();
     writer.close();
 
@@ -312,7 +312,7 @@
     dirName = fullDir(dirName);
 
     Directory dir = FSDirectory.getDirectory(dirName);
-    IndexWriter writer = new IndexWriter(dir, new WhitespaceAnalyzer(), true);
+    IndexWriter writer = new IndexWriter(dir, new WhitespaceAnalyzer(), true, IndexWriter.MaxFieldLength.LIMITED);
     writer.setUseCompoundFile(doCFS);
     writer.setMaxBufferedDocs(10);
     
@@ -347,7 +347,7 @@
 
         boolean autoCommit = 0 == pass;
  
-        IndexWriter writer = new IndexWriter(dir, autoCommit, new WhitespaceAnalyzer(), true);
+        IndexWriter writer = new IndexWriter(dir, autoCommit, new WhitespaceAnalyzer(), true, IndexWriter.MaxFieldLength.LIMITED);
         writer.setRAMBufferSizeMB(16.0);
         //IndexWriter writer = new IndexWriter(dir, new WhitespaceAnalyzer(), true);
         for(int i=0;i<35;i++) {
