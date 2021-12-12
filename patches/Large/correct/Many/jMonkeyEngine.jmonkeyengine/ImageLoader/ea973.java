diff --git a/engine/src/blender/com/jme3/scene/plugins/blender/textures/ImageLoader.java b/engine/src/blender/com/jme3/scene/plugins/blender/textures/ImageLoader.java
index 4742fe2..8be0a95 100644
--- a/engine/src/blender/com/jme3/scene/plugins/blender/textures/ImageLoader.java
+++ b/engine/src/blender/com/jme3/scene/plugins/blender/textures/ImageLoader.java
@@ -101,21 +101,21 @@
 				try {
 					result = this.load(inputStream, flipY);
 				} catch (Exception e) {
-					logger.warning("Unable to load image using AWT loader!");
+					LOGGER.warning("Unable to load image using AWT loader!");
 				}
 				break;
 			case DDS:
 				try {
 					result = ddsLoader.load(inputStream);
 				} catch (Exception e) {
-					logger.warning("Unable to load image using DDS loader!");
+					LOGGER.warning("Unable to load image using DDS loader!");
 				}
 				break;
 			case TGA:
 				try {
 					result = TGALoader.load(inputStream, flipY);
 				} catch (Exception e) {
-					logger.warning("Unable to load image using TGA loader!");
+					LOGGER.warning("Unable to load image using TGA loader!");
 				}
 				break;
 			default:
