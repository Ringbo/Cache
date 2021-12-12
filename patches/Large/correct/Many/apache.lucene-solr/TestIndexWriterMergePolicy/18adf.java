diff --git a/src/test/org/apache/lucene/index/TestIndexWriterMergePolicy.java b/src/test/org/apache/lucene/index/TestIndexWriterMergePolicy.java
index b696ae0..e773107 100755
--- a/src/test/org/apache/lucene/index/TestIndexWriterMergePolicy.java
+++ b/src/test/org/apache/lucene/index/TestIndexWriterMergePolicy.java
@@ -34,7 +34,7 @@
   public void testNormalCase() throws IOException {
     Directory dir = new RAMDirectory();
 
-    IndexWriter writer = new IndexWriter(dir, new WhitespaceAnalyzer(), true);
+    IndexWriter writer = new IndexWriter(dir, new WhitespaceAnalyzer(), true, IndexWriter.MaxFieldLength.LIMITED);
     writer.setMaxBufferedDocs(10);
     writer.setMergeFactor(10);
     writer.setMergePolicy(new LogDocMergePolicy());
@@ -51,7 +51,7 @@
   public void testNoOverMerge() throws IOException {
     Directory dir = new RAMDirectory();
 
-    IndexWriter writer = new IndexWriter(dir, new WhitespaceAnalyzer(), true);
+    IndexWriter writer = new IndexWriter(dir, new WhitespaceAnalyzer(), true, IndexWriter.MaxFieldLength.LIMITED);
     writer.setMaxBufferedDocs(10);
     writer.setMergeFactor(10);
     writer.setMergePolicy(new LogDocMergePolicy());
@@ -73,7 +73,7 @@
   public void testForceFlush() throws IOException {
     Directory dir = new RAMDirectory();
 
-    IndexWriter writer = new IndexWriter(dir, new WhitespaceAnalyzer(), true);
+    IndexWriter writer = new IndexWriter(dir, new WhitespaceAnalyzer(), true, IndexWriter.MaxFieldLength.LIMITED);
     writer.setMaxBufferedDocs(10);
     writer.setMergeFactor(10);
     LogDocMergePolicy mp = new LogDocMergePolicy();
@@ -84,7 +84,7 @@
       addDoc(writer);
       writer.close();
 
-      writer = new IndexWriter(dir, new WhitespaceAnalyzer(), false);
+      writer = new IndexWriter(dir, new WhitespaceAnalyzer(), false, IndexWriter.MaxFieldLength.LIMITED);
       writer.setMaxBufferedDocs(10);
       writer.setMergePolicy(mp);
       mp.setMinMergeDocs(100);
@@ -99,7 +99,7 @@
   public void testMergeFactorChange() throws IOException {
     Directory dir = new RAMDirectory();
 
-    IndexWriter writer = new IndexWriter(dir, new WhitespaceAnalyzer(), true);
+    IndexWriter writer = new IndexWriter(dir, new WhitespaceAnalyzer(), true, IndexWriter.MaxFieldLength.LIMITED);
     writer.setMaxBufferedDocs(10);
     writer.setMergeFactor(100);
     writer.setMergePolicy(new LogDocMergePolicy());
@@ -125,7 +125,7 @@
   public void testMaxBufferedDocsChange() throws IOException {
     Directory dir = new RAMDirectory();
 
-    IndexWriter writer = new IndexWriter(dir, new WhitespaceAnalyzer(), true);
+    IndexWriter writer = new IndexWriter(dir, new WhitespaceAnalyzer(), true, IndexWriter.MaxFieldLength.LIMITED);
     writer.setMaxBufferedDocs(101);
     writer.setMergeFactor(101);
     writer.setMergePolicy(new LogDocMergePolicy());
@@ -139,7 +139,7 @@
       }
       writer.close();
 
-      writer = new IndexWriter(dir, new WhitespaceAnalyzer(), false);
+      writer = new IndexWriter(dir, new WhitespaceAnalyzer(), false, IndexWriter.MaxFieldLength.LIMITED);
       writer.setMaxBufferedDocs(101);
       writer.setMergeFactor(101);
       writer.setMergePolicy(new LogDocMergePolicy());
@@ -167,7 +167,7 @@
   public void testMergeDocCount0() throws IOException {
     Directory dir = new RAMDirectory();
 
-    IndexWriter writer = new IndexWriter(dir, new WhitespaceAnalyzer(), true);
+    IndexWriter writer = new IndexWriter(dir, new WhitespaceAnalyzer(), true, IndexWriter.MaxFieldLength.LIMITED);
     writer.setMergePolicy(new LogDocMergePolicy());
     writer.setMaxBufferedDocs(10);
     writer.setMergeFactor(100);
@@ -182,7 +182,7 @@
     reader.deleteDocuments(new Term("content", "aaa"));
     reader.close();
 
-    writer = new IndexWriter(dir, new WhitespaceAnalyzer(), false);
+    writer = new IndexWriter(dir, new WhitespaceAnalyzer(), false, IndexWriter.MaxFieldLength.LIMITED);
     writer.setMergePolicy(new LogDocMergePolicy());
     writer.setMaxBufferedDocs(10);
     writer.setMergeFactor(5);
