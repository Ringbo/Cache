diff --git a/gdx/src/com/badlogic/gdx/scenes/scene2d/utils/TiledDrawable.java b/gdx/src/com/badlogic/gdx/scenes/scene2d/utils/TiledDrawable.java
index a729c62..1b4d2ea 100644
--- a/gdx/src/com/badlogic/gdx/scenes/scene2d/utils/TiledDrawable.java
+++ b/gdx/src/com/badlogic/gdx/scenes/scene2d/utils/TiledDrawable.java
@@ -22,7 +22,7 @@
 
 	public void draw (SpriteBatch batch, float x, float y, float width, float height) {
 		TextureRegion region = getRegion();
-		float regionWidth = region.getRegionWidth(), regionHeight = region.getRegionWidth();
+		float regionWidth = region.getRegionWidth(), regionHeight = region.getRegionHeight();
 		float remainingX = width % regionWidth, remainingY = height % regionHeight;
 		float startX = x, startY = y;
 		float endX = x + width - remainingX, endY = y + height - remainingY;
