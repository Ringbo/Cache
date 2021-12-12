diff --git a/core/src/main/java/org/apache/mahout/clustering/spectral/kmeans/SpectralKMeansDriver.java b/core/src/main/java/org/apache/mahout/clustering/spectral/kmeans/SpectralKMeansDriver.java
index 316f3bd..ee77c5c 100644
--- a/core/src/main/java/org/apache/mahout/clustering/spectral/kmeans/SpectralKMeansDriver.java
+++ b/core/src/main/java/org/apache/mahout/clustering/spectral/kmeans/SpectralKMeansDriver.java
@@ -142,7 +142,7 @@
     // unnecessary vectors later
     int overshoot = (int) ((double) clusters * OVERSHOOT_MULTIPLIER);
     DistributedLanczosSolver solver = new DistributedLanczosSolver();
-    LanczosState state = new LanczosState(L, clusters, DistributedLanczosSolver.getInitialVector(L));
+    LanczosState state = new LanczosState(L, overshoot, DistributedLanczosSolver.getInitialVector(L));
     Path lanczosSeqFiles = new Path(outputCalc, "eigenvectors-" + (System.nanoTime() & 0xFF));
     solver.runJob(conf,
                   state,
