diff --git a/nd4j-backends/nd4j-backend-impls/nd4j-cuda-7.5/src/main/java/org/nd4j/linalg/jcublas/JCublasNDArrayFactory.java b/nd4j-backends/nd4j-backend-impls/nd4j-cuda-7.5/src/main/java/org/nd4j/linalg/jcublas/JCublasNDArrayFactory.java
index 0468fa1..030b141 100644
--- a/nd4j-backends/nd4j-backend-impls/nd4j-cuda-7.5/src/main/java/org/nd4j/linalg/jcublas/JCublasNDArrayFactory.java
+++ b/nd4j-backends/nd4j-backend-impls/nd4j-cuda-7.5/src/main/java/org/nd4j/linalg/jcublas/JCublasNDArrayFactory.java
@@ -906,7 +906,7 @@
 
         CudaContext context = null;
 
-        for (int x = 1; x < arrays.size(); x++ ){
+        for (int x = 0; x < arrays.size(); x++ ){
             context = allocator.getFlowController().prepareAction(arrays.get(x));
         }
 
