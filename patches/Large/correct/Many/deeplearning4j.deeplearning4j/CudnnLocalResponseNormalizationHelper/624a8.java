diff --git a/deeplearning4j-cuda/src/main/java/org/deeplearning4j/nn/layers/normalization/CudnnLocalResponseNormalizationHelper.java b/deeplearning4j-cuda/src/main/java/org/deeplearning4j/nn/layers/normalization/CudnnLocalResponseNormalizationHelper.java
index af4be81..d961c7f 100644
--- a/deeplearning4j-cuda/src/main/java/org/deeplearning4j/nn/layers/normalization/CudnnLocalResponseNormalizationHelper.java
+++ b/deeplearning4j-cuda/src/main/java/org/deeplearning4j/nn/layers/normalization/CudnnLocalResponseNormalizationHelper.java
@@ -144,7 +144,7 @@
                 dstStride[0], dstStride[1], dstStride[2], dstStride[3]));
 
         Allocator allocator = AtomicAllocator.getInstance();
-        CudaContext context = allocator.getFlowController().prepareAction(input, epsilon, activations, nextEpsilon);
+        CudaContext context = allocator.getFlowController().prepareActionAllWrite(input, epsilon, activations, nextEpsilon);
         Pointer srcData = allocator.getPointer(input, context);
         Pointer epsData = allocator.getPointer(epsilon, context);
         Pointer zData = allocator.getPointer(activations, context);
@@ -155,7 +155,7 @@
                 this.alpha, cudnnContext.deltaTensorDesc, zData, cudnnContext.deltaTensorDesc, epsData, cudnnContext.srcTensorDesc, srcData,
                 this.beta, cudnnContext.dstTensorDesc, dstData));
 
-        allocator.registerAction(context, input, epsilon, activations, nextEpsilon);
+        allocator.getFlowController().registerActionAllWrite(context, input, epsilon, activations, nextEpsilon);
 
         return new Pair<>(retGradient,nextEpsilon);
     }
@@ -179,7 +179,7 @@
         checkCudnn(cudnnSetLRNDescriptor(cudnnContext.lrnDesc, (int)n, alpha, beta, k));
 
         Allocator allocator = AtomicAllocator.getInstance();
-        CudaContext context = allocator.getFlowController().prepareAction(input, activations);
+        CudaContext context = allocator.getFlowController().prepareActionAllWrite(input, activations);
         Pointer srcData = allocator.getPointer(input, context);
         Pointer dstData = allocator.getPointer(activations, context);
 
@@ -190,7 +190,7 @@
         checkCudnn(cudnnLRNCrossChannelForward(cudnnContext, cudnnContext.lrnDesc, CUDNN_LRN_CROSS_CHANNEL_DIM1,
                 this.alpha, cudnnContext.srcTensorDesc, srcData, this.beta, cudnnContext.dstTensorDesc, dstData));
 
-        allocator.registerAction(context, input, activations);
+        allocator.getFlowController().registerActionAllWrite(context, input, activations);
 
         return activations;
     }
