diff --git a/deeplearning4j-scaleout/spark/dl4j-spark/src/test/java/org/deeplearning4j/spark/impl/layer/TestSparkLayer.java b/deeplearning4j-scaleout/spark/dl4j-spark/src/test/java/org/deeplearning4j/spark/impl/layer/TestSparkLayer.java
index ac78c80..b473948 100644
--- a/deeplearning4j-scaleout/spark/dl4j-spark/src/test/java/org/deeplearning4j/spark/impl/layer/TestSparkLayer.java
+++ b/deeplearning4j-scaleout/spark/dl4j-spark/src/test/java/org/deeplearning4j/spark/impl/layer/TestSparkLayer.java
@@ -52,7 +52,7 @@
 
 
         System.out.println("Initializing network");
-        SparkDl4jLayerS master = new SparkDl4jLayer(sc, conf);
+        SparkDl4jLayer master = new SparkDl4jLayer(sc, conf);
         DataSet d = new IrisDataSetIterator(150, 150).next();
         d.normalizeZeroMeanZeroUnitVariance();
         d.shuffle();
