diff --git a/nd4j-backends/nd4j-backend-impls/nd4j-cuda/src/main/java/org/nd4j/linalg/jcublas/ops/executioner/CudaExecutioner.java b/nd4j-backends/nd4j-backend-impls/nd4j-cuda/src/main/java/org/nd4j/linalg/jcublas/ops/executioner/CudaExecutioner.java
index eb5b70d..2d559fe 100644
--- a/nd4j-backends/nd4j-backend-impls/nd4j-cuda/src/main/java/org/nd4j/linalg/jcublas/ops/executioner/CudaExecutioner.java
+++ b/nd4j-backends/nd4j-backend-impls/nd4j-cuda/src/main/java/org/nd4j/linalg/jcublas/ops/executioner/CudaExecutioner.java
@@ -1868,7 +1868,7 @@
     }
 
     protected <T extends Aggregate> DataBuffer getBuffer(Batch<T> batch) {
-        DataBuffer buffer = Nd4j.getDataBufferFactory().createInt(batch.getSample().getRequiredBatchMemorySize() * 5 , false);
+        DataBuffer buffer = Nd4j.getDataBufferFactory().createInt(batch.getSample().getRequiredBatchMemorySize() * 4 , false);
         batch.setParamsSurface(buffer);
         return buffer;
     }
@@ -1960,8 +1960,8 @@
         PointerPointer extraArgs = new PointerPointer(32);
         extraArgs.put(0, null);
         extraArgs.put(1, context.getOldStream());
-        //extraArgs.put(2, new CudaPointer(Math.min(batch.getNumAggregates(), CudaEnvironment.getInstance().getConfiguration().getMaximumGridSize())));
-        extraArgs.put(2, new CudaPointer(8192));
+        extraArgs.put(2, new CudaPointer(Math.min(batch.getNumAggregates(), CudaEnvironment.getInstance().getConfiguration().getMaximumGridSize())));
+        //extraArgs.put(2, new CudaPointer(8192));
         extraArgs.put(3, new CudaPointer(batch.getSample().getThreadsPerInstance()));
         extraArgs.put(4, new CudaPointer(batch.getSample().getSharedMemorySize()));
 
