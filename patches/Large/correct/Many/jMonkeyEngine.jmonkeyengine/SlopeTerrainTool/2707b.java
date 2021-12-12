diff --git a/sdk/jme3-terrain-editor/src/com/jme3/gde/terraineditor/tools/SlopeTerrainTool.java b/sdk/jme3-terrain-editor/src/com/jme3/gde/terraineditor/tools/SlopeTerrainTool.java
index ef74aa5..86c1f86 100644
--- a/sdk/jme3-terrain-editor/src/com/jme3/gde/terraineditor/tools/SlopeTerrainTool.java
+++ b/sdk/jme3-terrain-editor/src/com/jme3/gde/terraineditor/tools/SlopeTerrainTool.java
@@ -171,7 +171,7 @@
         float angle = ((FastMath.asin(temp.distance(higher) / lower.distance(higher))) * FastMath.RAD_TO_DEG);
 
         angleText.setText(angle + " degrees");
-        angleText.setLocalTranslation(new Vector3f().interpolate(point1, point2, 0.5f));
+        angleText.setLocalTranslation(new Vector3f().interpolateLocal(point1, point2, 0.5f));
 
         if (line.getParent() == null) {
             parent.attachChild(line);
