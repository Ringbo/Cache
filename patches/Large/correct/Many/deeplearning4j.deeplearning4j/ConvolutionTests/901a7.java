diff --git a/nd4j-backends/nd4j-tests/src/test/java/org/nd4j/linalg/convolution/ConvolutionTests.java b/nd4j-backends/nd4j-tests/src/test/java/org/nd4j/linalg/convolution/ConvolutionTests.java
index 4363838..5d086dc 100644
--- a/nd4j-backends/nd4j-tests/src/test/java/org/nd4j/linalg/convolution/ConvolutionTests.java
+++ b/nd4j-backends/nd4j-tests/src/test/java/org/nd4j/linalg/convolution/ConvolutionTests.java
@@ -213,11 +213,11 @@
          depth 0
          h0,w0      h0,w1
            0  2     1  3
-           8  9     9 11
+           8 10     9 11
 
          h1,w0      h1,w1
            4  6     5  7
-          12 13    13 15
+          12 14    13 15
 
          - example 1 -
          depth 0
@@ -260,13 +260,13 @@
         //depth 0
         expected.put(new INDArrayIndex[] {NDArrayIndex.point(0), NDArrayIndex.point(0), NDArrayIndex.all(),
                         NDArrayIndex.all(), NDArrayIndex.point(0), NDArrayIndex.point(0)},
-                Nd4j.create(new double[][] {{0, 2}, {8, 9}}));
+                Nd4j.create(new double[][] {{0, 2}, {8, 10}}));
         expected.put(new INDArrayIndex[] {NDArrayIndex.point(0), NDArrayIndex.point(0), NDArrayIndex.all(),
                         NDArrayIndex.all(), NDArrayIndex.point(0), NDArrayIndex.point(1)},
                 Nd4j.create(new double[][] {{1, 3}, {9, 11}}));
         expected.put(new INDArrayIndex[] {NDArrayIndex.point(0), NDArrayIndex.point(0), NDArrayIndex.all(),
                         NDArrayIndex.all(), NDArrayIndex.point(1), NDArrayIndex.point(0)},
-                Nd4j.create(new double[][] {{4, 6}, {12, 13}}));
+                Nd4j.create(new double[][] {{4, 6}, {12, 14}}));
         expected.put(new INDArrayIndex[] {NDArrayIndex.point(0), NDArrayIndex.point(0), NDArrayIndex.all(),
                         NDArrayIndex.all(), NDArrayIndex.point(1), NDArrayIndex.point(1)},
                 Nd4j.create(new double[][] {{5, 7}, {13, 15}}));
