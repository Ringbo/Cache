diff --git a/nd4j-api/src/main/java/org/nd4j/linalg/lossfunctions/LossFunctions.java b/nd4j-api/src/main/java/org/nd4j/linalg/lossfunctions/LossFunctions.java
index 09089df..ba32f62 100644
--- a/nd4j-api/src/main/java/org/nd4j/linalg/lossfunctions/LossFunctions.java
+++ b/nd4j-api/src/main/java/org/nd4j/linalg/lossfunctions/LossFunctions.java
@@ -62,7 +62,7 @@
                 break;
             case MCXENT:
                 INDArray columnSums = labels.mul(log(z));
-                ret = columnSums.mean(1).mean(Integer.MAX_VALUE).getDouble(0);
+                ret = columnSums.sum(1).sum(Integer.MAX_VALUE).getDouble(0);
                 break;
             case XENT:
                 INDArray xEntLogZ = log(z);
