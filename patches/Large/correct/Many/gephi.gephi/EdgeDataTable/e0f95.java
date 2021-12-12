diff --git a/DesktopDataLaboratory/src/org/gephi/desktop/datalab/EdgeDataTable.java b/DesktopDataLaboratory/src/org/gephi/desktop/datalab/EdgeDataTable.java
index aeb985d..db1e774 100644
--- a/DesktopDataLaboratory/src/org/gephi/desktop/datalab/EdgeDataTable.java
+++ b/DesktopDataLaboratory/src/org/gephi/desktop/datalab/EdgeDataTable.java
@@ -271,10 +271,10 @@
         }
 
         if (model == null) {
-            model = new EdgeDataTableModel(graph.getEdges().toArray(), columns.toArray(new EdgeDataColumn[0]));
+            model = new EdgeDataTableModel(graph.getEdgesAndMetaEdges().toArray(), columns.toArray(new EdgeDataColumn[0]));
             table.setModel(model);
         } else {
-            model.setEdges(graph.getEdges().toArray());
+            model.setEdges(graph.getEdgesAndMetaEdges().toArray());
             model.setColumns(columns.toArray(new EdgeDataColumn[0]));
         }
 
