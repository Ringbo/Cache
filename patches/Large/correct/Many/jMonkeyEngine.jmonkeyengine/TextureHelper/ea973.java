diff --git a/engine/src/blender/com/jme3/scene/plugins/blender/textures/TextureHelper.java b/engine/src/blender/com/jme3/scene/plugins/blender/textures/TextureHelper.java
index 2a5473d..693e95e 100644
--- a/engine/src/blender/com/jme3/scene/plugins/blender/textures/TextureHelper.java
+++ b/engine/src/blender/com/jme3/scene/plugins/blender/textures/TextureHelper.java
@@ -504,7 +504,7 @@
 				LOGGER.log(Level.FINE, "Reading texture from file: {0}", texturePath);
 				result = this.loadImageFromFile(texturePath, blenderContext);
 			} else {
-				logger.fine("Packed texture. Reading directly from the blend file!");
+				LOGGER.fine("Packed texture. Reading directly from the blend file!");
 				Structure packedFile = pPackedFile.fetchData(blenderContext.getInputStream()).get(0);
 				Pointer pData = (Pointer) packedFile.getFieldValue("data");
 				FileBlockHeader dataFileBlock = blenderContext.getFileBlock(pData.getOldMemoryAddress());
