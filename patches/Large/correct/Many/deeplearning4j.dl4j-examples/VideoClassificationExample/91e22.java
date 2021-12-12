diff --git a/dl4j-examples/src/main/java/org/deeplearning4j/examples/recurrent/video/VideoClassificationExample.java b/dl4j-examples/src/main/java/org/deeplearning4j/examples/recurrent/video/VideoClassificationExample.java
index ad17998..8a49905 100644
--- a/dl4j-examples/src/main/java/org/deeplearning4j/examples/recurrent/video/VideoClassificationExample.java
+++ b/dl4j-examples/src/main/java/org/deeplearning4j/examples/recurrent/video/VideoClassificationExample.java
@@ -193,7 +193,7 @@
             DataSet dsTest = testData.next();
             INDArray predicted = net.output(dsTest.getFeatureMatrix(), false);
             INDArray actual = dsTest.getLabels();
-            evaluation.evalTimeSeries(predicted, actual);
+            evaluation.evalTimeSeries(actual, predicted);
         }
 
         System.out.println(evaluation.stats());
