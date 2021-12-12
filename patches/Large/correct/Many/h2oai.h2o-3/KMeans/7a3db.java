diff --git a/h2o-algos/src/main/java/hex/kmeans/KMeans.java b/h2o-algos/src/main/java/hex/kmeans/KMeans.java
index c46f195..45f8d81 100644
--- a/h2o-algos/src/main/java/hex/kmeans/KMeans.java
+++ b/h2o-algos/src/main/java/hex/kmeans/KMeans.java
@@ -228,7 +228,7 @@
     boolean isDone( KMeansModel model, double[][] newCenters, double[][] oldCenters ) {
       if( !isRunning() ) return true; // Stopped/cancelled
       // Stopped for running out iterations
-      if( model._output._iters >= _parms._max_iters ) return true;
+      if( model._output._iters > _parms._max_iters ) return true;
 
       // Compute average change in standardized cluster centers
       if( oldCenters==null ) return false; // No prior iteration, not stopping
