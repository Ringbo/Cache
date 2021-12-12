diff --git a/nd4j-jcublas-parent/nd4j-jcublas-6.5/src/test/java/org/nd4j/linalg/jcublas/rng/distribution/RngKernelTest.java b/nd4j-jcublas-parent/nd4j-jcublas-6.5/src/test/java/org/nd4j/linalg/jcublas/rng/distribution/RngKernelTest.java
index c843466..df13d8e 100644
--- a/nd4j-jcublas-parent/nd4j-jcublas-6.5/src/test/java/org/nd4j/linalg/jcublas/rng/distribution/RngKernelTest.java
+++ b/nd4j-jcublas-parent/nd4j-jcublas-6.5/src/test/java/org/nd4j/linalg/jcublas/rng/distribution/RngKernelTest.java
@@ -23,7 +23,7 @@
 	public void testUniformSample() {
 		Nd4j.dtype = DataBuffer.FLOAT;
 		for(int x = 0; x<100; x++) {
-			INDArray arr = Nd4j.rand(200,200,max,min,Nd4j.getRandom());
+			INDArray arr = Nd4j.rand(200,200,min,max,Nd4j.getRandom());
 			
 			// Assert the values are within range
 			assertMaxMin(arr);
