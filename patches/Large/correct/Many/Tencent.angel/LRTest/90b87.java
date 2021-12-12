diff --git a/angel-ps/mllib/src/test/java/com/tencent/angel/ml/logisticregression/LRTest.java b/angel-ps/mllib/src/test/java/com/tencent/angel/ml/logisticregression/LRTest.java
index 4b9a467..21a33cd 100644
--- a/angel-ps/mllib/src/test/java/com/tencent/angel/ml/logisticregression/LRTest.java
+++ b/angel-ps/mllib/src/test/java/com/tencent/angel/ml/logisticregression/LRTest.java
@@ -53,7 +53,7 @@
       // Feature number of train data
       int featureNum = 1230;
       // Total iteration number
-      int epochNum = 5;
+      int epochNum = 100;
       // Validation sample Ratio
       double vRatio = 0.1;
       // Data format, libsvm or dummy
@@ -64,13 +64,13 @@
 
 
       // Learning rate
-      double learnRate = 1.0;
+      double learnRate = 5.0;
       // Decay of learning rate
       double decay = 0.05;
       // Regularization coefficient
       double reg = 0.001;
       double posnegRatio = 0.1;
-      String optimizer = "Momentum";
+      String optimizer = "FTRL";
 
       // Set local deploy mode
       conf.set(AngelConf.ANGEL_DEPLOY_MODE, "LOCAL");
