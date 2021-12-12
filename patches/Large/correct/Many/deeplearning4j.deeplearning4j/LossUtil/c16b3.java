diff --git a/nd4j-backends/nd4j-api-parent/nd4j-api/src/main/java/org/nd4j/linalg/lossfunctions/LossUtil.java b/nd4j-backends/nd4j-api-parent/nd4j-api/src/main/java/org/nd4j/linalg/lossfunctions/LossUtil.java
index a5f034e..a0883c7 100644
--- a/nd4j-backends/nd4j-api-parent/nd4j-api/src/main/java/org/nd4j/linalg/lossfunctions/LossUtil.java
+++ b/nd4j-backends/nd4j-api-parent/nd4j-api/src/main/java/org/nd4j/linalg/lossfunctions/LossUtil.java
@@ -27,7 +27,7 @@
     public static void applyMask(INDArray to, INDArray mask) {
         //Two possibilities exist: it's *per example* masking, or it's *per output* masking
         //These cases have different mask shapes. Per example: column vector. Per output: same shape as score array
-        if (mask.isColumnVector()) {
+        if (mask.isColumnVectorOrScalar()) {
             to.muliColumnVector(mask);
         } else if (Arrays.equals(to.shape(), mask.shape())) {
             to.muli(mask);
