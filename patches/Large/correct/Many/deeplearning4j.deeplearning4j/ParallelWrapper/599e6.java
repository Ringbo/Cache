diff --git a/deeplearning4j-scaleout/deeplearning4j-scaleout-parallelwrapper/src/main/java/org/deeplearning4j/parallelism/ParallelWrapper.java b/deeplearning4j-scaleout/deeplearning4j-scaleout-parallelwrapper/src/main/java/org/deeplearning4j/parallelism/ParallelWrapper.java
index 4922c47..f1de190 100644
--- a/deeplearning4j-scaleout/deeplearning4j-scaleout-parallelwrapper/src/main/java/org/deeplearning4j/parallelism/ParallelWrapper.java
+++ b/deeplearning4j-scaleout/deeplearning4j-scaleout-parallelwrapper/src/main/java/org/deeplearning4j/parallelism/ParallelWrapper.java
@@ -312,12 +312,12 @@
         double score = 0.0;
 
         List<INDArray> params = new ArrayList<>();
-        for (int cnt = 1; cnt < workers && cnt < locker.get(); cnt++) {
+        for (int cnt = 0; cnt < workers && cnt < locker.get(); cnt++) {
             params.add(zoo[cnt].getModel().params());
             score += zoo[cnt].getModel().score();
         }
 
-        Nd4j.averageAndPropagate(model.params(), params);
+        Nd4j.averageAndPropagate(null, params);
 
 
         score /= Math.min(workers, locker.get());
@@ -344,7 +344,7 @@
                         batchSize += workerModel.batchSize();
                     }
 
-                    Nd4j.averageAndPropagate(updater.getStateViewArray(), updaters);
+                    Nd4j.averageAndPropagate(null, updaters);
                 }
             }
 
@@ -361,7 +361,7 @@
                         updaters.add(workerModel.getUpdater().getStateViewArray());
                         batchSize += workerModel.batchSize();
                     }
-                    Nd4j.averageAndPropagate(updater.getStateViewArray(), updaters);
+                    Nd4j.averageAndPropagate(null, updaters);
                 }
             }
 
