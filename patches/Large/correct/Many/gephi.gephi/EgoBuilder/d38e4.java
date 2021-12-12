diff --git a/FiltersPlugin/src/org/gephi/filters/plugin/graph/EgoBuilder.java b/FiltersPlugin/src/org/gephi/filters/plugin/graph/EgoBuilder.java
index ecdbe0f..4278a08 100644
--- a/FiltersPlugin/src/org/gephi/filters/plugin/graph/EgoBuilder.java
+++ b/FiltersPlugin/src/org/gephi/filters/plugin/graph/EgoBuilder.java
@@ -90,7 +90,7 @@
             for (Node n : graph.getNodes()) {
                 if (n.getNodeData().getId().toLowerCase().contains(str)) {
                     nodes.add(n);
-                } else if (n.getNodeData().getLabel().toLowerCase().contains(str)) {
+                } else if ((n.getNodeData().getLabel() != null) && n.getNodeData().getLabel().toLowerCase().contains(str)) {
                     nodes.add(n);
                 }
             }
@@ -130,7 +130,7 @@
         }
 
         public String getName() {
-            return NbBundle.getMessage(DegreeRangeBuilder.class, "EgoBuilder.name");
+            return NbBundle.getMessage(EgoBuilder.class, "EgoBuilder.name");
         }
 
         public FilterProperty[] getProperties() {
