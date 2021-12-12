diff --git a/gdx/src/com/badlogic/gdx/scenes/scene2d/actors/Image.java b/gdx/src/com/badlogic/gdx/scenes/scene2d/actors/Image.java
index 183cc48..afd7fac 100644
--- a/gdx/src/com/badlogic/gdx/scenes/scene2d/actors/Image.java
+++ b/gdx/src/com/badlogic/gdx/scenes/scene2d/actors/Image.java
@@ -48,7 +48,7 @@
 	@Override protected void draw (SpriteBatch batch, float parentAlpha) {
 		if (region.getTexture() != null) {
 			batch.setColor(color.r, color.g, color.b, color.a * parentAlpha);
-			if (scaleX == 0 && scaleY == 0 && rotation == 0)
+			if (scaleX == 1 && scaleY == 1 && rotation == 0)
 				batch.draw(region, x, y, width, height);
 			else
 				batch.draw(region, x, y, originX, originY, width, height, scaleX, scaleY, rotation);
