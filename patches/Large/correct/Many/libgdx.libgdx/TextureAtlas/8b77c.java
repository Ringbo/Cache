diff --git a/gdx/src/com/badlogic/gdx/graphics/g2d/TextureAtlas.java b/gdx/src/com/badlogic/gdx/graphics/g2d/TextureAtlas.java
index 4219475..9d1b1a1 100644
--- a/gdx/src/com/badlogic/gdx/graphics/g2d/TextureAtlas.java
+++ b/gdx/src/com/badlogic/gdx/graphics/g2d/TextureAtlas.java
@@ -89,7 +89,6 @@
 				else if (pageImage == null) {
 					FileHandle file = imagesDir.child(line);
 
-					// FIXME - Actually load in the requested format.
 					Format format = Format.valueOf(readValue(reader));
 
 					readTuple(reader);
@@ -108,7 +107,7 @@
 						repeatY = Repeat;
 					}
 
-					pageImage = new Texture(file, TextureFilter.isMipMap(min) || TextureFilter.isMipMap(max) ? true : false);
+					pageImage = new Texture(file, format, TextureFilter.isMipMap(min) || TextureFilter.isMipMap(max) ? true : false);
 					pageImage.setFilter(min, max);
 					pageImage.setWrap(repeatX, repeatY);
 					textures.add(pageImage);
