diff --git a/deeplearning4j-cuda/src/main/java/org/deeplearning4j/nn/layers/normalization/CudnnBatchNormalizationHelper.java b/deeplearning4j-cuda/src/main/java/org/deeplearning4j/nn/layers/normalization/CudnnBatchNormalizationHelper.java
index 0cbb879..229b962 100644
--- a/deeplearning4j-cuda/src/main/java/org/deeplearning4j/nn/layers/normalization/CudnnBatchNormalizationHelper.java
+++ b/deeplearning4j-cuda/src/main/java/org/deeplearning4j/nn/layers/normalization/CudnnBatchNormalizationHelper.java
@@ -184,7 +184,7 @@
                 shape[0], shape[1], shape.length > 2 ? shape[2] : 1, shape.length > 3 ? shape[3] : 1));
 
         Allocator allocator = AtomicAllocator.getInstance();
-        CudaContext context = allocator.getFlowController().prepareAction(input, epsilon, nextEpsilon, gamma, dGammaView, dBetaView);
+        CudaContext context = allocator.getFlowController().prepareActionAllWrite(input, epsilon, nextEpsilon, gamma, dGammaView, dBetaView);
         Pointer srcData = allocator.getPointer(input, context);
         Pointer epsData = allocator.getPointer(epsilon, context);
         Pointer dstData = allocator.getPointer(nextEpsilon, context);
@@ -197,7 +197,7 @@
                 cudnnContext.srcTensorDesc, srcData, cudnnContext.deltaTensorDesc, epsData, cudnnContext.dstTensorDesc, dstData,
                 cudnnContext.gammaBetaTensorDesc, gammaData, dGammaData, dBetaData, eps, meanCache, varCache));
 
-        allocator.registerAction(context, input, epsilon, nextEpsilon, gamma, dGammaView, dBetaView);
+        allocator.getFlowController().registerActionAllWrite(context, input, epsilon, nextEpsilon, gamma, dGammaView, dBetaView);
 
         retGradient.setGradientFor(BatchNormalizationParamInitializer.GAMMA, dGammaView);
         retGradient.setGradientFor(BatchNormalizationParamInitializer.BETA, dBetaView);
@@ -226,7 +226,7 @@
                 shape[0], shape[1], shape.length > 2 ? shape[2] : 1, shape.length > 3 ? shape[3] : 1));
 
         Allocator allocator = AtomicAllocator.getInstance();
-        CudaContext context = allocator.getFlowController().prepareAction(x, activations, gamma, beta, mean, var);
+        CudaContext context = allocator.getFlowController().prepareActionAllWrite(x, activations, gamma, beta, mean, var);
         Pointer srcData = allocator.getPointer(x, context);
         Pointer dstData = allocator.getPointer(activations, context);
         Pointer gammaData = allocator.getPointer(gamma, context);
@@ -256,7 +256,7 @@
                     cudnnContext.gammaBetaTensorDesc, gammaData, betaData, meanData, varData, eps));
         }
 
-        allocator.registerAction(context, x, activations, gamma, beta, mean, var);
+        allocator.getFlowController().registerActionAllWrite(context, x, activations, gamma, beta, mean, var);
 
         return activations;
     }
