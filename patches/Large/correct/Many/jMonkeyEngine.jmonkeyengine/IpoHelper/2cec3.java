diff --git a/engine/src/blender/com/jme3/scene/plugins/blender/animations/IpoHelper.java b/engine/src/blender/com/jme3/scene/plugins/blender/animations/IpoHelper.java
index ea0a207..19867bd 100644
--- a/engine/src/blender/com/jme3/scene/plugins/blender/animations/IpoHelper.java
+++ b/engine/src/blender/com/jme3/scene/plugins/blender/animations/IpoHelper.java
@@ -130,7 +130,7 @@
 		if (rnaPath.endsWith("scale")) {
 			return Ipo.AC_SIZE_X + arrayIndex;
 		}
-		if (rnaPath.endsWith("rotation")) {
+		if (rnaPath.endsWith("rotation") || rnaPath.endsWith("rotation_euler")) {
 			return Ipo.OB_ROT_X + arrayIndex;
 		}
 		throw new IllegalStateException("Unknown curve rna path: " + rnaPath);
