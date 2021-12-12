diff --git a/graph_model/src/org/hanuna/gitalk/graphmodel/fragment/FragmentGraphDecorator.java b/graph_model/src/org/hanuna/gitalk/graphmodel/fragment/FragmentGraphDecorator.java
index 305f65e..f68bafd 100644
--- a/graph_model/src/org/hanuna/gitalk/graphmodel/fragment/FragmentGraphDecorator.java
+++ b/graph_model/src/org/hanuna/gitalk/graphmodel/fragment/FragmentGraphDecorator.java
@@ -29,7 +29,7 @@
     public Edge getHideFragmentUpEdge(@NotNull Node node) {
         List<Edge> edges = downNodeEdges.get(node);
         for (Edge edge : edges) {
-            if (isVisibleNode(edge.getDownNode())) {
+            if (isVisibleNode(edge.getUpNode())) {
                 return edge;
             }
         }
@@ -40,7 +40,7 @@
     public Edge getHideFragmentDownEdge(@NotNull Node node) {
         List<Edge> edges = upNodeEdges.get(node);
         for (Edge edge : edges) {
-            if (isVisibleNode(edge.getUpNode())) {
+            if (isVisibleNode(edge.getDownNode())) {
                 return edge;
             }
         }
