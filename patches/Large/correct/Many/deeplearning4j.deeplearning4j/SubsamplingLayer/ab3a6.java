diff --git a/deeplearning4j-core/src/main/java/org/deeplearning4j/nn/layers/convolution/subsampling/SubsamplingLayer.java b/deeplearning4j-core/src/main/java/org/deeplearning4j/nn/layers/convolution/subsampling/SubsamplingLayer.java
index d5de3fb..b314b7a 100644
--- a/deeplearning4j-core/src/main/java/org/deeplearning4j/nn/layers/convolution/subsampling/SubsamplingLayer.java
+++ b/deeplearning4j-core/src/main/java/org/deeplearning4j/nn/layers/convolution/subsampling/SubsamplingLayer.java
@@ -170,9 +170,9 @@
                 isMax.muliColumnVector(epsilon1d);
                 break;
             case AVG:
-                //TODO: We could further optimize this by creating an uninitialized array, and doing a 'putiRowVector' operation
-                // instead of a zero initialization + an addiRowVector op
-                col2d.addiRowVector(epsilon1d);
+                //TODO: We could further optimize this by creating an uninitialized array, and doing a 'putiColumnVector' operation
+                // instead of a zero initialization + an addiColumnVector op
+                col2d.addiColumnVector(epsilon1d);
                 break;
             case NONE:
                 return new Pair<>(retGradient, epsilon);
