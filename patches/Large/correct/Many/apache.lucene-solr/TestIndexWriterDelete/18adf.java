diff --git a/src/test/org/apache/lucene/index/TestIndexWriterDelete.java b/src/test/org/apache/lucene/index/TestIndexWriterDelete.java
index 605ff87..18d190f 100644
--- a/src/test/org/apache/lucene/index/TestIndexWriterDelete.java
+++ b/src/test/org/apache/lucene/index/TestIndexWriterDelete.java
@@ -47,7 +47,7 @@
 
       Directory dir = new RAMDirectory();
       IndexWriter modifier = new IndexWriter(dir, autoCommit,
-                                             new WhitespaceAnalyzer(), true);
+                                             new WhitespaceAnalyzer(), true, IndexWriter.MaxFieldLength.LIMITED);
       modifier.setUseCompoundFile(true);
       modifier.setMaxBufferedDeleteTerms(1);
 
@@ -74,7 +74,7 @@
       int hitCount = getHitCount(dir, term);
       assertEquals(1, hitCount);
       if (!autoCommit) {
-        modifier = new IndexWriter(dir, autoCommit, new WhitespaceAnalyzer());
+        modifier = new IndexWriter(dir, autoCommit, new WhitespaceAnalyzer(), IndexWriter.MaxFieldLength.LIMITED);
         modifier.setUseCompoundFile(true);
       }
       modifier.deleteDocuments(term);
@@ -98,7 +98,7 @@
 
       Directory dir = new RAMDirectory();
       IndexWriter modifier = new IndexWriter(dir, autoCommit,
-                                             new WhitespaceAnalyzer(), true);
+                                             new WhitespaceAnalyzer(), true, IndexWriter.MaxFieldLength.LIMITED);
       modifier.setMaxBufferedDocs(2);
       modifier.setMaxBufferedDeleteTerms(2);
 
@@ -122,7 +122,7 @@
       reader.close();
 
       if (!autoCommit) {
-        modifier = new IndexWriter(dir, autoCommit, new WhitespaceAnalyzer());
+        modifier = new IndexWriter(dir, autoCommit, new WhitespaceAnalyzer(), IndexWriter.MaxFieldLength.LIMITED);
         modifier.setMaxBufferedDocs(2);
         modifier.setMaxBufferedDeleteTerms(2);
       }
@@ -150,7 +150,7 @@
       boolean autoCommit = (0==pass);
       Directory dir = new RAMDirectory();
       IndexWriter modifier = new IndexWriter(dir, autoCommit,
-                                             new WhitespaceAnalyzer(), true);
+                                             new WhitespaceAnalyzer(), true, IndexWriter.MaxFieldLength.LIMITED);
       modifier.setMaxBufferedDocs(4);
       modifier.setMaxBufferedDeleteTerms(4);
 
@@ -193,7 +193,7 @@
 
       Directory dir = new RAMDirectory();
       IndexWriter modifier = new IndexWriter(dir, autoCommit,
-                                             new WhitespaceAnalyzer(), true);
+                                             new WhitespaceAnalyzer(), true, IndexWriter.MaxFieldLength.LIMITED);
       modifier.setMaxBufferedDocs(100);
       modifier.setMaxBufferedDeleteTerms(100);
 
@@ -234,7 +234,7 @@
       boolean autoCommit = (0==pass);
       Directory dir = new RAMDirectory();
       IndexWriter modifier = new IndexWriter(dir, autoCommit,
-                                             new WhitespaceAnalyzer(), true);
+                                             new WhitespaceAnalyzer(), true, IndexWriter.MaxFieldLength.LIMITED);
       modifier.setMaxBufferedDocs(2);
       modifier.setMaxBufferedDeleteTerms(2);
 
@@ -255,7 +255,7 @@
       
       if (!autoCommit) {
         modifier = new IndexWriter(dir, autoCommit,
-                                   new WhitespaceAnalyzer());
+                                   new WhitespaceAnalyzer(), IndexWriter.MaxFieldLength.LIMITED);
         modifier.setMaxBufferedDocs(2);
         modifier.setMaxBufferedDeleteTerms(2);
       }
@@ -278,7 +278,7 @@
       }
       if (!autoCommit) {
         modifier = new IndexWriter(dir, autoCommit,
-                                   new WhitespaceAnalyzer());
+                                   new WhitespaceAnalyzer(), IndexWriter.MaxFieldLength.LIMITED);
         modifier.setMaxBufferedDocs(2);
         modifier.setMaxBufferedDeleteTerms(2);
       }
@@ -340,7 +340,7 @@
       // First build up a starting index:
       RAMDirectory startDir = new RAMDirectory();
       IndexWriter writer = new IndexWriter(startDir, autoCommit,
-                                           new WhitespaceAnalyzer(), true);
+                                           new WhitespaceAnalyzer(), true, IndexWriter.MaxFieldLength.LIMITED);
       for (int i = 0; i < 157; i++) {
         Document d = new Document();
         d.add(new Field("id", Integer.toString(i), Field.Store.YES,
@@ -362,7 +362,7 @@
       while (!done) {
         MockRAMDirectory dir = new MockRAMDirectory(startDir);
         IndexWriter modifier = new IndexWriter(dir, autoCommit,
-                                               new WhitespaceAnalyzer());
+                                               new WhitespaceAnalyzer(), IndexWriter.MaxFieldLength.LIMITED);
 
         modifier.setMaxBufferedDocs(1000); // use flush or close
         modifier.setMaxBufferedDeleteTerms(1000); // use flush or close
@@ -597,7 +597,7 @@
       boolean autoCommit = (0==pass);
       MockRAMDirectory dir = new MockRAMDirectory();
       IndexWriter modifier = new IndexWriter(dir, autoCommit,
-                                             new WhitespaceAnalyzer(), true);
+                                             new WhitespaceAnalyzer(), true, IndexWriter.MaxFieldLength.LIMITED);
       modifier.setUseCompoundFile(true);
       modifier.setMaxBufferedDeleteTerms(2);
 
@@ -633,7 +633,7 @@
       // open the writer again (closed above)
 
       if (!autoCommit) {
-        modifier = new IndexWriter(dir, autoCommit, new WhitespaceAnalyzer());
+        modifier = new IndexWriter(dir, autoCommit, new WhitespaceAnalyzer(), IndexWriter.MaxFieldLength.LIMITED);
         modifier.setUseCompoundFile(true);
       }
 
@@ -726,7 +726,7 @@
       boolean autoCommit = (0==pass);
       MockRAMDirectory dir = new MockRAMDirectory();
       IndexWriter modifier = new IndexWriter(dir, autoCommit,
-                                             new WhitespaceAnalyzer(), true);
+                                             new WhitespaceAnalyzer(), true, IndexWriter.MaxFieldLength.LIMITED);
 
       dir.failOn(failure.reset());
 
