diff --git a/StatisticsPlugin/src/org/gephi/statistics/plugin/GraphDensity.java b/StatisticsPlugin/src/org/gephi/statistics/plugin/GraphDensity.java
index 52adb67..b007800 100644
--- a/StatisticsPlugin/src/org/gephi/statistics/plugin/GraphDensity.java
+++ b/StatisticsPlugin/src/org/gephi/statistics/plugin/GraphDensity.java
@@ -70,9 +70,9 @@
         Graph graph;
 
         if (mDirected) {
-            graph = graphModel.getDirectedGraph();
+            graph = graphModel.getDirectedGraphVisible();
         } else {
-            graph = graphModel.getUndirectedGraph();
+            graph = graphModel.getUndirectedGraphVisible();
         }
 
         this.mGraphRevision = "(" + graph.getNodeVersion() + ", " + graph.getEdgeVersion() + ")";
