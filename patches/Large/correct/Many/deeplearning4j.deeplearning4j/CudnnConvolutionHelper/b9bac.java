diff --git a/deeplearning4j-cuda/src/main/java/org/deeplearning4j/nn/layers/convolution/CudnnConvolutionHelper.java b/deeplearning4j-cuda/src/main/java/org/deeplearning4j/nn/layers/convolution/CudnnConvolutionHelper.java
index fb9a23d..cf5222d 100644
--- a/deeplearning4j-cuda/src/main/java/org/deeplearning4j/nn/layers/convolution/CudnnConvolutionHelper.java
+++ b/deeplearning4j-cuda/src/main/java/org/deeplearning4j/nn/layers/convolution/CudnnConvolutionHelper.java
@@ -225,8 +225,8 @@
                         srcStride[0], srcStride[1], srcStride[2], srcStride[3]));
         checkCudnn(cudnnSetTensor4dDescriptorEx(cudnnContext.deltaTensorDesc, dataType, miniBatch, outDepth, outH, outW,
                         deltaStride[0], deltaStride[1], deltaStride[2], deltaStride[3]));
-        checkCudnn(cudnnSetConvolution2dDescriptor(cudnnContext.convDesc, pad[0], pad[1], strides[0], strides[1], 1, 1,
-                        CUDNN_CROSS_CORRELATION));
+        checkCudnn(cudnnSetConvolution2dDescriptor_v5(cudnnContext.convDesc, pad[0], pad[1], strides[0], strides[1], 1, 1,
+                        CUDNN_CROSS_CORRELATION, dataType));
         checkCudnn(cudnnSetFilter4dDescriptor(cudnnContext.filterDesc, dataType, tensorFormat, outDepth, inDepth, kH,
                         kW));
         checkCudnn(cudnnGetConvolutionBackwardFilterAlgorithm(cudnnContext, cudnnContext.srcTensorDesc,
@@ -320,8 +320,8 @@
                         srcStride[0], srcStride[1], srcStride[2], srcStride[3]));
         checkCudnn(cudnnSetFilter4dDescriptor(cudnnContext.filterDesc, dataType, tensorFormat, outDepth, inDepth, kH,
                         kW));
-        checkCudnn(cudnnSetConvolution2dDescriptor(cudnnContext.convDesc, pad[0], pad[1], strides[0], strides[1], 1, 1,
-                        CUDNN_CROSS_CORRELATION));
+        checkCudnn(cudnnSetConvolution2dDescriptor_v5(cudnnContext.convDesc, pad[0], pad[1], strides[0], strides[1], 1, 1,
+                        CUDNN_CROSS_CORRELATION, dataType));
 
         // find dimension of convolution output
         //        checkCudnn(cudnnGetConvolution2dForwardOutputDim(cudnnContext.convDesc, cudnnContext.srcTensorDesc, cudnnContext.filterDesc, n, c, h, w));
