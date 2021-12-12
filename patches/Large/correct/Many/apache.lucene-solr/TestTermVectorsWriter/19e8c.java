diff --git a/src/test/org/apache/lucene/index/TestTermVectorsWriter.java b/src/test/org/apache/lucene/index/TestTermVectorsWriter.java
index 2318427..a362074 100644
--- a/src/test/org/apache/lucene/index/TestTermVectorsWriter.java
+++ b/src/test/org/apache/lucene/index/TestTermVectorsWriter.java
@@ -106,7 +106,8 @@
       assertTrue(false);
     }
   }
-  private void checkTermVector(TermVectorsReader reader, int docNum, String field) throws IOException {
+  
+  private void checkTermVector(TermVectorsReader reader, int docNum, String field) {
     TermFreqVector vector = reader.get(docNum, field);
     assertTrue(vector != null);
     String[] terms = vector.getTerms();
@@ -159,7 +160,7 @@
   /**
    * 
    * @param writer The writer to write to
-   * @param j The field number
+   * @param f The field name
    * @throws IOException
    */
   private void writeField(TermVectorsWriter writer, String f) throws IOException {
