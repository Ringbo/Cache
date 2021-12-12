diff --git a/LayoutPlugin/src/org/gephi/layout/plugin/scale/ScaleLayout.java b/LayoutPlugin/src/org/gephi/layout/plugin/scale/ScaleLayout.java
index 25db7f7..ab66ce1 100644
--- a/LayoutPlugin/src/org/gephi/layout/plugin/scale/ScaleLayout.java
+++ b/LayoutPlugin/src/org/gephi/layout/plugin/scale/ScaleLayout.java
@@ -54,7 +54,7 @@
         double xMean = 0, yMean = 0;
         for (Node n : graph.getNodes()) {
             xMean += n.getNodeData().x();
-            yMean += n.getNodeData().x();
+            yMean += n.getNodeData().y();
         }
         xMean /= graph.getNodeCount();
         yMean /= graph.getNodeCount();
