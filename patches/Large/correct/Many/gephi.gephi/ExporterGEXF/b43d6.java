diff --git a/ExportPlugin/src/org/gephi/io/exporter/plugin/ExporterGEXF.java b/ExportPlugin/src/org/gephi/io/exporter/plugin/ExporterGEXF.java
index 48b4b6c..897b733 100644
--- a/ExportPlugin/src/org/gephi/io/exporter/plugin/ExporterGEXF.java
+++ b/ExportPlugin/src/org/gephi/io/exporter/plugin/ExporterGEXF.java
@@ -409,10 +409,10 @@
         edgeE.setAttribute("source", e.getSource().getNodeData().getId());
         edgeE.setAttribute("target", e.getTarget().getNodeData().getId());
 
-        if( e.isDirected() && !graphModel.isDirected() ) {
+        if( e.isDirected() && graphModel.isMixed() ) {
             edgeE.setAttribute("type", "directed");
         }
-        else if( !e.isDirected() && graphModel.isDirected() ) {
+        else if( !e.isDirected() && graphModel.isMixed() ) {
             edgeE.setAttribute("type", "undirected");
         }
 
