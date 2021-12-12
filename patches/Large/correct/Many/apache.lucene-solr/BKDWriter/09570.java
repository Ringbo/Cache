diff --git a/lucene/core/src/java/org/apache/lucene/util/bkd/BKDWriter.java b/lucene/core/src/java/org/apache/lucene/util/bkd/BKDWriter.java
index d7db94b..c4ac04e 100644
--- a/lucene/core/src/java/org/apache/lucene/util/bkd/BKDWriter.java
+++ b/lucene/core/src/java/org/apache/lucene/util/bkd/BKDWriter.java
@@ -435,7 +435,7 @@
    *  disk. This method does not use transient disk in order to reorder points.
    */
   public long writeField(IndexOutput out, String fieldName, MutablePointValues reader) throws IOException {
-    if (numIndexDims == 1) {
+    if (numDataDims == 1) {
       return writeField1Dim(out, fieldName, reader);
     } else {
       return writeFieldNDims(out, fieldName, reader);
