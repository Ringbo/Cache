diff --git a/deeplearning4j-core/src/test/java/org/deeplearning4j/gradientcheck/GradientCheckTests.java b/deeplearning4j-core/src/test/java/org/deeplearning4j/gradientcheck/GradientCheckTests.java
index 51e5b33..f3cf20d 100644
--- a/deeplearning4j-core/src/test/java/org/deeplearning4j/gradientcheck/GradientCheckTests.java
+++ b/deeplearning4j-core/src/test/java/org/deeplearning4j/gradientcheck/GradientCheckTests.java
@@ -538,7 +538,7 @@
     		
     		Random r = new Random(12345L);
         	INDArray input = Nd4j.zeros(miniBatchSize[i],nIn,timeSeriesLength[i]);
-        	for( int m=0; m<miniBatchSize[m]; m++ ){
+        	for( int m=0; m<miniBatchSize[i]; m++ ){
         		for( int j=0; j<nIn; j++ ){
         			for( int k=0; k<timeSeriesLength[i]; k++ ){
         				input.putScalar(new int[]{m,j,k},r.nextDouble()-0.5);
