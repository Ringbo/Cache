diff --git a/engine/src/blender/com/jme3/scene/plugins/blender/meshes/MeshBuilder.java b/engine/src/blender/com/jme3/scene/plugins/blender/meshes/MeshBuilder.java
index b016790..487007f 100644
--- a/engine/src/blender/com/jme3/scene/plugins/blender/meshes/MeshBuilder.java
+++ b/engine/src/blender/com/jme3/scene/plugins/blender/meshes/MeshBuilder.java
@@ -143,7 +143,7 @@
             globalVertexReferenceMap.put(materialNumber, vertexReferenceMap);
         }
 
-        faceIndex *= 4;
+        faceIndex *= 3;
         if (quad) {
             vertexColorIndex[1] = 2;
             vertexColorIndex[2] = 3;
