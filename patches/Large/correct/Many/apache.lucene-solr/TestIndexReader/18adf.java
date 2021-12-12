diff --git a/src/test/org/apache/lucene/index/TestIndexReader.java b/src/test/org/apache/lucene/index/TestIndexReader.java
index 7d7e2ec..3d28639 100644
--- a/src/test/org/apache/lucene/index/TestIndexReader.java
+++ b/src/test/org/apache/lucene/index/TestIndexReader.java
@@ -55,19 +55,19 @@
     public void testIsCurrent() throws Exception
     {
       RAMDirectory d = new MockRAMDirectory();
-      IndexWriter writer = new IndexWriter(d, new StandardAnalyzer(), true);
+      IndexWriter writer = new IndexWriter(d, new StandardAnalyzer(), true, IndexWriter.MaxFieldLength.LIMITED);
       addDocumentWithFields(writer);
       writer.close();
       // set up reader:
       IndexReader reader = IndexReader.open(d);
       assertTrue(reader.isCurrent());
       // modify index by adding another document:
-      writer = new IndexWriter(d, new StandardAnalyzer(), false);
+      writer = new IndexWriter(d, new StandardAnalyzer(), false, IndexWriter.MaxFieldLength.LIMITED);
       addDocumentWithFields(writer);
       writer.close();
       assertFalse(reader.isCurrent());
       // re-create index:
-      writer = new IndexWriter(d, new StandardAnalyzer(), true);
+      writer = new IndexWriter(d, new StandardAnalyzer(), true, IndexWriter.MaxFieldLength.LIMITED);
       addDocumentWithFields(writer);
       writer.close();
       assertFalse(reader.isCurrent());
@@ -83,7 +83,7 @@
     {
         RAMDirectory d = new MockRAMDirectory();
         // set up writer
-        IndexWriter writer = new IndexWriter(d, new StandardAnalyzer(), true);
+        IndexWriter writer = new IndexWriter(d, new StandardAnalyzer(), true, IndexWriter.MaxFieldLength.LIMITED);
         addDocumentWithFields(writer);
         writer.close();
         // set up reader
@@ -95,7 +95,7 @@
         assertTrue(fieldNames.contains("unstored"));
         reader.close();
         // add more documents
-        writer = new IndexWriter(d, new StandardAnalyzer(), false);
+        writer = new IndexWriter(d, new StandardAnalyzer(), false, IndexWriter.MaxFieldLength.LIMITED);
         // want to get some more segments here
         for (int i = 0; i < 5*writer.getMergeFactor(); i++)
         {
@@ -175,7 +175,7 @@
   public void testTermVectors() throws Exception {
     RAMDirectory d = new MockRAMDirectory();
     // set up writer
-    IndexWriter writer = new IndexWriter(d, new StandardAnalyzer(), true);
+    IndexWriter writer = new IndexWriter(d, new StandardAnalyzer(), true, IndexWriter.MaxFieldLength.LIMITED);
     // want to get some more segments here
     // new termvector fields
     for (int i = 0; i < 5 * writer.getMergeFactor(); i++) {
@@ -243,7 +243,7 @@
         Term searchTerm = new Term("content", "aaa");
 
         //  add 100 documents with term : aaa
-        writer  = new IndexWriter(dir, new WhitespaceAnalyzer(), true);
+        writer  = new IndexWriter(dir, new WhitespaceAnalyzer(), true, IndexWriter.MaxFieldLength.LIMITED);
         for (int i = 0; i < 100; i++)
         {
             addDoc(writer, searchTerm.text());
@@ -291,7 +291,7 @@
         Term searchTerm = new Term("content", "aaa");
 
         //  add 11 documents with term : aaa
-        writer  = new IndexWriter(dir, new WhitespaceAnalyzer(), true);
+        writer  = new IndexWriter(dir, new WhitespaceAnalyzer(), true, IndexWriter.MaxFieldLength.LIMITED);
         for (int i = 0; i < 11; i++)
         {
             addDoc(writer, searchTerm.text());
@@ -336,7 +336,7 @@
         Term searchTerm = new Term("content", "aaa");
 
         //  add 11 documents with term : aaa
-        writer  = new IndexWriter(dir, new WhitespaceAnalyzer(), true);
+        writer  = new IndexWriter(dir, new WhitespaceAnalyzer(), true, IndexWriter.MaxFieldLength.LIMITED);
         for (int i = 0; i < 11; i++)
         {
             addDoc(writer, searchTerm.text());
@@ -385,7 +385,7 @@
         Term searchTerm = new Term("content", "aaa");
 
         //  add 1 documents with term : aaa
-        writer  = new IndexWriter(dir, new WhitespaceAnalyzer(), true);
+        writer  = new IndexWriter(dir, new WhitespaceAnalyzer(), true, IndexWriter.MaxFieldLength.LIMITED);
         addDoc(writer, searchTerm.text());
         writer.close();
 
@@ -430,7 +430,7 @@
         Term searchTerm = new Term("content", "aaa");
 
         //  add 1 documents with term : aaa
-        writer  = new IndexWriter(dir, new WhitespaceAnalyzer(), true);
+        writer  = new IndexWriter(dir, new WhitespaceAnalyzer(), true, IndexWriter.MaxFieldLength.LIMITED);
         writer.setUseCompoundFile(false);
         addDoc(writer, searchTerm.text());
         writer.close();
@@ -484,7 +484,7 @@
         Term searchTerm2 = new Term("content", "bbb");
 
         //  add 100 documents with term : aaa
-        IndexWriter writer  = new IndexWriter(dir, new WhitespaceAnalyzer(), true);
+        IndexWriter writer  = new IndexWriter(dir, new WhitespaceAnalyzer(), true, IndexWriter.MaxFieldLength.LIMITED);
         for (int i = 0; i < 100; i++)
         {
             addDoc(writer, searchTerm.text());
@@ -500,7 +500,7 @@
         assertTermDocsCount("first reader", reader, searchTerm2, 0);
 
         // add 100 documents with term : bbb
-        writer  = new IndexWriter(dir, new WhitespaceAnalyzer(), false);
+        writer  = new IndexWriter(dir, new WhitespaceAnalyzer(), false, IndexWriter.MaxFieldLength.LIMITED);
         for (int i = 0; i < 100; i++)
         {
             addDoc(writer, searchTerm2.text());
@@ -567,7 +567,7 @@
         // Create initial data set
         File dirFile = new File(System.getProperty("tempDir"), "testIndex");
         Directory dir = getDirectory();
-        IndexWriter writer  = new IndexWriter(dir, new WhitespaceAnalyzer(), true);
+        IndexWriter writer  = new IndexWriter(dir, new WhitespaceAnalyzer(), true, IndexWriter.MaxFieldLength.LIMITED);
         addDoc(writer, "test");
         writer.close();
         dir.close();
@@ -577,7 +577,7 @@
         dir = getDirectory();
 
         // Now create the data set again, just as before
-        writer  = new IndexWriter(dir, new WhitespaceAnalyzer(), true);
+        writer  = new IndexWriter(dir, new WhitespaceAnalyzer(), true, IndexWriter.MaxFieldLength.LIMITED);
         addDoc(writer, "test");
         writer.close();
         dir.close();
@@ -604,7 +604,7 @@
           else
             dir = getDirectory();
           assertFalse(IndexReader.indexExists(dir));
-          IndexWriter writer  = new IndexWriter(dir, new WhitespaceAnalyzer(), true);
+          IndexWriter writer  = new IndexWriter(dir, new WhitespaceAnalyzer(), true, IndexWriter.MaxFieldLength.LIMITED);
           addDocumentWithFields(writer);
           assertTrue(IndexReader.isLocked(dir));		// writer open, so dir is locked
           writer.close();
@@ -628,7 +628,7 @@
             }
           }
 
-          writer  = new IndexWriter(dir, new WhitespaceAnalyzer(), true);
+          writer  = new IndexWriter(dir, new WhitespaceAnalyzer(), true, IndexWriter.MaxFieldLength.LIMITED);
           addDocumentWithFields(writer);
           writer.close();
           reader = IndexReader.open(dir);
@@ -646,7 +646,7 @@
       assertFalse(IndexReader.indexExists("there_is_no_such_index"));
       Directory dir = new MockRAMDirectory();
       assertFalse(IndexReader.indexExists(dir));
-      IndexWriter writer  = new IndexWriter(dir, new WhitespaceAnalyzer(), true);
+      IndexWriter writer  = new IndexWriter(dir, new WhitespaceAnalyzer(), true, IndexWriter.MaxFieldLength.LIMITED);
       addDocumentWithFields(writer);
       assertTrue(IndexReader.isLocked(dir));		// writer open, so dir is locked
       writer.close();
@@ -657,7 +657,7 @@
       reader.close();
       // modify index and check version has been
       // incremented:
-      writer  = new IndexWriter(dir, new WhitespaceAnalyzer(), true);
+      writer  = new IndexWriter(dir, new WhitespaceAnalyzer(), true, IndexWriter.MaxFieldLength.LIMITED);
       addDocumentWithFields(writer);
       writer.close();
       reader = IndexReader.open(dir);
@@ -668,10 +668,10 @@
 
     public void testLock() throws IOException {
       Directory dir = new MockRAMDirectory();
-      IndexWriter writer  = new IndexWriter(dir, new WhitespaceAnalyzer(), true);
+      IndexWriter writer  = new IndexWriter(dir, new WhitespaceAnalyzer(), true, IndexWriter.MaxFieldLength.LIMITED);
       addDocumentWithFields(writer);
       writer.close();
-      writer  = new IndexWriter(dir, new WhitespaceAnalyzer(), false);
+      writer  = new IndexWriter(dir, new WhitespaceAnalyzer(), false, IndexWriter.MaxFieldLength.LIMITED);
       IndexReader reader = IndexReader.open(dir);
       try {
         reader.deleteDocument(0);
@@ -688,7 +688,7 @@
 
     public void testUndeleteAll() throws IOException {
       Directory dir = new MockRAMDirectory();
-      IndexWriter writer  = new IndexWriter(dir, new WhitespaceAnalyzer(), true);
+      IndexWriter writer  = new IndexWriter(dir, new WhitespaceAnalyzer(), true, IndexWriter.MaxFieldLength.LIMITED);
       addDocumentWithFields(writer);
       addDocumentWithFields(writer);
       writer.close();
@@ -705,7 +705,7 @@
 
     public void testUndeleteAllAfterClose() throws IOException {
       Directory dir = new MockRAMDirectory();
-      IndexWriter writer  = new IndexWriter(dir, new WhitespaceAnalyzer(), true);
+      IndexWriter writer  = new IndexWriter(dir, new WhitespaceAnalyzer(), true, IndexWriter.MaxFieldLength.LIMITED);
       addDocumentWithFields(writer);
       addDocumentWithFields(writer);
       writer.close();
@@ -722,7 +722,7 @@
 
     public void testUndeleteAllAfterCloseThenReopen() throws IOException {
       Directory dir = new MockRAMDirectory();
-      IndexWriter writer  = new IndexWriter(dir, new WhitespaceAnalyzer(), true);
+      IndexWriter writer  = new IndexWriter(dir, new WhitespaceAnalyzer(), true, IndexWriter.MaxFieldLength.LIMITED);
       addDocumentWithFields(writer);
       addDocumentWithFields(writer);
       writer.close();
@@ -760,7 +760,7 @@
       
       // First build up a starting index:
       RAMDirectory startDir = new MockRAMDirectory();
-      IndexWriter writer = new IndexWriter(startDir, new WhitespaceAnalyzer(), true);
+      IndexWriter writer = new IndexWriter(startDir, new WhitespaceAnalyzer(), true, IndexWriter.MaxFieldLength.LIMITED);
       for(int i=0;i<157;i++) {
         Document d = new Document();
         d.add(new Field("id", Integer.toString(i), Field.Store.YES, Field.Index.UN_TOKENIZED));
@@ -944,7 +944,7 @@
 
     public void testDocsOutOfOrderJIRA140() throws IOException {
       Directory dir = new MockRAMDirectory();      
-      IndexWriter writer  = new IndexWriter(dir, new WhitespaceAnalyzer(), true);
+      IndexWriter writer  = new IndexWriter(dir, new WhitespaceAnalyzer(), true, IndexWriter.MaxFieldLength.LIMITED);
       for(int i=0;i<11;i++) {
         addDoc(writer, "aaa");
       }
@@ -962,7 +962,7 @@
       }
       reader.close();
 
-      writer = new IndexWriter(dir, new WhitespaceAnalyzer(), false);
+      writer = new IndexWriter(dir, new WhitespaceAnalyzer(), false, IndexWriter.MaxFieldLength.LIMITED);
 
       // We must add more docs to get a new segment written
       for(int i=0;i<11;i++) {
@@ -984,7 +984,7 @@
     public void testExceptionReleaseWriteLockJIRA768() throws IOException {
 
       Directory dir = new MockRAMDirectory();      
-      IndexWriter writer  = new IndexWriter(dir, new WhitespaceAnalyzer(), true);
+      IndexWriter writer  = new IndexWriter(dir, new WhitespaceAnalyzer(), true, IndexWriter.MaxFieldLength.LIMITED);
       addDoc(writer, "aaa");
       writer.close();
 
@@ -1058,7 +1058,7 @@
         //  add 100 documents with term : aaa
         //  add 100 documents with term : bbb
         //  add 100 documents with term : ccc
-        IndexWriter writer  = new IndexWriter(dir, new WhitespaceAnalyzer(), true);
+        IndexWriter writer  = new IndexWriter(dir, new WhitespaceAnalyzer(), true, IndexWriter.MaxFieldLength.LIMITED);
         for (int i = 0; i < 100; i++)
         {
             addDoc(writer, searchTerm1.text());
