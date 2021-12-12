diff --git a/engine/src/blender/com/jme3/scene/plugins/blender/helpers/v249/MaterialHelper.java b/engine/src/blender/com/jme3/scene/plugins/blender/helpers/v249/MaterialHelper.java
index 7423578..3363b49 100644
--- a/engine/src/blender/com/jme3/scene/plugins/blender/helpers/v249/MaterialHelper.java
+++ b/engine/src/blender/com/jme3/scene/plugins/blender/helpers/v249/MaterialHelper.java
@@ -274,7 +274,7 @@
 									}
 								}
 								if ((mapto & 0x02) != 0) {// Nor
-									Texture normalMapTexture = textureHelper.convertToNormalMapTexture(texture, ((Number)tex.getFieldValue("norfac")).floatValue());
+									Texture normalMapTexture = textureHelper.convertToNormalMapTexture(texture, ((Number)textureLink.getFieldValue("norfac")).floatValue());
 									result.setTexture(TEXTURE_TYPE_NORMAL, normalMapTexture);
 									if (vertexColor) {
 										result.setBoolean(shadeless ? "VertexColor" : "UseVertexColor", false);
