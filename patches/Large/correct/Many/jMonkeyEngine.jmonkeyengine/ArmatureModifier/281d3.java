diff --git a/engine/src/blender/com/jme3/scene/plugins/blender/modifiers/ArmatureModifier.java b/engine/src/blender/com/jme3/scene/plugins/blender/modifiers/ArmatureModifier.java
index 7b5b1f6..573f13d 100644
--- a/engine/src/blender/com/jme3/scene/plugins/blender/modifiers/ArmatureModifier.java
+++ b/engine/src/blender/com/jme3/scene/plugins/blender/modifiers/ArmatureModifier.java
@@ -187,7 +187,7 @@
 		if (invalid) {
 			LOGGER.log(Level.WARNING, "Armature modifier is invalid! Cannot be applied to: {0}", node.getName());
 		}// if invalid, animData will be null
-		if (animData == null) {
+		if (animData == null || skeleton == null) {
 			return node;
 		}
 
