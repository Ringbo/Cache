diff --git a/demos/metagun/metagun-desktop/src/com/mojang/metagun/screen/Screen.java b/demos/metagun/metagun-desktop/src/com/mojang/metagun/screen/Screen.java
index 3c4173c..54385f7 100644
--- a/demos/metagun/metagun-desktop/src/com/mojang/metagun/screen/Screen.java
+++ b/demos/metagun/metagun-desktop/src/com/mojang/metagun/screen/Screen.java
@@ -36,7 +36,7 @@
 	public void draw (TextureRegion region, int x, int y) {
 		int width = region.getRegionWidth();
 		if (width < 0) width = -width;
-		spriteBatch.draw(region, x, y, width, -region.getRegionHeight());
+		spriteBatch.draw(region, x, y, width, region.getRegionHeight());
 	}
 
 	public void drawString (String string, int x, int y) {
