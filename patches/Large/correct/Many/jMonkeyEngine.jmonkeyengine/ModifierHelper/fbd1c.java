diff --git a/engine/src/blender/com/jme3/scene/plugins/blender/helpers/v249/ModifierHelper.java b/engine/src/blender/com/jme3/scene/plugins/blender/helpers/v249/ModifierHelper.java
index ca07e34..e05e22d 100644
--- a/engine/src/blender/com/jme3/scene/plugins/blender/helpers/v249/ModifierHelper.java
+++ b/engine/src/blender/com/jme3/scene/plugins/blender/helpers/v249/ModifierHelper.java
@@ -699,7 +699,7 @@
 
                             //modifying clone indexes
                             int vertexIndex = (i - mirrorIndex) / 3;
-                            if (vertexIndex % 3 == 0) {
+                            if (vertexIndex % 3 == 0 && vertexIndex<cloneIndexes.limit()) {
                                 int index = cloneIndexes.get(vertexIndex + 2);
                                 cloneIndexes.put(vertexIndex + 2, cloneIndexes.get(vertexIndex + 1));
                                 cloneIndexes.put(vertexIndex + 1, index);
