diff --git a/deeplearning4j-nn/src/main/java/org/deeplearning4j/nn/conf/layers/InputTypeUtil.java b/deeplearning4j-nn/src/main/java/org/deeplearning4j/nn/conf/layers/InputTypeUtil.java
index eebf970..63d03d1 100644
--- a/deeplearning4j-nn/src/main/java/org/deeplearning4j/nn/conf/layers/InputTypeUtil.java
+++ b/deeplearning4j-nn/src/main/java/org/deeplearning4j/nn/conf/layers/InputTypeUtil.java
@@ -53,7 +53,7 @@
         }
 
         int hOut = (inHeight - kH + 2 * padH) / sH + 1;
-        int wOut = (inWidth - kW + 2 * padW) / sH + 1;
+        int wOut = (inWidth - kW + 2 * padW) / sW + 1;
         return InputType.convolutional(hOut, wOut, outputDepth);
     }
 
