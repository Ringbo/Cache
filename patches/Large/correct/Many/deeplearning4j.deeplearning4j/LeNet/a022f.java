diff --git a/deeplearning4j-zoo/src/main/java/org/deeplearning4j/zoo/model/LeNet.java b/deeplearning4j-zoo/src/main/java/org/deeplearning4j/zoo/model/LeNet.java
index 1ea768b..09c94aa 100644
--- a/deeplearning4j-zoo/src/main/java/org/deeplearning4j/zoo/model/LeNet.java
+++ b/deeplearning4j-zoo/src/main/java/org/deeplearning4j/zoo/model/LeNet.java
@@ -61,7 +61,7 @@
     @Override
     public long pretrainedChecksum(PretrainedType pretrainedType) {
         if (pretrainedType == PretrainedType.MNIST)
-            return 3337733202L;
+            return 1906861161L;
         else
             return 0L;
     }
