diff --git a/engine/src/blender/com/jme3/scene/plugins/blender/helpers/v249/ObjectHelper.java b/engine/src/blender/com/jme3/scene/plugins/blender/helpers/v249/ObjectHelper.java
index 3c3ca85..3c73b4d 100644
--- a/engine/src/blender/com/jme3/scene/plugins/blender/helpers/v249/ObjectHelper.java
+++ b/engine/src/blender/com/jme3/scene/plugins/blender/helpers/v249/ObjectHelper.java
@@ -302,10 +302,10 @@
 		Vector3f scale = new Vector3f(size.get(0).floatValue() * scaleX, 
 									  size.get(1).floatValue() * scaleY, 
 									  size.get(2).floatValue() * scaleZ);
-		if(fixUpAxis) {
+		if(parent.isNull() && fixUpAxis) {
 			float y = translation.y;
 			translation.y = translation.z;
-			translation.z = y;
+			translation.z = -y;
 			rotation.multLocal(this.upAxisRotationQuaternion);
 		}
 		Transform t = new Transform(translation, rotation);
