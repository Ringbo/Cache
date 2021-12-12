diff --git a/jme3-blender/src/main/java/com/jme3/scene/plugins/blender/meshes/TemporalMesh.java b/jme3-blender/src/main/java/com/jme3/scene/plugins/blender/meshes/TemporalMesh.java
index bbf4fd9..9745953 100644
--- a/jme3-blender/src/main/java/com/jme3/scene/plugins/blender/meshes/TemporalMesh.java
+++ b/jme3-blender/src/main/java/com/jme3/scene/plugins/blender/meshes/TemporalMesh.java
@@ -406,7 +406,7 @@
                     tempNormals[i] = normals.get(vertIndex);
                     tempVertColors[i] = vertexColors != null ? vertexColors.get(face.getIndexes().indexOf(vertIndex)) : null;
 
-                    if (boneIndexes.size() > 0) {
+                    if (boneIndexes.size() > 0 && vertexGroups.size() > 0) {
                         Map<Float, Integer> boneBuffersForVertex = new HashMap<Float, Integer>();
                         Map<String, Float> vertexGroupsForVertex = vertexGroups.get(vertIndex);
                         for (Entry<String, Integer> entry : boneIndexes.entrySet()) {
