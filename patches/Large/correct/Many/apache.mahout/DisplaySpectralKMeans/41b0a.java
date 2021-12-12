diff --git a/examples/src/main/java/org/apache/mahout/clustering/display/DisplaySpectralKMeans.java b/examples/src/main/java/org/apache/mahout/clustering/display/DisplaySpectralKMeans.java
index 144fe69..ed3f88f 100644
--- a/examples/src/main/java/org/apache/mahout/clustering/display/DisplaySpectralKMeans.java
+++ b/examples/src/main/java/org/apache/mahout/clustering/display/DisplaySpectralKMeans.java
@@ -67,7 +67,7 @@
     }
     int maxIter = 10;
     double convergenceDelta = 0.001;
-    SpectralKMeansDriver.run(new Configuration(), affinities, output, 1100, 5, measure, convergenceDelta, maxIter);
+    SpectralKMeansDriver.run(new Configuration(), affinities, output, 1100, 2, measure, convergenceDelta, maxIter);
     loadClusters(output);
     new DisplaySpectralKMeans();
   }
