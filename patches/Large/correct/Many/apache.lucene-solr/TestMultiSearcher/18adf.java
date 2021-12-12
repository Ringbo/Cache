diff --git a/src/test/org/apache/lucene/search/TestMultiSearcher.java b/src/test/org/apache/lucene/search/TestMultiSearcher.java
index 6ded7a8..5b94774 100644
--- a/src/test/org/apache/lucene/search/TestMultiSearcher.java
+++ b/src/test/org/apache/lucene/search/TestMultiSearcher.java
@@ -84,9 +84,9 @@
         lDoc3.add(new Field("handle", "1", Field.Store.YES, Field.Index.UN_TOKENIZED));
 
         // creating an index writer for the first index
-        IndexWriter writerA = new IndexWriter(indexStoreA, new StandardAnalyzer(), true);
+        IndexWriter writerA = new IndexWriter(indexStoreA, new StandardAnalyzer(), true, IndexWriter.MaxFieldLength.LIMITED);
         // creating an index writer for the second index, but writing nothing
-        IndexWriter writerB = new IndexWriter(indexStoreB, new StandardAnalyzer(), true);
+        IndexWriter writerB = new IndexWriter(indexStoreB, new StandardAnalyzer(), true, IndexWriter.MaxFieldLength.LIMITED);
 
         //--------------------------------------------------------------------
         // scenario 1
@@ -130,7 +130,7 @@
         //--------------------------------------------------------------------
 
         // adding one document to the empty index
-        writerB = new IndexWriter(indexStoreB, new StandardAnalyzer(), false);
+        writerB = new IndexWriter(indexStoreB, new StandardAnalyzer(), false, IndexWriter.MaxFieldLength.LIMITED);
         writerB.addDocument(lDoc);
         writerB.optimize();
         writerB.close();
@@ -176,7 +176,7 @@
         readerB.close();
 
         // optimizing the index with the writer
-        writerB = new IndexWriter(indexStoreB, new StandardAnalyzer(), false);
+        writerB = new IndexWriter(indexStoreB, new StandardAnalyzer(), false, IndexWriter.MaxFieldLength.LIMITED);
         writerB.optimize();
         writerB.close();
 
@@ -217,7 +217,7 @@
         IndexWriter indexWriter=null;
         
         try {
-            indexWriter=new IndexWriter(directory, new KeywordAnalyzer(), create);
+            indexWriter=new IndexWriter(directory, new KeywordAnalyzer(), create, IndexWriter.MaxFieldLength.LIMITED);
             
             for (int i=0; i<nDocs; i++) {
                 indexWriter.addDocument(createDocument("doc" + i, contents2));
