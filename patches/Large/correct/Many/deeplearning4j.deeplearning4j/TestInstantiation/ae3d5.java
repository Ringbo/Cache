diff --git a/deeplearning4j-zoo/src/test/java/org/deeplearning4j/zoo/TestInstantiation.java b/deeplearning4j-zoo/src/test/java/org/deeplearning4j/zoo/TestInstantiation.java
index 16b81bd..ec23795 100644
--- a/deeplearning4j-zoo/src/test/java/org/deeplearning4j/zoo/TestInstantiation.java
+++ b/deeplearning4j-zoo/src/test/java/org/deeplearning4j/zoo/TestInstantiation.java
@@ -39,7 +39,7 @@
 
         for(int i = 0; i < models.length; i++) {
             ZooModel model = models[i];
-            String modelName = model.getClass().getName();
+            String modelName = model.getClass().getSimpleName();
             log.info("Testing training on zoo model " + modelName);
             int gridWidth = -1;
             int gridHeight = -1;
@@ -53,7 +53,7 @@
             // set up data iterator
             int[] inputShape = model.metaData().getInputShape()[0];
             DataSetIterator iter = new BenchmarkDataSetIterator(
-                            new int[] {16, inputShape[0], inputShape[1], inputShape[2]}, numClasses, 1,
+                            new int[] {8, inputShape[0], inputShape[1], inputShape[2]}, numClasses, 1,
                             gridWidth, gridHeight);
 
             Model initializedModel = model.init();
