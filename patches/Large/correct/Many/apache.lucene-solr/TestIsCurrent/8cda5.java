diff --git a/lucene/src/test/org/apache/lucene/index/TestIsCurrent.java b/lucene/src/test/org/apache/lucene/index/TestIsCurrent.java
index 4d1057d..2fa6e36 100644
--- a/lucene/src/test/org/apache/lucene/index/TestIsCurrent.java
+++ b/lucene/src/test/org/apache/lucene/index/TestIsCurrent.java
@@ -63,7 +63,7 @@
   public void testDeleteByTermIsCurrent() throws IOException {
 
     // get reader
-    IndexReader reader = writer.getReader();
+    DirectoryReader reader = writer.getReader();
 
     // assert index has a document and reader is up2date 
     assertEquals("One document should be in the index", 1, writer.numDocs());
@@ -90,7 +90,7 @@
   public void testDeleteAllIsCurrent() throws IOException {
 
     // get reader
-    IndexReader reader = writer.getReader();
+    DirectoryReader reader = writer.getReader();
 
     // assert index has a document and reader is up2date 
     assertEquals("One document should be in the index", 1, writer.numDocs());
