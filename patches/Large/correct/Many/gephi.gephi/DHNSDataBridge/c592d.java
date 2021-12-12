diff --git a/VisualizationModule/src/org/gephi/visualization/bridge/DHNSDataBridge.java b/VisualizationModule/src/org/gephi/visualization/bridge/DHNSDataBridge.java
index 3703b72..5da525e 100644
--- a/VisualizationModule/src/org/gephi/visualization/bridge/DHNSDataBridge.java
+++ b/VisualizationModule/src/org/gephi/visualization/bridge/DHNSDataBridge.java
@@ -209,7 +209,7 @@
                     arrowObj.setCacheMarker(cacheMarker);
                 }
             } else {
-                if (!undirected && vizConfig.isShowArrows() && !edge.isSelfLoop()) {
+                if (!undirected && vizConfig.isShowArrows() && !edge.isSelfLoop() && edge.isDirected()) {
                     ModelImpl arrowObj = ((Edge2dModel) obj).getArrow();
                     arrowObj.setCacheMarker(cacheMarker);
                 }
