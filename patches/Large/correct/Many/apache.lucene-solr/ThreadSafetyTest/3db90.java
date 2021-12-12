diff --git a/src/test/org/apache/lucene/ThreadSafetyTest.java b/src/test/org/apache/lucene/ThreadSafetyTest.java
index c9fade5..0fa304a 100644
--- a/src/test/org/apache/lucene/ThreadSafetyTest.java
+++ b/src/test/org/apache/lucene/ThreadSafetyTest.java
@@ -68,7 +68,7 @@
 
           if (i%reopenInterval == 0) {
             writer.close();
-            writer = new IndexWriter("index", ANALYZER, false);
+            writer = new IndexWriter("index", ANALYZER, false, IndexWriter.MaxFieldLength.LIMITED);
           }
         }
         
@@ -142,7 +142,7 @@
     IndexReader.unlock(FSDirectory.getDirectory(indexDir));
 
     if (!readOnly) {
-      IndexWriter writer = new IndexWriter(indexDir, ANALYZER, !add);
+      IndexWriter writer = new IndexWriter(indexDir, ANALYZER, !add, IndexWriter.MaxFieldLength.LIMITED);
       
       Thread indexerThread = new IndexerThread(writer);
       indexerThread.start();
