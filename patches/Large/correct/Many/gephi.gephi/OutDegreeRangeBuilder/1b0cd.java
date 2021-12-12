diff --git a/FiltersPlugin/src/org/gephi/filters/plugin/graph/OutDegreeRangeBuilder.java b/FiltersPlugin/src/org/gephi/filters/plugin/graph/OutDegreeRangeBuilder.java
index f928fc4..0b9d660 100644
--- a/FiltersPlugin/src/org/gephi/filters/plugin/graph/OutDegreeRangeBuilder.java
+++ b/FiltersPlugin/src/org/gephi/filters/plugin/graph/OutDegreeRangeBuilder.java
@@ -122,7 +122,7 @@
             HierarchicalDirectedGraph hgraph = (HierarchicalDirectedGraph) graph;
             List<Integer> values = new ArrayList<Integer>(((HierarchicalGraph) graph).getNodeCount());
             for (Node n : hgraph.getNodes()) {
-                int degree = hgraph.getMutualDegree(n);
+                int degree = hgraph.getTotalOutDegree(n);
                 values.add(degree);
             }
             return values.toArray(new Number[0]);
