diff --git a/deeplearning4j-core/src/test/java/org/deeplearning4j/optimize/solver/TestOptimizers.java b/deeplearning4j-core/src/test/java/org/deeplearning4j/optimize/solver/TestOptimizers.java
index baea647..2dffb72 100644
--- a/deeplearning4j-core/src/test/java/org/deeplearning4j/optimize/solver/TestOptimizers.java
+++ b/deeplearning4j-core/src/test/java/org/deeplearning4j/optimize/solver/TestOptimizers.java
@@ -416,14 +416,14 @@
                             .layer(new DenseLayer.Builder().nIn(1).nOut(1).updater(Updater.ADAGRAD).build()).build();
             conf.addVariable("W"); //Normally done by ParamInitializers, but obviously that isn't done here
 
-            Model m = new RastriginFunctionModel(100, conf);
+            Model m = new RastriginFunctionModel(10, conf);
             int nParams = m.numParams();
             if (i == 0) {
                 m.computeGradientAndScore();
                 scores[0] = m.score(); //Before optimization
             } else {
                 ConvexOptimizer opt = getOptimizer(oa, conf, m);
-                opt.getUpdater().setStateViewArray((Layer) m, Nd4j.createUninitialized(new int[] {1, nParams}, 'c'),
+                opt.getUpdater().setStateViewArray((Layer) m, Nd4j.create(new int[] {1, nParams}, 'c'),
                                 true);
                 opt.optimize();
                 m.computeGradientAndScore();
