diff --git a/deeplearning4j-core/src/main/java/org/deeplearning4j/clustering/algorithm/BaseClusteringAlgorithm.java b/deeplearning4j-core/src/main/java/org/deeplearning4j/clustering/algorithm/BaseClusteringAlgorithm.java
index 8ebb50e..a197b63 100755
--- a/deeplearning4j-core/src/main/java/org/deeplearning4j/clustering/algorithm/BaseClusteringAlgorithm.java
+++ b/deeplearning4j-core/src/main/java/org/deeplearning4j/clustering/algorithm/BaseClusteringAlgorithm.java
@@ -125,7 +125,7 @@
 
 		//Generate the initial cluster centers, by randomly selecting a point between 0 and max distance
 		//Thus, we are more likely to select (as a new cluster center) a point that is far from an existing cluster
-		while (clusterSet.getClusterCount() < initialClusterCount) {
+		while (clusterSet.getClusterCount() < initialClusterCount && points.size() > 0) {
 			dxs = ClusterUtils.computeSquareDistancesFromNearestCluster(clusterSet, points, dxs, exec);
 			double r = random.nextFloat() * dxs.maxNumber().doubleValue();
 			for (int i = 0; i < dxs.length(); i++) {
