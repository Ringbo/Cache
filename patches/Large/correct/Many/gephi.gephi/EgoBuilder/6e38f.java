diff --git a/FiltersPlugin/src/org/gephi/filters/plugin/graph/EgoBuilder.java b/FiltersPlugin/src/org/gephi/filters/plugin/graph/EgoBuilder.java
index 8786574..40ac4fa 100644
--- a/FiltersPlugin/src/org/gephi/filters/plugin/graph/EgoBuilder.java
+++ b/FiltersPlugin/src/org/gephi/filters/plugin/graph/EgoBuilder.java
@@ -90,9 +90,9 @@
 
             List<Node> nodes = new ArrayList<Node>();
             for (Node n : hgraph.getNodes()) {
-                if (n.getNodeData().getId().toLowerCase().contains(str)) {
+                if (n.getNodeData().getId().toLowerCase().equals(str)) {
                     nodes.add(n);
-                } else if ((n.getNodeData().getLabel() != null) && n.getNodeData().getLabel().toLowerCase().contains(str)) {
+                } else if ((n.getNodeData().getLabel() != null) && n.getNodeData().getLabel().toLowerCase().equals(str)) {
                     nodes.add(n);
                 }
             }
