diff --git a/gdx/src/com/badlogic/gdx/graphics/g2d/BitmapFontCache.java b/gdx/src/com/badlogic/gdx/graphics/g2d/BitmapFontCache.java
index 598caff..c808235 100644
--- a/gdx/src/com/badlogic/gdx/graphics/g2d/BitmapFontCache.java
+++ b/gdx/src/com/badlogic/gdx/graphics/g2d/BitmapFontCache.java
@@ -200,7 +200,7 @@
 	public void draw (Batch spriteBatch) {
 		TextureRegion[] regions = font.getRegions();
 		for (int j = 0, n = vertexData.length; j < n; j++) {
-			if (idx[j] >= 0) { // ignore if this texture has no glyphs
+			if (idx[j] > 0) { // ignore if this texture has no glyphs
 				float[] vertices = vertexData[j];
 				spriteBatch.draw(regions[j].getTexture(), vertices, 0, idx[j]);
 			}
