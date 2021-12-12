diff --git a/nd4j-api/src/main/java/org/nd4j/linalg/factory/Nd4j.java b/nd4j-api/src/main/java/org/nd4j/linalg/factory/Nd4j.java
index 2fc388b..1503792 100644
--- a/nd4j-api/src/main/java/org/nd4j/linalg/factory/Nd4j.java
+++ b/nd4j-api/src/main/java/org/nd4j/linalg/factory/Nd4j.java
@@ -1664,7 +1664,7 @@
      * @return the random ndarray with the specified shape
      */
     public static INDArray rand(int[] shape) {
-        INDArray ret = INSTANCE.rand(shape);
+        INDArray ret = INSTANCE.rand(shape,Nd4j.getRandom());
         logCreationIfNecessary(ret);
         return ret;
     }
