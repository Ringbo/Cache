diff --git a/src/test/org/apache/lucene/index/TestIndexWriter.java b/src/test/org/apache/lucene/index/TestIndexWriter.java
index accd36d..456cfa6 100644
--- a/src/test/org/apache/lucene/index/TestIndexWriter.java
+++ b/src/test/org/apache/lucene/index/TestIndexWriter.java
@@ -69,7 +69,7 @@
         IndexWriter.setDefaultWriteLockTimeout(2000);
         assertEquals(2000, IndexWriter.getDefaultWriteLockTimeout());
 
-        writer  = new IndexWriter(dir, new WhitespaceAnalyzer());
+        writer  = new IndexWriter(dir, new WhitespaceAnalyzer(), IndexWriter.MaxFieldLength.LIMITED);
 
         IndexWriter.setDefaultWriteLockTimeout(1000);
 
@@ -88,7 +88,7 @@
         reader.close();
 
         // test doc count before segments are merged/index is optimized
-        writer = new IndexWriter(dir, new WhitespaceAnalyzer());
+        writer = new IndexWriter(dir, new WhitespaceAnalyzer(), IndexWriter.MaxFieldLength.LIMITED);
         assertEquals(100, writer.docCount());
         writer.close();
 
@@ -98,7 +98,7 @@
         reader.close();
 
         // optimize the index and check that the new doc count is correct
-        writer = new IndexWriter(dir, true, new WhitespaceAnalyzer());
+        writer = new IndexWriter(dir, true, new WhitespaceAnalyzer(), IndexWriter.MaxFieldLength.LIMITED);
         writer.optimize();
         assertEquals(60, writer.docCount());
         writer.close();
@@ -111,7 +111,7 @@
 
         // make sure opening a new index for create over
         // this existing one works correctly:
-        writer = new IndexWriter(dir, new WhitespaceAnalyzer(), true);
+        writer = new IndexWriter(dir, new WhitespaceAnalyzer(), true, IndexWriter.MaxFieldLength.LIMITED);
         assertEquals(0, writer.docCount());
         writer.close();
     }
@@ -153,7 +153,7 @@
       long inputDiskUsage = 0;
       for(int i=0;i<NUM_DIR;i++) {
         dirs[i] = new RAMDirectory();
-        IndexWriter writer  = new IndexWriter(dirs[i], new WhitespaceAnalyzer(), true);
+        IndexWriter writer  = new IndexWriter(dirs[i], new WhitespaceAnalyzer(), true, IndexWriter.MaxFieldLength.LIMITED);
         for(int j=0;j<25;j++) {
           addDocWithIndex(writer, 25*i+j);
         }
@@ -167,7 +167,7 @@
       // Now, build a starting index that has START_COUNT docs.  We
       // will then try to addIndexes into a copy of this:
       RAMDirectory startDir = new RAMDirectory();
-      IndexWriter writer = new IndexWriter(startDir, new WhitespaceAnalyzer(), true);        
+      IndexWriter writer = new IndexWriter(startDir, new WhitespaceAnalyzer(), true, IndexWriter.MaxFieldLength.LIMITED);
       for(int j=0;j<START_COUNT;j++) {
         addDocWithIndex(writer, j);
       }
@@ -231,7 +231,7 @@
 
           // Make a new dir that will enforce disk usage:
           MockRAMDirectory dir = new MockRAMDirectory(startDir);
-          writer = new IndexWriter(dir, autoCommit, new WhitespaceAnalyzer(), false);
+          writer = new IndexWriter(dir, autoCommit, new WhitespaceAnalyzer(), false, IndexWriter.MaxFieldLength.LIMITED);
           IOException err = null;
 
           MergeScheduler ms = writer.getMergeScheduler();
@@ -464,7 +464,7 @@
             System.out.println("TEST: cycle: diskFree=" + diskFree);
           MockRAMDirectory dir = new MockRAMDirectory();
           dir.setMaxSizeInBytes(diskFree);
-          IndexWriter writer = new IndexWriter(dir, autoCommit, new WhitespaceAnalyzer(), true);
+          IndexWriter writer = new IndexWriter(dir, autoCommit, new WhitespaceAnalyzer(), true, IndexWriter.MaxFieldLength.LIMITED);
 
           MergeScheduler ms = writer.getMergeScheduler();
           if (ms instanceof ConcurrentMergeScheduler)
@@ -542,7 +542,7 @@
     */
     public void testWickedLongTerm() throws IOException {
       RAMDirectory dir = new RAMDirectory();
-      IndexWriter writer  = new IndexWriter(dir, new StandardAnalyzer(), true);
+      IndexWriter writer  = new IndexWriter(dir, new StandardAnalyzer(), true, IndexWriter.MaxFieldLength.LIMITED);
 
       char[] chars = new char[16383];
       Arrays.fill(chars, 'x');
@@ -588,7 +588,7 @@
       doc.add(new Field("content", bigTerm, Field.Store.NO, Field.Index.TOKENIZED));
       StandardAnalyzer sa = new StandardAnalyzer();
       sa.setMaxTokenLength(100000);
-      writer  = new IndexWriter(dir, sa);
+      writer  = new IndexWriter(dir, sa, IndexWriter.MaxFieldLength.LIMITED);
       writer.addDocument(doc);
       writer.close();
       reader = IndexReader.open(dir);
@@ -606,7 +606,7 @@
       doc.add(new Field("content", "aaa", Field.Store.YES, Field.Index.TOKENIZED));
 
       for(int numDocs=38;numDocs<500;numDocs += 38) {
-        IndexWriter writer  = new IndexWriter(dir, new WhitespaceAnalyzer(), true);
+        IndexWriter writer  = new IndexWriter(dir, new WhitespaceAnalyzer(), true, IndexWriter.MaxFieldLength.LIMITED);
         LogDocMergePolicy ldmp = new LogDocMergePolicy();
         ldmp.setMinMergeDocs(1);
         writer.setMergePolicy(ldmp);
@@ -620,7 +620,7 @@
         sis.read(dir);
         final int segCount = sis.size();
 
-        writer  = new IndexWriter(dir, new WhitespaceAnalyzer());
+        writer  = new IndexWriter(dir, new WhitespaceAnalyzer(), IndexWriter.MaxFieldLength.LIMITED);
         writer.setMergePolicy(ldmp);
         writer.setMergeFactor(5);
         writer.optimize(3);
@@ -643,7 +643,7 @@
       final Document doc = new Document();
       doc.add(new Field("content", "aaa", Field.Store.YES, Field.Index.TOKENIZED));
 
-      IndexWriter writer  = new IndexWriter(dir, new WhitespaceAnalyzer(), true);
+      IndexWriter writer  = new IndexWriter(dir, new WhitespaceAnalyzer(), true, IndexWriter.MaxFieldLength.LIMITED);
       LogDocMergePolicy ldmp = new LogDocMergePolicy();
       ldmp.setMinMergeDocs(1);
       writer.setMergePolicy(ldmp);
@@ -685,7 +685,7 @@
     public void testOptimizeTempSpaceUsage() throws IOException {
     
       MockRAMDirectory dir = new MockRAMDirectory();
-      IndexWriter writer  = new IndexWriter(dir, new WhitespaceAnalyzer(), true);
+      IndexWriter writer  = new IndexWriter(dir, new WhitespaceAnalyzer(), true, IndexWriter.MaxFieldLength.LIMITED);
       for(int j=0;j<500;j++) {
         addDocWithIndex(writer, j);
       }
@@ -698,7 +698,7 @@
       }
 
       dir.resetMaxUsedSizeInBytes();
-      writer  = new IndexWriter(dir, new WhitespaceAnalyzer(), false);
+      writer  = new IndexWriter(dir, new WhitespaceAnalyzer(), false, IndexWriter.MaxFieldLength.LIMITED);
       writer.optimize();
       writer.close();
       long maxDiskUsage = dir.getMaxUsedSizeInBytes();
@@ -732,7 +732,7 @@
           Directory dir = FSDirectory.getDirectory(indexDir);
 
           // add one document & close writer
-          IndexWriter writer = new IndexWriter(dir, new WhitespaceAnalyzer(), true);
+          IndexWriter writer = new IndexWriter(dir, new WhitespaceAnalyzer(), true, IndexWriter.MaxFieldLength.LIMITED);
           addDoc(writer);
           writer.close();
 
@@ -741,7 +741,7 @@
           assertEquals("should be one document", reader.numDocs(), 1);
 
           // now open index for create:
-          writer = new IndexWriter(dir, new WhitespaceAnalyzer(), true);
+          writer = new IndexWriter(dir, new WhitespaceAnalyzer(), true, IndexWriter.MaxFieldLength.LIMITED);
           assertEquals("should be zero documents", writer.docCount(), 0);
           addDoc(writer);
           writer.close();
@@ -766,7 +766,7 @@
         File indexDir = new File(tempDir, "lucenetestindexwriter");
         try {
           // add one document & close writer
-          IndexWriter writer = new IndexWriter(indexDir, new WhitespaceAnalyzer(), true);
+          IndexWriter writer = new IndexWriter(indexDir, new WhitespaceAnalyzer(), true, IndexWriter.MaxFieldLength.LIMITED);
           addDoc(writer);
           writer.close();
 
@@ -775,7 +775,7 @@
           assertEquals("should be one document", reader.numDocs(), 1);
 
           // now open index for create:
-          writer = new IndexWriter(indexDir, new WhitespaceAnalyzer(), true);
+          writer = new IndexWriter(indexDir, new WhitespaceAnalyzer(), true, IndexWriter.MaxFieldLength.LIMITED);
           assertEquals("should be zero documents", writer.docCount(), 0);
           addDoc(writer);
           writer.close();
@@ -801,7 +801,7 @@
         try {
 
           // add one document & close writer
-          IndexWriter writer = new IndexWriter(dirName, new WhitespaceAnalyzer(), true);
+          IndexWriter writer = new IndexWriter(dirName, new WhitespaceAnalyzer(), true, IndexWriter.MaxFieldLength.LIMITED);
           addDoc(writer);
           writer.close();
 
@@ -810,7 +810,7 @@
           assertEquals("should be one document", reader.numDocs(), 1);
 
           // now open index for create:
-          writer = new IndexWriter(dirName, new WhitespaceAnalyzer(), true);
+          writer = new IndexWriter(dirName, new WhitespaceAnalyzer(), true, IndexWriter.MaxFieldLength.LIMITED);
           assertEquals("should be zero documents", writer.docCount(), 0);
           addDoc(writer);
           writer.close();
@@ -834,7 +834,7 @@
 
         IndexWriter writer = null;
 
-        writer  = new IndexWriter(dir, new WhitespaceAnalyzer(), true);
+        writer  = new IndexWriter(dir, new WhitespaceAnalyzer(), true, IndexWriter.MaxFieldLength.LIMITED);
 
         // add 100 documents
         for (int i = 0; i < 100; i++) {
@@ -872,7 +872,7 @@
         reader.close();
 
         try {
-          writer  = new IndexWriter(dir, new WhitespaceAnalyzer(), true);
+          writer  = new IndexWriter(dir, new WhitespaceAnalyzer(), true, IndexWriter.MaxFieldLength.LIMITED);
         } catch (Exception e) {
           fail("writer failed to open on a crashed index");
         }
@@ -894,7 +894,7 @@
 
         IndexWriter writer = null;
 
-        writer  = new IndexWriter(dir, new WhitespaceAnalyzer(), true);
+        writer  = new IndexWriter(dir, new WhitespaceAnalyzer(), true, IndexWriter.MaxFieldLength.LIMITED);
 
         // add 100 documents
         for (int i = 0; i < 100; i++) {
@@ -937,7 +937,7 @@
 
         IndexWriter writer = null;
 
-        writer  = new IndexWriter(dir, new WhitespaceAnalyzer(), true);
+        writer  = new IndexWriter(dir, new WhitespaceAnalyzer(), true, IndexWriter.MaxFieldLength.LIMITED);
         addDoc(writer);
 
         // close
@@ -959,7 +959,7 @@
 
         IndexWriter writer = null;
 
-        writer  = new IndexWriter(dir, new WhitespaceAnalyzer(), true);
+        writer  = new IndexWriter(dir, new WhitespaceAnalyzer(), true, IndexWriter.MaxFieldLength.LIMITED);
 
         // add 100 documents
         for (int i = 0; i < 100; i++) {
@@ -999,7 +999,7 @@
      */
     public void testCommitOnClose() throws IOException {
         Directory dir = new RAMDirectory();      
-        IndexWriter writer = new IndexWriter(dir, new WhitespaceAnalyzer(), true);
+        IndexWriter writer = new IndexWriter(dir, new WhitespaceAnalyzer(), true, IndexWriter.MaxFieldLength.LIMITED);
         for (int i = 0; i < 14; i++) {
           addDoc(writer);
         }
@@ -1013,7 +1013,7 @@
 
         IndexReader reader = IndexReader.open(dir);
 
-        writer = new IndexWriter(dir, false, new WhitespaceAnalyzer());
+        writer = new IndexWriter(dir, false, new WhitespaceAnalyzer(), IndexWriter.MaxFieldLength.LIMITED);
         for(int i=0;i<3;i++) {
           for(int j=0;j<11;j++) {
             addDoc(writer);
@@ -1046,7 +1046,7 @@
      */
     public void testCommitOnCloseAbort() throws IOException {
       Directory dir = new RAMDirectory();      
-      IndexWriter writer = new IndexWriter(dir, new WhitespaceAnalyzer(), true);
+      IndexWriter writer = new IndexWriter(dir, new WhitespaceAnalyzer(), true, IndexWriter.MaxFieldLength.LIMITED);
       writer.setMaxBufferedDocs(10);
       for (int i = 0; i < 14; i++) {
         addDoc(writer);
@@ -1059,7 +1059,7 @@
       assertEquals("first number of hits", 14, hits.length());
       searcher.close();
 
-      writer = new IndexWriter(dir, false, new WhitespaceAnalyzer(), false);
+      writer = new IndexWriter(dir, false, new WhitespaceAnalyzer(), false, IndexWriter.MaxFieldLength.LIMITED);
       writer.setMaxBufferedDocs(10);
       for(int j=0;j<17;j++) {
         addDoc(writer);
@@ -1084,7 +1084,7 @@
           
       // Now make sure we can re-open the index, add docs,
       // and all is good:
-      writer = new IndexWriter(dir, false, new WhitespaceAnalyzer(), false);
+      writer = new IndexWriter(dir, false, new WhitespaceAnalyzer(), false, IndexWriter.MaxFieldLength.LIMITED);
       writer.setMaxBufferedDocs(10);
       for(int i=0;i<12;i++) {
         for(int j=0;j<17;j++) {
@@ -1114,7 +1114,7 @@
      */
     public void testCommitOnCloseDiskUsage() throws IOException {
       MockRAMDirectory dir = new MockRAMDirectory();      
-      IndexWriter writer  = new IndexWriter(dir, new WhitespaceAnalyzer(), true);
+      IndexWriter writer  = new IndexWriter(dir, new WhitespaceAnalyzer(), true, IndexWriter.MaxFieldLength.LIMITED);
       for(int j=0;j<30;j++) {
         addDocWithIndex(writer, j);
       }
@@ -1122,7 +1122,7 @@
       dir.resetMaxUsedSizeInBytes();
 
       long startDiskUsage = dir.getMaxUsedSizeInBytes();
-      writer  = new IndexWriter(dir, false, new WhitespaceAnalyzer(), false);
+      writer  = new IndexWriter(dir, false, new WhitespaceAnalyzer(), false, IndexWriter.MaxFieldLength.LIMITED);
       for(int j=0;j<1470;j++) {
         addDocWithIndex(writer, j);
       }
@@ -1152,14 +1152,14 @@
      */
     public void testCommitOnCloseOptimize() throws IOException {
       RAMDirectory dir = new RAMDirectory();      
-      IndexWriter writer  = new IndexWriter(dir, new WhitespaceAnalyzer(), true);
+      IndexWriter writer  = new IndexWriter(dir, new WhitespaceAnalyzer(), true, IndexWriter.MaxFieldLength.LIMITED);
       writer.setMaxBufferedDocs(10);
       for(int j=0;j<17;j++) {
         addDocWithIndex(writer, j);
       }
       writer.close();
 
-      writer  = new IndexWriter(dir, false, new WhitespaceAnalyzer(), false);
+      writer  = new IndexWriter(dir, false, new WhitespaceAnalyzer(), false, IndexWriter.MaxFieldLength.LIMITED);
       writer.optimize();
 
       // Open a reader before closing (commiting) the writer:
@@ -1181,7 +1181,7 @@
       assertFalse("Reader incorrectly sees that the index is optimized", reader.isOptimized());
       reader.close();
 
-      writer  = new IndexWriter(dir, false, new WhitespaceAnalyzer(), false);
+      writer  = new IndexWriter(dir, false, new WhitespaceAnalyzer(), false, IndexWriter.MaxFieldLength.LIMITED);
       writer.optimize();
       writer.close();
       assertNoUnreferencedFiles(dir, "aborted writer after optimize");
@@ -1196,7 +1196,7 @@
 
     public void testIndexNoDocuments() throws IOException {
       RAMDirectory dir = new RAMDirectory();      
-      IndexWriter writer  = new IndexWriter(dir, new WhitespaceAnalyzer(), true);
+      IndexWriter writer  = new IndexWriter(dir, new WhitespaceAnalyzer(), true, IndexWriter.MaxFieldLength.LIMITED);
       writer.flush();
       writer.close();
 
@@ -1205,7 +1205,7 @@
       assertEquals(0, reader.numDocs());
       reader.close();
 
-      writer  = new IndexWriter(dir, new WhitespaceAnalyzer(), false);
+      writer  = new IndexWriter(dir, new WhitespaceAnalyzer(), false, IndexWriter.MaxFieldLength.LIMITED);
       writer.flush();
       writer.close();
 
@@ -1217,7 +1217,7 @@
 
     public void testManyFields() throws IOException {
       RAMDirectory dir = new RAMDirectory();      
-      IndexWriter writer  = new IndexWriter(dir, new WhitespaceAnalyzer(), true);
+      IndexWriter writer  = new IndexWriter(dir, new WhitespaceAnalyzer(), true, IndexWriter.MaxFieldLength.LIMITED);
       writer.setMaxBufferedDocs(10);
       for(int j=0;j<100;j++) {
         Document doc = new Document();
@@ -1248,7 +1248,7 @@
 
     public void testSmallRAMBuffer() throws IOException {
       RAMDirectory dir = new RAMDirectory();      
-      IndexWriter writer  = new IndexWriter(dir, new WhitespaceAnalyzer(), true);
+      IndexWriter writer  = new IndexWriter(dir, new WhitespaceAnalyzer(), true, IndexWriter.MaxFieldLength.LIMITED);
       writer.setRAMBufferSizeMB(0.000001);
       int lastNumFile = dir.list().length;
       for(int j=0;j<9;j++) {
@@ -1269,7 +1269,7 @@
     // maxBufferedDocs in a write session
     public void testChangingRAMBuffer() throws IOException {
       RAMDirectory dir = new RAMDirectory();      
-      IndexWriter writer  = new IndexWriter(dir, new WhitespaceAnalyzer(), true);
+      IndexWriter writer  = new IndexWriter(dir, new WhitespaceAnalyzer(), true, IndexWriter.MaxFieldLength.LIMITED);
       writer.setMaxBufferedDocs(10);
       writer.setRAMBufferSizeMB(IndexWriter.DISABLE_AUTO_FLUSH);
 
@@ -1323,7 +1323,7 @@
 
     public void testChangingRAMBuffer2() throws IOException {
       RAMDirectory dir = new RAMDirectory();      
-      IndexWriter writer  = new IndexWriter(dir, new WhitespaceAnalyzer(), true);
+      IndexWriter writer  = new IndexWriter(dir, new WhitespaceAnalyzer(), true, IndexWriter.MaxFieldLength.LIMITED);
       writer.setMaxBufferedDocs(10);
       writer.setMaxBufferedDeleteTerms(10);
       writer.setRAMBufferSizeMB(IndexWriter.DISABLE_AUTO_FLUSH);
@@ -1382,7 +1382,7 @@
 
     public void testDiverseDocs() throws IOException {
       RAMDirectory dir = new RAMDirectory();      
-      IndexWriter writer  = new IndexWriter(dir, new WhitespaceAnalyzer(), true);
+      IndexWriter writer  = new IndexWriter(dir, new WhitespaceAnalyzer(), true, IndexWriter.MaxFieldLength.LIMITED);
       writer.setRAMBufferSizeMB(0.5);
       Random rand = new Random(31415);
       for(int i=0;i<3;i++) {
@@ -1431,7 +1431,7 @@
 
     public void testEnablingNorms() throws IOException {
       RAMDirectory dir = new RAMDirectory();      
-      IndexWriter writer  = new IndexWriter(dir, new WhitespaceAnalyzer(), true);
+      IndexWriter writer  = new IndexWriter(dir, new WhitespaceAnalyzer(), true, IndexWriter.MaxFieldLength.LIMITED);
       writer.setMaxBufferedDocs(10);
       // Enable norms for only 1 doc, pre flush
       for(int j=0;j<10;j++) {
@@ -1452,7 +1452,7 @@
       assertEquals(10, hits.length());
       searcher.close();
 
-      writer  = new IndexWriter(dir, new WhitespaceAnalyzer(), true);
+      writer  = new IndexWriter(dir, new WhitespaceAnalyzer(), true, IndexWriter.MaxFieldLength.LIMITED);
       writer.setMaxBufferedDocs(10);
       // Enable norms for only 1 doc, post flush
       for(int j=0;j<27;j++) {
@@ -1478,7 +1478,7 @@
 
     public void testHighFreqTerm() throws IOException {
       RAMDirectory dir = new RAMDirectory();      
-      IndexWriter writer  = new IndexWriter(dir, new WhitespaceAnalyzer(), true);
+      IndexWriter writer  = new IndexWriter(dir, new WhitespaceAnalyzer(), true, IndexWriter.MaxFieldLength.LIMITED);
       writer.setRAMBufferSizeMB(0.01);
       writer.setMaxFieldLength(100000000);
       // Massive doc that has 128 K a's
@@ -1525,7 +1525,7 @@
       }
       
       Directory dir = new MyRAMDirectory();
-      IndexWriter writer  = new IndexWriter(dir, new WhitespaceAnalyzer(), true);
+      IndexWriter writer  = new IndexWriter(dir, new WhitespaceAnalyzer(), true, IndexWriter.MaxFieldLength.LIMITED);
       for (int i = 0; i < 100; i++) {
         addDoc(writer);
       }
@@ -1536,7 +1536,7 @@
       assertEquals("did not get right number of hits", 100, hits.length());
       writer.close();
 
-      writer  = new IndexWriter(dir, new WhitespaceAnalyzer(), true);
+      writer  = new IndexWriter(dir, new WhitespaceAnalyzer(), true, IndexWriter.MaxFieldLength.LIMITED);
       writer.close();
 
       dir.close();
@@ -1544,7 +1544,7 @@
 
     public void testFlushWithNoMerging() throws IOException {
       Directory dir = new RAMDirectory();
-      IndexWriter writer  = new IndexWriter(dir, new WhitespaceAnalyzer(), true);      
+      IndexWriter writer  = new IndexWriter(dir, new WhitespaceAnalyzer(), true, IndexWriter.MaxFieldLength.LIMITED);
       writer.setMaxBufferedDocs(2);
       Document doc = new Document();
       doc.add(new Field("field", "aaa", Field.Store.YES, Field.Index.TOKENIZED, Field.TermVector.WITH_POSITIONS_OFFSETS));
@@ -1563,7 +1563,7 @@
     // empty doc (no norms) and flush
     public void testEmptyDocAfterFlushingRealDoc() throws IOException {
       Directory dir = new RAMDirectory();
-      IndexWriter writer  = new IndexWriter(dir, new WhitespaceAnalyzer(), true);      
+      IndexWriter writer  = new IndexWriter(dir, new WhitespaceAnalyzer(), true, IndexWriter.MaxFieldLength.LIMITED);
       Document doc = new Document();
       doc.add(new Field("field", "aaa", Field.Store.YES, Field.Index.TOKENIZED, Field.TermVector.WITH_POSITIONS_OFFSETS));
       writer.addDocument(doc);
@@ -1581,7 +1581,7 @@
 
       Directory dir = new MockRAMDirectory();
       for(int pass=0;pass<2;pass++) {
-        IndexWriter writer  = new IndexWriter(dir, new WhitespaceAnalyzer(), true);      
+        IndexWriter writer  = new IndexWriter(dir, new WhitespaceAnalyzer(), true, IndexWriter.MaxFieldLength.LIMITED);
         writer.setMergeScheduler(new ConcurrentMergeScheduler());
         Document doc = new Document();
         doc.add(new Field("field", "aaa", Field.Store.YES, Field.Index.TOKENIZED, Field.TermVector.WITH_POSITIONS_OFFSETS));
@@ -1635,7 +1635,7 @@
    */
   public void testBadSegment() throws IOException {
     MockRAMDirectory dir = new MockRAMDirectory();
-    IndexWriter ir = new IndexWriter(dir, new StandardAnalyzer(), true);
+    IndexWriter ir = new IndexWriter(dir, new StandardAnalyzer(), true, IndexWriter.MaxFieldLength.LIMITED);
     
     Document document = new Document();
     document.add(new Field("tvtest", "", Field.Store.NO, Field.Index.TOKENIZED,
@@ -1648,7 +1648,7 @@
   // LUCENE-1008
   public void testNoTermVectorAfterTermVector() throws IOException {
     MockRAMDirectory dir = new MockRAMDirectory();
-    IndexWriter iw = new IndexWriter(dir, new StandardAnalyzer(), true);
+    IndexWriter iw = new IndexWriter(dir, new StandardAnalyzer(), true, IndexWriter.MaxFieldLength.LIMITED);
     Document document = new Document();
     document.add(new Field("tvtest", "a b c", Field.Store.NO, Field.Index.TOKENIZED,
         Field.TermVector.YES));
@@ -1674,7 +1674,7 @@
   // LUCENE-1010
   public void testNoTermVectorAfterTermVectorMerge() throws IOException {
     MockRAMDirectory dir = new MockRAMDirectory();
-    IndexWriter iw = new IndexWriter(dir, new StandardAnalyzer(), true);
+    IndexWriter iw = new IndexWriter(dir, new StandardAnalyzer(), true, IndexWriter.MaxFieldLength.LIMITED);
     Document document = new Document();
     document.add(new Field("tvtest", "a b c", Field.Store.NO, Field.Index.TOKENIZED,
         Field.TermVector.YES));
@@ -1706,7 +1706,7 @@
     int pri = Thread.currentThread().getPriority();
     try {
       MockRAMDirectory dir = new MockRAMDirectory();
-      IndexWriter iw = new IndexWriter(dir, new StandardAnalyzer(), true);
+      IndexWriter iw = new IndexWriter(dir, new StandardAnalyzer(), true, IndexWriter.MaxFieldLength.LIMITED);
       Document document = new Document();
       document.add(new Field("tvtest", "a b c", Field.Store.NO, Field.Index.TOKENIZED,
                              Field.TermVector.YES));
@@ -1744,7 +1744,7 @@
   // LUCENE-1013
   public void testSetMaxMergeDocs() throws IOException {
     MockRAMDirectory dir = new MockRAMDirectory();
-    IndexWriter iw = new IndexWriter(dir, new StandardAnalyzer(), true);
+    IndexWriter iw = new IndexWriter(dir, new StandardAnalyzer(), true, IndexWriter.MaxFieldLength.LIMITED);
     iw.setMergeScheduler(new MyMergeScheduler());
     iw.setMaxMergeDocs(20);
     iw.setMaxBufferedDocs(2);
@@ -1775,7 +1775,7 @@
         };
       }
 
-    }, true);
+    }, true, IndexWriter.MaxFieldLength.LIMITED);
 
     Document doc = new Document();
     String contents = "aa bb cc dd ee ff gg hh ii jj kk";
@@ -1850,7 +1850,7 @@
     failure.setDoFail();
     dir.failOn(failure);
 
-    IndexWriter writer = new IndexWriter(dir, new WhitespaceAnalyzer());
+    IndexWriter writer = new IndexWriter(dir, new WhitespaceAnalyzer(), IndexWriter.MaxFieldLength.LIMITED);
     writer.setMaxBufferedDocs(2);
     Document doc = new Document();
     String contents = "aa bb cc dd ee ff gg hh ii jj kk";
@@ -1903,7 +1903,7 @@
 
     for(int i=0;i<2;i++) {
       MockRAMDirectory dir = new MockRAMDirectory();
-      IndexWriter writer = new IndexWriter(dir, analyzer);
+      IndexWriter writer = new IndexWriter(dir, analyzer, IndexWriter.MaxFieldLength.LIMITED);
       //writer.setInfoStream(System.out);
       Document doc = new Document();
       doc.add(new Field("contents", "here are some contents", Field.Store.YES,
@@ -1946,7 +1946,7 @@
 
       assertEquals(1, numDel);
 
-      writer = new IndexWriter(dir, analyzer);
+      writer = new IndexWriter(dir, analyzer, IndexWriter.MaxFieldLength.LIMITED);
       writer.setMaxBufferedDocs(10);
       doc = new Document();
       doc.add(new Field("contents", "here are some contents", Field.Store.YES,
@@ -1990,7 +1990,7 @@
       MockRAMDirectory dir = new MockRAMDirectory();
 
       {
-        final IndexWriter writer = new IndexWriter(dir, analyzer);
+        final IndexWriter writer = new IndexWriter(dir, analyzer, IndexWriter.MaxFieldLength.LIMITED);
 
         final int finalI = i;
 
@@ -2064,7 +2064,7 @@
 
       assertEquals(NUM_THREAD*NUM_ITER, numDel);
 
-      IndexWriter writer = new IndexWriter(dir, analyzer);
+      IndexWriter writer = new IndexWriter(dir, analyzer, IndexWriter.MaxFieldLength.LIMITED);
       writer.setMaxBufferedDocs(10);
       Document doc = new Document();
       doc.add(new Field("contents", "here are some contents", Field.Store.YES,
@@ -2098,7 +2098,7 @@
     MockRAMDirectory dir = new MockRAMDirectory();
     int delID = 0;
     for(int i=0;i<20;i++) {
-      IndexWriter writer = new IndexWriter(dir, false, new WhitespaceAnalyzer());
+      IndexWriter writer = new IndexWriter(dir, false, new WhitespaceAnalyzer(), IndexWriter.MaxFieldLength.LIMITED);
       writer.setMaxBufferedDocs(2);
       writer.setMergeFactor(2);
       writer.setUseCompoundFile(false);
@@ -2134,7 +2134,7 @@
       reader.close();
 
       if (0 == i % 4) {
-        writer = new IndexWriter(dir, false, new WhitespaceAnalyzer());
+        writer = new IndexWriter(dir, false, new WhitespaceAnalyzer(), IndexWriter.MaxFieldLength.LIMITED);
         writer.setUseCompoundFile(false);
         writer.optimize();
         writer.close();
@@ -2151,7 +2151,7 @@
 
     for(int pass=0;pass<3;pass++) {
       boolean autoCommit = pass%2 == 0;
-      IndexWriter writer = new IndexWriter(directory, autoCommit, new WhitespaceAnalyzer(), true);
+      IndexWriter writer = new IndexWriter(directory, autoCommit, new WhitespaceAnalyzer(), true, IndexWriter.MaxFieldLength.LIMITED);
 
       //System.out.println("TEST: pass=" + pass + " ac=" + autoCommit + " cms=" + (pass >= 2));
       for(int iter=0;iter<10;iter++) {
@@ -2229,7 +2229,7 @@
         reader.close();
 
         // Reopen
-        writer = new IndexWriter(directory, autoCommit, new WhitespaceAnalyzer(), false);
+        writer = new IndexWriter(directory, autoCommit, new WhitespaceAnalyzer(), false, IndexWriter.MaxFieldLength.LIMITED);
       }
       writer.close();
     }
@@ -2303,7 +2303,7 @@
 
     for(int iter=0;iter<50;iter++) {
       MockRAMDirectory dir = new MockRAMDirectory();
-      IndexWriter writer = new IndexWriter(dir, new WhitespaceAnalyzer());
+      IndexWriter writer = new IndexWriter(dir, new WhitespaceAnalyzer(), IndexWriter.MaxFieldLength.LIMITED);
       ConcurrentMergeScheduler cms = new ConcurrentMergeScheduler();
 
       writer.setMergeScheduler(cms);
@@ -2362,7 +2362,7 @@
   // OK:
   public void testImmediateDiskFull() throws IOException {
     MockRAMDirectory dir = new MockRAMDirectory();
-    IndexWriter writer = new IndexWriter(dir, new WhitespaceAnalyzer());
+    IndexWriter writer = new IndexWriter(dir, new WhitespaceAnalyzer(), IndexWriter.MaxFieldLength.LIMITED);
     dir.setMaxSizeInBytes(dir.getRecomputedActualSizeInBytes());
     writer.setMaxBufferedDocs(2);
     final Document doc = new Document();
@@ -2394,7 +2394,7 @@
 
     for(int iter=0;iter<10;iter++) {
       MockRAMDirectory dir = new MockRAMDirectory();
-      IndexWriter writer = new IndexWriter(dir, new WhitespaceAnalyzer());
+      IndexWriter writer = new IndexWriter(dir, new WhitespaceAnalyzer(), IndexWriter.MaxFieldLength.LIMITED);
       ConcurrentMergeScheduler cms = new ConcurrentMergeScheduler();
       // We expect disk full exceptions in the merge threads
       cms.setSuppressExceptions();
@@ -2464,7 +2464,7 @@
   public void _testSingleThreadFailure(MockRAMDirectory.Failure failure) throws IOException {
     MockRAMDirectory dir = new MockRAMDirectory();
 
-    IndexWriter writer = new IndexWriter(dir, new WhitespaceAnalyzer());
+    IndexWriter writer = new IndexWriter(dir, new WhitespaceAnalyzer(), IndexWriter.MaxFieldLength.LIMITED);
     writer.setMaxBufferedDocs(2);
     final Document doc = new Document();
     doc.add(new Field("field", "aaa bbb ccc ddd eee fff ggg hhh iii jjj", Field.Store.YES, Field.Index.TOKENIZED, Field.TermVector.WITH_POSITIONS_OFFSETS));
@@ -2493,7 +2493,7 @@
 
     for(int iter=0;iter<5;iter++) {
       MockRAMDirectory dir = new MockRAMDirectory();
-      IndexWriter writer = new IndexWriter(dir, new WhitespaceAnalyzer());
+      IndexWriter writer = new IndexWriter(dir, new WhitespaceAnalyzer(), IndexWriter.MaxFieldLength.LIMITED);
       ConcurrentMergeScheduler cms = new ConcurrentMergeScheduler();
       // We expect disk full exceptions in the merge threads
       cms.setSuppressExceptions();
