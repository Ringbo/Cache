diff --git a/engine/src/terrain/com/jme3/terrain/geomipmap/grid/FractalTileLoader.java b/engine/src/terrain/com/jme3/terrain/geomipmap/grid/FractalTileLoader.java
index 08ff503..8b5c85a 100644
--- a/engine/src/terrain/com/jme3/terrain/geomipmap/grid/FractalTileLoader.java
+++ b/engine/src/terrain/com/jme3/terrain/geomipmap/grid/FractalTileLoader.java
@@ -63,9 +63,9 @@
 				heightmap.setHeightScale(heightScale);
 			} catch (IOException e) {}
 		} else {
-			FloatBuffer buffer = this.base.getBuffer(location.x * (this.patchSize - 1), location.z * (this.patchSize - 1), 0, this.patchSize);
+			FloatBuffer buffer = this.base.getBuffer(location.x * (this.quadSize - 1), location.z * (this.quadSize - 1), 0, this.quadSize);
 			if (this.cacheDir != null) {
-				MapUtils.saveImage(MapUtils.toGrayscale16Image(buffer, this.patchSize), new File(this.cacheDir, "terrain_" + (int) location.x
+				MapUtils.saveImage(MapUtils.toGrayscale16Image(buffer, this.quadSize), new File(this.cacheDir, "terrain_" + (int) location.x
 						+ "_" + (int) location.z + ".png"));
 			}
 			float[] arr = buffer.array();
