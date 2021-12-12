diff --git a/lucene/src/test/org/apache/lucene/index/TestIndexWriterCommit.java b/lucene/src/test/org/apache/lucene/index/TestIndexWriterCommit.java
index 510a46b..ed76bbb 100644
--- a/lucene/src/test/org/apache/lucene/index/TestIndexWriterCommit.java
+++ b/lucene/src/test/org/apache/lucene/index/TestIndexWriterCommit.java
@@ -51,7 +51,7 @@
       writer.close();
 
       Term searchTerm = new Term("content", "aaa");
-      IndexReader reader = IndexReader.open(dir);
+      DirectoryReader reader = IndexReader.open(dir);
       IndexSearcher searcher = new IndexSearcher(reader);
       ScoreDoc[] hits = searcher.search(new TermQuery(searchTerm), null, 1000).scoreDocs;
       assertEquals("first number of hits", 14, hits.length);
@@ -279,7 +279,7 @@
     writer.forceMerge(1);
 
     // Open a reader before closing (commiting) the writer:
-    IndexReader reader = IndexReader.open(dir);
+    DirectoryReader reader = IndexReader.open(dir);
 
     // Reader should see index as multi-seg at this
     // point:
@@ -339,7 +339,7 @@
           public void run() {
             try {
               final Document doc = new Document();
-              IndexReader r = IndexReader.open(dir);
+              DirectoryReader r = IndexReader.open(dir);
               Field f = newField("f", "", StringField.TYPE_UNSTORED);
               doc.add(f);
               int count = 0;
@@ -350,7 +350,7 @@
                   f.setValue(s);
                   w.addDocument(doc);
                   w.commit();
-                  IndexReader r2 = IndexReader.openIfChanged(r);
+                  DirectoryReader r2 = DirectoryReader.openIfChanged(r);
                   assertNotNull(r2);
                   assertTrue(r2 != r);
                   r.close();
@@ -390,10 +390,10 @@
     for (int i = 0; i < 23; i++)
       TestIndexWriter.addDoc(writer);
 
-    IndexReader reader = IndexReader.open(dir);
+    DirectoryReader reader = IndexReader.open(dir);
     assertEquals(0, reader.numDocs());
     writer.commit();
-    IndexReader reader2 = IndexReader.openIfChanged(reader);
+    DirectoryReader reader2 = DirectoryReader.openIfChanged(reader);
     assertNotNull(reader2);
     assertEquals(0, reader.numDocs());
     assertEquals(23, reader2.numDocs());
@@ -501,7 +501,7 @@
     for (int i = 0; i < 23; i++)
       TestIndexWriter.addDoc(writer);
 
-    IndexReader reader = IndexReader.open(dir);
+    DirectoryReader reader = IndexReader.open(dir);
     assertEquals(0, reader.numDocs());
 
     writer.prepareCommit();
@@ -511,7 +511,7 @@
 
     writer.commit();
 
-    IndexReader reader3 = IndexReader.openIfChanged(reader);
+    IndexReader reader3 = DirectoryReader.openIfChanged(reader);
     assertNotNull(reader3);
     assertEquals(0, reader.numDocs());
     assertEquals(0, reader2.numDocs());
@@ -558,7 +558,7 @@
     for (int i = 0; i < 23; i++)
       TestIndexWriter.addDoc(writer);
 
-    IndexReader reader = IndexReader.open(dir);
+    DirectoryReader reader = IndexReader.open(dir);
     assertEquals(0, reader.numDocs());
 
     writer.prepareCommit();
@@ -568,7 +568,7 @@
 
     writer.rollback();
 
-    IndexReader reader3 = IndexReader.openIfChanged(reader);
+    IndexReader reader3 = DirectoryReader.openIfChanged(reader);
     assertNull(reader3);
     assertEquals(0, reader.numDocs());
     assertEquals(0, reader2.numDocs());
@@ -622,7 +622,7 @@
 
     assertEquals(0, DirectoryReader.getCommitUserData(dir).size());
 
-    IndexReader r = IndexReader.open(dir);
+    DirectoryReader r = IndexReader.open(dir);
     // commit(Map) never called for this index
     assertEquals(0, r.getCommitUserData().size());
     r.close();
