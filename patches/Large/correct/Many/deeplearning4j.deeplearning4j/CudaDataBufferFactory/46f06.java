diff --git a/nd4j-backends/nd4j-backend-impls/nd4j-cuda/src/main/java/org/nd4j/linalg/jcublas/buffer/factory/CudaDataBufferFactory.java b/nd4j-backends/nd4j-backend-impls/nd4j-cuda/src/main/java/org/nd4j/linalg/jcublas/buffer/factory/CudaDataBufferFactory.java
index 0d90571..13b894a 100644
--- a/nd4j-backends/nd4j-backend-impls/nd4j-cuda/src/main/java/org/nd4j/linalg/jcublas/buffer/factory/CudaDataBufferFactory.java
+++ b/nd4j-backends/nd4j-backend-impls/nd4j-cuda/src/main/java/org/nd4j/linalg/jcublas/buffer/factory/CudaDataBufferFactory.java
@@ -95,7 +95,7 @@
             case FLOAT:
                 return createFloat(buffer.length(), init);
             case DOUBLE:
-                return createHalf(buffer.length(), init);
+                return createDouble(buffer.length(), init);
             case HALF:
                 return createHalf(buffer.length(), init);
             default:
@@ -118,7 +118,7 @@
             case FLOAT:
                 return createFloat(buffer.length(), init, workspace);
             case DOUBLE:
-                return createHalf(buffer.length(), init, workspace);
+                return createDouble(buffer.length(), init, workspace);
             case HALF:
                 return createHalf(buffer.length(), init, workspace);
             default:
