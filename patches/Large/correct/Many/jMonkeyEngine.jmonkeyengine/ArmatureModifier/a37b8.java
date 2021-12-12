diff --git a/engine/src/blender/com/jme3/scene/plugins/blender/modifiers/ArmatureModifier.java b/engine/src/blender/com/jme3/scene/plugins/blender/modifiers/ArmatureModifier.java
index 2ca784c..cc46cd3 100644
--- a/engine/src/blender/com/jme3/scene/plugins/blender/modifiers/ArmatureModifier.java
+++ b/engine/src/blender/com/jme3/scene/plugins/blender/modifiers/ArmatureModifier.java
@@ -333,7 +333,7 @@
 								} else if(weight > 0) {//if weight is zero the simply ignore it
 									warnAboutTooManyVertexWeights = true;
 									Entry<Float, Integer> lowestWeightAndIndex = weightToIndexMap.firstEntry();
-									if(lowestWeightAndIndex.getKey() < weight) {
+									if(lowestWeightAndIndex != null && lowestWeightAndIndex.getKey() < weight) {
 										weightsFloatData.put(lowestWeightAndIndex.getValue(), weight);
 										indicesData.put(lowestWeightAndIndex.getValue(), boneIndex.byteValue());
 										weightToIndexMap.remove(lowestWeightAndIndex.getKey());
