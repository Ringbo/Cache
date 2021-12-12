diff --git a/gdx/src/com/badlogic/gdx/scenes/scene2d/actors/Button.java b/gdx/src/com/badlogic/gdx/scenes/scene2d/actors/Button.java
index 7c4edab..f92e898 100644
--- a/gdx/src/com/badlogic/gdx/scenes/scene2d/actors/Button.java
+++ b/gdx/src/com/badlogic/gdx/scenes/scene2d/actors/Button.java
@@ -83,7 +83,7 @@
 		TextureRegion region = pressed ? pressedRegion : unpressedRegion;
 		batch.setColor(color.r, color.g, color.b, color.a * parentAlpha);
 		if (region.getTexture() != null) {
-			if (scaleX == 0 && scaleY == 0 && rotation == 0)
+			if (scaleX == 1 && scaleY == 1 && rotation == 0)
 				batch.draw(region, x, y, width, height);
 			else
 				batch.draw(region, x, y, originX, originY, width, height, scaleX, scaleY, rotation);
