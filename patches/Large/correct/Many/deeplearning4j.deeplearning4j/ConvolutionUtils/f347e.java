diff --git a/deeplearning4j-nn/src/main/java/org/deeplearning4j/util/ConvolutionUtils.java b/deeplearning4j-nn/src/main/java/org/deeplearning4j/util/ConvolutionUtils.java
index b4c918d..201b2bc 100644
--- a/deeplearning4j-nn/src/main/java/org/deeplearning4j/util/ConvolutionUtils.java
+++ b/deeplearning4j-nn/src/main/java/org/deeplearning4j/util/ConvolutionUtils.java
@@ -224,7 +224,7 @@
                         sb.toString());
             }
 
-            if (eKernel.length == 2 && (inShape[2] - eKernel[2] + 2 * padding[2]) % strides[2] != 0) {
+            if (eKernel.length == 3 && (inShape[2] - eKernel[2] + 2 * padding[2]) % strides[2] != 0) {
                 int inD = inShape[2];
                 double d = (inD - eKernel[2] + 2 * padding[2]) / ((double) strides[2]) + 1.0;
                 String str = String.format("%.2f", d);
@@ -460,7 +460,7 @@
             in2d = workspaceMgr.dup(type, in2d, 'c');
 
         INDArray out = in2d.reshape('c', toShape[0], toShape[2], toShape[3], toShape[1]);
-        return out.permute(0, 3, 1, 2);
+        return workspaceMgr.leverageTo(type, out.permute(0, 3, 1, 2));
     }
 
     public static INDArray reshapeMaskIfRequired(INDArray mask, INDArray output, LayerWorkspaceMgr workspaceMgr, ArrayType type){
@@ -487,7 +487,7 @@
 
         INDArray bMaskPermute = bMask.permute(0, 2, 3).dup('c');  //Not sure if dup is strictly necessary...
 
-        return bMaskPermute.reshape('c', s[0] * s[2] * s[3], 1);
+        return workspaceMgr.leverageTo(type, bMaskPermute.reshape('c', s[0] * s[2] * s[3], 1));
     }
 
     public static INDArray reshape3dMask(INDArray mask, LayerWorkspaceMgr workspaceMgr, ArrayType type){
