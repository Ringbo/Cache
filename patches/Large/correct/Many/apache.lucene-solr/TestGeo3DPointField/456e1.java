diff --git a/lucene/spatial3d/src/test/org/apache/lucene/geo3d/TestGeo3DPointField.java b/lucene/spatial3d/src/test/org/apache/lucene/geo3d/TestGeo3DPointField.java
index 7ef605e..64e92a4 100644
--- a/lucene/spatial3d/src/test/org/apache/lucene/geo3d/TestGeo3DPointField.java
+++ b/lucene/spatial3d/src/test/org/apache/lucene/geo3d/TestGeo3DPointField.java
@@ -75,7 +75,7 @@
   private static Codec getCodec() {
     if (Codec.getDefault().getName().equals("Lucene60")) {
       int maxPointsInLeafNode = TestUtil.nextInt(random(), 16, 2048);
-      double maxMBSortInHeap = 0.1 + (3*random().nextDouble());
+      double maxMBSortInHeap = 3.0 + (3*random().nextDouble());
       if (VERBOSE) {
         System.out.println("TEST: using Lucene60DimensionalFormat with maxPointsInLeafNode=" + maxPointsInLeafNode + " and maxMBSortInHeap=" + maxMBSortInHeap);
       }
