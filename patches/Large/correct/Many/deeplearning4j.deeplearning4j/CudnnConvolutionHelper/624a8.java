diff --git a/deeplearning4j-cuda/src/main/java/org/deeplearning4j/nn/layers/convolution/CudnnConvolutionHelper.java b/deeplearning4j-cuda/src/main/java/org/deeplearning4j/nn/layers/convolution/CudnnConvolutionHelper.java
index ecef664..8477785 100644
--- a/deeplearning4j-cuda/src/main/java/org/deeplearning4j/nn/layers/convolution/CudnnConvolutionHelper.java
+++ b/deeplearning4j-cuda/src/main/java/org/deeplearning4j/nn/layers/convolution/CudnnConvolutionHelper.java
@@ -209,7 +209,7 @@
         int[] dstStride = epsNext.stride();
 
         Allocator allocator = AtomicAllocator.getInstance();
-        CudaContext context = allocator.getFlowController().prepareAction(input, weights, weightGradView, biasGradView, delta, epsNext);
+        CudaContext context = allocator.getFlowController().prepareActionAllWrite(input, weights, weightGradView, biasGradView, delta, epsNext);
         Pointer srcData = allocator.getPointer(input, context);
         Pointer filterData = allocator.getPointer(weights, context);
         Pointer filterGradData = allocator.getPointer(weightGradView, context);
@@ -238,7 +238,7 @@
         checkCudnn(cudnnConvolutionBackwardData(cudnnContext, alpha, cudnnContext.filterDesc, filterData, cudnnContext.deltaTensorDesc, deltaData, cudnnContext.convDesc,
                 algo2[0], workSpace, workSpace.capacity(), beta, cudnnContext.dstTensorDesc, dstData));
 
-        allocator.registerAction(context, input, weights, weightGradView, biasGradView, delta, epsNext);
+        allocator.getFlowController().registerActionAllWrite(context, input, weights, weightGradView, biasGradView, delta, epsNext);
 
         Gradient retGradient = new DefaultGradient();
         retGradient.setGradientFor(ConvolutionParamInitializer.BIAS_KEY, biasGradView);
@@ -280,7 +280,7 @@
                         CUDNN_CONVOLUTION_FWD_NO_WORKSPACE : CUDNN_CONVOLUTION_FWD_PREFER_FASTEST, 0, algo));
 
         Allocator allocator = AtomicAllocator.getInstance();
-        CudaContext context = allocator.getFlowController().prepareAction(input, weights, bias, z);
+        CudaContext context = allocator.getFlowController().prepareAction(z, input, weights, bias);
         Pointer srcData = allocator.getPointer(input, context);
         Pointer filterData = allocator.getPointer(weights, context);
         Pointer biasData = allocator.getPointer(bias, context);
@@ -300,7 +300,7 @@
         checkCudnn(cudnnSetTensor4dDescriptor(cudnnContext.biasTensorDesc, tensorFormat, dataType, 1, c[0], 1, 1));
         checkCudnn(cudnnAddTensor(cudnnContext, alpha, cudnnContext.biasTensorDesc, biasData, alpha, cudnnContext.dstTensorDesc, dstData));
 
-        allocator.registerAction(context, input, weights, bias, z);
+        allocator.registerAction(context, z, input, weights, bias);
 
         return z;
     }
