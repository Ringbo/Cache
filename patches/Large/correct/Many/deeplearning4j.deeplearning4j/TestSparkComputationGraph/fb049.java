diff --git a/deeplearning4j-scaleout/spark/dl4j-spark/src/test/java/org/deeplearning4j/spark/impl/graph/TestSparkComputationGraph.java b/deeplearning4j-scaleout/spark/dl4j-spark/src/test/java/org/deeplearning4j/spark/impl/graph/TestSparkComputationGraph.java
index f9cb285..b7a3a48 100644
--- a/deeplearning4j-scaleout/spark/dl4j-spark/src/test/java/org/deeplearning4j/spark/impl/graph/TestSparkComputationGraph.java
+++ b/deeplearning4j-scaleout/spark/dl4j-spark/src/test/java/org/deeplearning4j/spark/impl/graph/TestSparkComputationGraph.java
@@ -339,7 +339,7 @@
         JavaRDD<MultiDataSet> rdd = sc.parallelize(l);
         rdd = rdd.repartition(20);
 
-        IEvaluation[] es2 = scg.doEvaluationMDS(rdd, 5, new Evaluation(), new ROC());
+        IEvaluation[] es2 = scg.doEvaluationMDS(rdd, 5, new Evaluation(), new ROC(32));
         Evaluation e2 = (Evaluation) es2[0];
         ROC roc2 = (ROC) es2[1];
 
