diff --git a/arbiter-deeplearning4j/src/test/java/org/deeplearning4j/arbiter/multilayernetwork/TestErrors.java b/arbiter-deeplearning4j/src/test/java/org/deeplearning4j/arbiter/multilayernetwork/TestErrors.java
index ba9a565..24badc7 100644
--- a/arbiter-deeplearning4j/src/test/java/org/deeplearning4j/arbiter/multilayernetwork/TestErrors.java
+++ b/arbiter-deeplearning4j/src/test/java/org/deeplearning4j/arbiter/multilayernetwork/TestErrors.java
@@ -47,7 +47,7 @@
                 .candidateGenerator(candidateGenerator).dataProvider(new TestDataProviderMnist(32, 10))
                 .modelSaver(new FileModelSaver(f)).scoreFunction(new TestSetLossScoreFunction(true))
                 .terminationConditions(
-                        new MaxCandidatesCondition(10))
+                        new MaxCandidatesCondition(5))
                 .build();
 
         IOptimizationRunner runner = new LocalOptimizationRunner(configuration);
@@ -74,7 +74,7 @@
                 .candidateGenerator(candidateGenerator).dataProvider(new TestDataProviderMnist(32, 10))
                 .modelSaver(new FileModelSaver(f)).scoreFunction(new TestSetLossScoreFunction(true))
                 .terminationConditions(
-                        new MaxCandidatesCondition(10))
+                        new MaxCandidatesCondition(5))
                 .build();
 
         IOptimizationRunner runner = new LocalOptimizationRunner(configuration);
@@ -102,7 +102,7 @@
         OptimizationConfiguration configuration = new OptimizationConfiguration.Builder()
                 .candidateGenerator(candidateGenerator).dataProvider(new TestDataProviderMnist(32, 10))
                 .modelSaver(new FileModelSaver(f)).scoreFunction(new TestSetLossScoreFunction(true))
-                .terminationConditions(new MaxCandidatesCondition(10))
+                .terminationConditions(new MaxCandidatesCondition(5))
                 .build();
 
         IOptimizationRunner runner = new LocalOptimizationRunner(configuration);
@@ -130,7 +130,7 @@
                 .candidateGenerator(candidateGenerator).dataProvider(new TestDataProviderMnist(32, 10))
                 .modelSaver(new FileModelSaver(f)).scoreFunction(new TestSetLossScoreFunction(true))
                 .terminationConditions(
-                        new MaxCandidatesCondition(10))
+                        new MaxCandidatesCondition(5))
                 .build();
 
         IOptimizationRunner runner = new LocalOptimizationRunner(configuration, new MultiLayerNetworkTaskCreator());
