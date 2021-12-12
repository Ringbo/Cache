diff --git a/VisualizationModule/src/org/gephi/visualization/opengl/text/TextManager.java b/VisualizationModule/src/org/gephi/visualization/opengl/text/TextManager.java
index 3361f60..52f9856 100644
--- a/VisualizationModule/src/org/gephi/visualization/opengl/text/TextManager.java
+++ b/VisualizationModule/src/org/gephi/visualization/opengl/text/TextManager.java
@@ -119,7 +119,7 @@
                     TextManager.this.model = VizController.getInstance().getVizModel().getTextModel();
 
                     //Initialize columns if needed
-                    if (model.getNodeTextColumns() == null) {
+                    if (model.getNodeTextColumns() == null || model.getNodeTextColumns().length == 0) {
                         AttributeController attributeController = Lookup.getDefault().lookup(AttributeController.class);
                         if (attributeController != null && attributeController.getModel() != null) {
                             AttributeModel attributeModel = attributeController.getModel();
