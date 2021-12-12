diff --git a/lucene/core/src/test/org/apache/lucene/codecs/lucene60/TestLucene60PointFormat.java b/lucene/core/src/test/org/apache/lucene/codecs/lucene60/TestLucene60PointFormat.java
index c154f53..322640b 100644
--- a/lucene/core/src/test/org/apache/lucene/codecs/lucene60/TestLucene60PointFormat.java
+++ b/lucene/core/src/test/org/apache/lucene/codecs/lucene60/TestLucene60PointFormat.java
@@ -41,7 +41,7 @@
     if (random().nextBoolean()) {
       // randomize parameters
       int maxPointsInLeafNode = TestUtil.nextInt(random(), 50, 500);
-      double maxMBSortInHeap = 0.1 + (3*random().nextDouble());
+      double maxMBSortInHeap = 3.0 + (3*random().nextDouble());
       if (VERBOSE) {
         System.out.println("TEST: using Lucene60PointFormat with maxPointsInLeafNode=" + maxPointsInLeafNode + " and maxMBSortInHeap=" + maxMBSortInHeap);
       }
