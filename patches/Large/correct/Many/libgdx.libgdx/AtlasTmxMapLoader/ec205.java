diff --git a/gdx/src/com/badlogic/gdx/maps/tiled/AtlasTmxMapLoader.java b/gdx/src/com/badlogic/gdx/maps/tiled/AtlasTmxMapLoader.java
index 2c443c5..518bad6 100644
--- a/gdx/src/com/badlogic/gdx/maps/tiled/AtlasTmxMapLoader.java
+++ b/gdx/src/com/badlogic/gdx/maps/tiled/AtlasTmxMapLoader.java
@@ -337,7 +337,7 @@
 			String atlasFilePath = map.getProperties().get("atlas", String.class);
 			if (atlasFilePath == null) {
 				FileHandle atlasFile = tmxFile.sibling(tmxFile.nameWithoutExtension() + ".atlas");
-				if (atlasFile.exists()) atlasFilePath = atlasFile.path();
+				if (atlasFile.exists()) atlasFilePath = atlasFile.name();
 			}
 			if (atlasFilePath == null) {
 				throw new GdxRuntimeException("The map is missing the 'atlas' property");
