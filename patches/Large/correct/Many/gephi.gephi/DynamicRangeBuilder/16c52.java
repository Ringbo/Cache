diff --git a/FiltersPlugin/src/org/gephi/filters/plugin/dynamic/DynamicRangeBuilder.java b/FiltersPlugin/src/org/gephi/filters/plugin/dynamic/DynamicRangeBuilder.java
index b561725..85c330a 100644
--- a/FiltersPlugin/src/org/gephi/filters/plugin/dynamic/DynamicRangeBuilder.java
+++ b/FiltersPlugin/src/org/gephi/filters/plugin/dynamic/DynamicRangeBuilder.java
@@ -204,7 +204,7 @@
             }
             if (edgeColumn != null) {
                 for (Edge e : graph.getEdgesAndMetaEdges()) {
-                    Object obj = e.getEdgeData().getAttributes().getValue(nodeColumn.getIndex());
+                    Object obj = e.getEdgeData().getAttributes().getValue(edgeColumn.getIndex());
                     if (obj != null) {
                         TimeInterval timeInterval = (TimeInterval) obj;
                         min = Math.min(min, Double.isInfinite(timeInterval.getLow()) ? min : timeInterval.getLow());
