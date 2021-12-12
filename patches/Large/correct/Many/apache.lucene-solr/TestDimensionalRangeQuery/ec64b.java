diff --git a/lucene/core/src/test/org/apache/lucene/search/TestDimensionalRangeQuery.java b/lucene/core/src/test/org/apache/lucene/search/TestDimensionalRangeQuery.java
index 806f15b..2db1e0a 100644
--- a/lucene/core/src/test/org/apache/lucene/search/TestDimensionalRangeQuery.java
+++ b/lucene/core/src/test/org/apache/lucene/search/TestDimensionalRangeQuery.java
@@ -1028,7 +1028,7 @@
   private static Codec getCodec() {
     if (Codec.getDefault().getName().equals("Lucene60")) {
       int maxPointsInLeafNode = TestUtil.nextInt(random(), 16, 2048);
-      double maxMBSortInHeap = 2.0 + (3*random().nextDouble());
+      double maxMBSortInHeap = 3.0 + (3*random().nextDouble());
       if (VERBOSE) {
         System.out.println("TEST: using Lucene60DimensionalFormat with maxPointsInLeafNode=" + maxPointsInLeafNode + " and maxMBSortInHeap=" + maxMBSortInHeap);
       }
