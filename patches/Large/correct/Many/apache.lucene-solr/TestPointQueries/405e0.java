diff --git a/lucene/core/src/test/org/apache/lucene/search/TestPointQueries.java b/lucene/core/src/test/org/apache/lucene/search/TestPointQueries.java
index 184c50f..3a8f718 100644
--- a/lucene/core/src/test/org/apache/lucene/search/TestPointQueries.java
+++ b/lucene/core/src/test/org/apache/lucene/search/TestPointQueries.java
@@ -1017,7 +1017,7 @@
   private static Codec getCodec() {
     if (Codec.getDefault().getName().equals("Lucene60")) {
       int maxPointsInLeafNode = TestUtil.nextInt(random(), 16, 2048);
-      double maxMBSortInHeap = 3.0 + (3*random().nextDouble());
+      double maxMBSortInHeap = 4.0 + (3*random().nextDouble());
       if (VERBOSE) {
         System.out.println("TEST: using Lucene60PointFormat with maxPointsInLeafNode=" + maxPointsInLeafNode + " and maxMBSortInHeap=" + maxMBSortInHeap);
       }
