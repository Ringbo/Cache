diff --git a/nd4j-backends/nd4j-tests/src/test/java/org/nd4j/linalg/convolution/ConvolutionTests.java b/nd4j-backends/nd4j-tests/src/test/java/org/nd4j/linalg/convolution/ConvolutionTests.java
index 070c13f..4363838 100644
--- a/nd4j-backends/nd4j-tests/src/test/java/org/nd4j/linalg/convolution/ConvolutionTests.java
+++ b/nd4j-backends/nd4j-tests/src/test/java/org/nd4j/linalg/convolution/ConvolutionTests.java
@@ -292,12 +292,12 @@
         //Now: test with a provided results array, where the results array has weird strides
         INDArray out2 = Nd4j.create(new int[] {miniBatch, depth, outH, outW, kH, kW}, 'c');
         INDArray out2p = out2.permute(0, 1, 4, 5, 2, 3);
-        Convolution.im2col(input, kH, kW, sY, sX, pY, pX, false, out2p);
+        Convolution.im2col(input, kH, kW, sY, sX, pY, pX, dh, dw, false, out2p);
         assertEquals(expected, out2p);
 
         INDArray out3 = Nd4j.create(new int[] {miniBatch, outH, outW, depth, kH, kW}, 'c');
         INDArray out3p = out3.permute(0, 3, 4, 5, 1, 2);
-        Convolution.im2col(input, kH, kW, sY, sX, pY, pX, false, out3p);
+        Convolution.im2col(input, kH, kW, sY, sX, pY, pX, dh, dw, false, out3p);
         assertEquals(expected, out3p);
     }
 
