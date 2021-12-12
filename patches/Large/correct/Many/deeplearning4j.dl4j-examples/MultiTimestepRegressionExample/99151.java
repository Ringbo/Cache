diff --git a/dl4j-examples/src/main/java/org/deeplearning4j/examples/recurrent/regression/MultiTimestepRegressionExample.java b/dl4j-examples/src/main/java/org/deeplearning4j/examples/recurrent/regression/MultiTimestepRegressionExample.java
index 4b74426..be1121e 100644
--- a/dl4j-examples/src/main/java/org/deeplearning4j/examples/recurrent/regression/MultiTimestepRegressionExample.java
+++ b/dl4j-examples/src/main/java/org/deeplearning4j/examples/recurrent/regression/MultiTimestepRegressionExample.java
@@ -145,8 +145,7 @@
             trainDataIter.reset();
             LOGGER.info("Epoch " + i + " complete. Time series evaluation:");
 
-            //Run regression evaluation on our single column input
-            RegressionEvaluation evaluation = new RegressionEvaluation(1);
+            RegressionEvaluation evaluation = new RegressionEvaluation(2);
 
             //Run evaluation. This is on 25k reviews, so can take some time
             while (testDataIter.hasNext()) {
