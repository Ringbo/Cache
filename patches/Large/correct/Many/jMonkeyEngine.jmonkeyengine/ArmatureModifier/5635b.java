diff --git a/engine/src/blender/com/jme3/scene/plugins/blender/modifiers/ArmatureModifier.java b/engine/src/blender/com/jme3/scene/plugins/blender/modifiers/ArmatureModifier.java
index 722da11..7b5b1f6 100644
--- a/engine/src/blender/com/jme3/scene/plugins/blender/modifiers/ArmatureModifier.java
+++ b/engine/src/blender/com/jme3/scene/plugins/blender/modifiers/ArmatureModifier.java
@@ -338,8 +338,9 @@
 						}
 						bonesGroups[0] = Math.max(bonesGroups[0], weightIndex);
 					} else {
+						// 0.0 weight indicates, do not transform this vertex, but keep it in bind pose.
 						for (Integer index : vertexIndices) {
-							weightsFloatData.put(index * MAXIMUM_WEIGHTS_PER_VERTEX, 1.0f);
+							weightsFloatData.put(index * MAXIMUM_WEIGHTS_PER_VERTEX, 0.0f);
 							indicesData.put(index * MAXIMUM_WEIGHTS_PER_VERTEX, (byte) 0);
 						}
 					}
