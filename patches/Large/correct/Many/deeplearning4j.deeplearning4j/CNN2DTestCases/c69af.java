diff --git a/deeplearning4j/dl4j-integration-tests/src/test/java/org/deeplearning4j/integration/testcases/CNN2DTestCases.java b/deeplearning4j/dl4j-integration-tests/src/test/java/org/deeplearning4j/integration/testcases/CNN2DTestCases.java
index d014dd6..5fd9a33 100644
--- a/deeplearning4j/dl4j-integration-tests/src/test/java/org/deeplearning4j/integration/testcases/CNN2DTestCases.java
+++ b/deeplearning4j/dl4j-integration-tests/src/test/java/org/deeplearning4j/integration/testcases/CNN2DTestCases.java
@@ -145,10 +145,10 @@
 
                 DataSet ds = iter.next();
                 ds = ds.asList().get(0);
-                list.add(new Pair<>(new INDArray[]{ds.getFeatureMatrix()}, null));
+                list.add(new Pair<>(new INDArray[]{ds.getFeatures()}, null));
 
                 ds = iter.next();
-                list.add(new Pair<>(new INDArray[]{ds.getFeatureMatrix()}, null));
+                list.add(new Pair<>(new INDArray[]{ds.getFeatures()}, null));
                 return list;
             }
 
