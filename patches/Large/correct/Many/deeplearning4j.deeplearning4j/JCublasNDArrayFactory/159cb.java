diff --git a/nd4j-backends/nd4j-backend-impls/nd4j-cuda-7.5/src/main/java/org/nd4j/linalg/jcublas/JCublasNDArrayFactory.java b/nd4j-backends/nd4j-backend-impls/nd4j-cuda-7.5/src/main/java/org/nd4j/linalg/jcublas/JCublasNDArrayFactory.java
index 33bef05..6ff4db4 100644
--- a/nd4j-backends/nd4j-backend-impls/nd4j-cuda-7.5/src/main/java/org/nd4j/linalg/jcublas/JCublasNDArrayFactory.java
+++ b/nd4j-backends/nd4j-backend-impls/nd4j-cuda-7.5/src/main/java/org/nd4j/linalg/jcublas/JCublasNDArrayFactory.java
@@ -472,7 +472,7 @@
                 long hostYShapeInfo = AddressRetriever.retrieveHostAddress(m.shapeInfoDataBuffer());
 
                 long[] extras = new long[]{
-                        AddressRetriever.retrieveHostAddress(m.shapeInfoDataBuffer()),
+                        AddressRetriever.retrieveHostAddress(ret.shapeInfoDataBuffer()),
                         context.getOldStream().getNativePointer(),
                         allocator.getDeviceId(),
                         context.getBufferAllocation(),
@@ -480,7 +480,7 @@
                         context.getBufferScalar(),
                         context.getBufferSpecial(),
                         hostYShapeInfo,
-                        0
+                        AddressRetriever.retrieveHostAddress(ret.shapeInfoDataBuffer())
                 };
 
                 if (m.data().dataType() == DataBuffer.Type.DOUBLE) {
