diff --git a/ExportPlugin/src/org/gephi/io/exporter/plugin/ExporterGDF.java b/ExportPlugin/src/org/gephi/io/exporter/plugin/ExporterGDF.java
index 95579b9..2a3d3e7 100644
--- a/ExportPlugin/src/org/gephi/io/exporter/plugin/ExporterGDF.java
+++ b/ExportPlugin/src/org/gephi/io/exporter/plugin/ExporterGDF.java
@@ -314,7 +314,7 @@
 
     private void attributesNodeColumns(AttributeModel attributeModel) {
         List<AttributeColumn> cols = new ArrayList<AttributeColumn>();
-        if (attributeModel != null) {
+        if (exportAttributes && attributeModel != null) {
             for (AttributeColumn column : attributeModel.getNodeTable().getColumns()) {
                 if (!isNodeDefaultColumn(column.getId())) {
                     cols.add(column);
@@ -326,7 +326,7 @@
 
     private void attributesEdgeColumns(AttributeModel attributeModel) {
         List<AttributeColumn> cols = new ArrayList<AttributeColumn>();
-        if (attributeModel != null) {
+        if (exportAttributes && attributeModel != null) {
             for (AttributeColumn column : attributeModel.getEdgeTable().getColumns()) {
                 if (!isEdgeDefaultColumn(column.getId())) {
                     cols.add(column);
