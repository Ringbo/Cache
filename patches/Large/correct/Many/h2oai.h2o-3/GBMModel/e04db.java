diff --git a/h2o-algos/src/main/java/hex/tree/gbm/GBMModel.java b/h2o-algos/src/main/java/hex/tree/gbm/GBMModel.java
index 71c9545..470219f 100755
--- a/h2o-algos/src/main/java/hex/tree/gbm/GBMModel.java
+++ b/h2o-algos/src/main/java/hex/tree/gbm/GBMModel.java
@@ -41,7 +41,7 @@
    *  subclass scoring logic. */
   @Override protected double[] score0(double data[/*ncols*/], double preds[/*nclasses+1*/], double weight, double offset, int ntrees) {
     super.score0(data, preds, weight, offset, ntrees);    // These are f_k(x) in Algorithm 10.4
-    if (_parms._distribution == Distribution.Family.bernoulli) {
+    if (_parms._distribution == Distribution.Family.bernoulli || _parms._distribution == Distribution.Family.modified_huber) {
       double f = preds[1] + _output._init_f + offset; //Note: class 1 probability stored in preds[1] (since we have only one tree)
       preds[2] = new Distribution(_parms).linkInv(f);
       preds[1] = 1.0 - preds[2];
