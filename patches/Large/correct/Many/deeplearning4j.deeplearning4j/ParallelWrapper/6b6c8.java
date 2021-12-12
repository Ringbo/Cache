diff --git a/deeplearning4j-scaleout/deeplearning4j-scaleout-parallelwrapper/src/main/java/org/deeplearning4j/parallelism/ParallelWrapper.java b/deeplearning4j-scaleout/deeplearning4j-scaleout-parallelwrapper/src/main/java/org/deeplearning4j/parallelism/ParallelWrapper.java
index 065cd8d..4922c47 100644
--- a/deeplearning4j-scaleout/deeplearning4j-scaleout-parallelwrapper/src/main/java/org/deeplearning4j/parallelism/ParallelWrapper.java
+++ b/deeplearning4j-scaleout/deeplearning4j-scaleout-parallelwrapper/src/main/java/org/deeplearning4j/parallelism/ParallelWrapper.java
@@ -312,7 +312,7 @@
         double score = 0.0;
 
         List<INDArray> params = new ArrayList<>();
-        for (int cnt = 0; cnt < workers && cnt < locker.get(); cnt++) {
+        for (int cnt = 1; cnt < workers && cnt < locker.get(); cnt++) {
             params.add(zoo[cnt].getModel().params());
             score += zoo[cnt].getModel().score();
         }
