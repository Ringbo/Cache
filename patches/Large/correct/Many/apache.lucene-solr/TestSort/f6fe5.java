diff --git a/src/test/org/apache/lucene/search/TestSort.java b/src/test/org/apache/lucene/search/TestSort.java
index 1c1b227..e6385fa 100644
--- a/src/test/org/apache/lucene/search/TestSort.java
+++ b/src/test/org/apache/lucene/search/TestSort.java
@@ -447,7 +447,7 @@
   }
 
   static class MyFieldComparatorSource extends FieldComparatorSource {
-    FieldComparator newComparator(String fieldname, IndexReader[] subReaders, int numHits, int sortPos, boolean reversed) {
+    public FieldComparator newComparator(String fieldname, IndexReader[] subReaders, int numHits, int sortPos, boolean reversed) {
       return new MyFieldComparator(numHits);
     }
   }
