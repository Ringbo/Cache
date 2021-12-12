diff --git a/lucene/src/test/org/apache/lucene/index/TestIndexWriterForceMerge.java b/lucene/src/test/org/apache/lucene/index/TestIndexWriterForceMerge.java
index 11921cd..5df31a3 100644
--- a/lucene/src/test/org/apache/lucene/index/TestIndexWriterForceMerge.java
+++ b/lucene/src/test/org/apache/lucene/index/TestIndexWriterForceMerge.java
@@ -186,7 +186,7 @@
 
       if (0 == pass) {
         writer.close();
-        IndexReader reader = IndexReader.open(dir);
+        DirectoryReader reader = IndexReader.open(dir);
         assertEquals(1, reader.getSequentialSubReaders().length);
         reader.close();
       } else {
@@ -196,7 +196,7 @@
         writer.addDocument(doc);
         writer.close();
 
-        IndexReader reader = IndexReader.open(dir);
+        DirectoryReader reader = IndexReader.open(dir);
         assertTrue(reader.getSequentialSubReaders().length > 1);
         reader.close();
 
