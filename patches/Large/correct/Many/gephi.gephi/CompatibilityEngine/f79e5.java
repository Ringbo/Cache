diff --git a/modules/VisualizationImpl/src/main/java/org/gephi/visualization/opengl/CompatibilityEngine.java b/modules/VisualizationImpl/src/main/java/org/gephi/visualization/opengl/CompatibilityEngine.java
index eea3873..4dee54a 100644
--- a/modules/VisualizationImpl/src/main/java/org/gephi/visualization/opengl/CompatibilityEngine.java
+++ b/modules/VisualizationImpl/src/main/java/org/gephi/visualization/opengl/CompatibilityEngine.java
@@ -197,7 +197,7 @@
         markTime++;
 
         //Arrows
-        if (vizConfig.isShowArrows() && dataBridge.isDirected()) {
+        if (edgeClass.isEnabled() && vizConfig.isShowArrows() && dataBridge.isDirected()) {
             gl.glBegin(GL2.GL_TRIANGLES);
             for (Iterator<EdgeModel> itr = octree.getEdgeIterator(); itr.hasNext();) {
                 EdgeModel obj = itr.next();
