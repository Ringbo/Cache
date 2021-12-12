diff --git a/src/test/org/apache/lucene/index/TestIndexReaderReopen.java b/src/test/org/apache/lucene/index/TestIndexReaderReopen.java
index 53419c3..2cb7c19 100644
--- a/src/test/org/apache/lucene/index/TestIndexReaderReopen.java
+++ b/src/test/org/apache/lucene/index/TestIndexReaderReopen.java
@@ -548,7 +548,7 @@
     final Directory dir = new RAMDirectory();
     final int n = 150;
 
-    IndexWriter writer = new IndexWriter(dir, new StandardAnalyzer());
+    IndexWriter writer = new IndexWriter(dir, new StandardAnalyzer(), IndexWriter.MaxFieldLength.LIMITED);
     for (int i = 0; i < n; i++) {
       writer.addDocument(createDocument(i, 3));
     }
@@ -566,7 +566,7 @@
           modifier.deleteDocument(i);
           modifier.close();
         } else {
-          IndexWriter modifier = new IndexWriter(dir, new StandardAnalyzer());
+          IndexWriter modifier = new IndexWriter(dir, new StandardAnalyzer(), IndexWriter.MaxFieldLength.LIMITED);
           modifier.addDocument(createDocument(n + i, 6));
           modifier.close();
         }
@@ -781,7 +781,7 @@
   }
   
   private static void createIndex(Directory dir, boolean multiSegment) throws IOException {
-    IndexWriter w = new IndexWriter(dir, new WhitespaceAnalyzer());
+    IndexWriter w = new IndexWriter(dir, new WhitespaceAnalyzer(), IndexWriter.MaxFieldLength.LIMITED);
     
     w.setMergePolicy(new LogDocMergePolicy());
     
@@ -824,7 +824,7 @@
   private static void modifyIndex(int i, Directory dir) throws IOException {
     switch (i) {
       case 0: {
-        IndexWriter w = new IndexWriter(dir, new WhitespaceAnalyzer());
+        IndexWriter w = new IndexWriter(dir, new WhitespaceAnalyzer(), IndexWriter.MaxFieldLength.LIMITED);
         w.deleteDocuments(new Term("field2", "a11"));
         w.deleteDocuments(new Term("field2", "b30"));
         w.close();
@@ -839,13 +839,13 @@
         break;
       }
       case 2: {
-        IndexWriter w = new IndexWriter(dir, new WhitespaceAnalyzer());
+        IndexWriter w = new IndexWriter(dir, new WhitespaceAnalyzer(), IndexWriter.MaxFieldLength.LIMITED);
         w.optimize();
         w.close();
         break;
       }
       case 3: {
-        IndexWriter w = new IndexWriter(dir, new WhitespaceAnalyzer());
+        IndexWriter w = new IndexWriter(dir, new WhitespaceAnalyzer(), IndexWriter.MaxFieldLength.LIMITED);
         w.addDocument(createDocument(101, 4));
         w.optimize();
         w.addDocument(createDocument(102, 4));
