diff --git a/StatisticsPlugin/src/org/gephi/statistics/plugin/DegreeDistribution.java b/StatisticsPlugin/src/org/gephi/statistics/plugin/DegreeDistribution.java
index aba37f7..beb49b6 100644
--- a/StatisticsPlugin/src/org/gephi/statistics/plugin/DegreeDistribution.java
+++ b/StatisticsPlugin/src/org/gephi/statistics/plugin/DegreeDistribution.java
@@ -127,7 +127,7 @@
         if (this.mDirected) {
             graph = graphModel.getDirectedGraphVisible();
         } else {
-            graph = graphModel.getUndirectedGraph();
+            graph = graphModel.getUndirectedGraphVisible();
         }
 
         graph.readLock();
