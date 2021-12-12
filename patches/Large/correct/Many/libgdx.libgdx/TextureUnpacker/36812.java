diff --git a/extensions/gdx-tools/src/com/badlogic/gdx/tools/texturepacker/TextureUnpacker.java b/extensions/gdx-tools/src/com/badlogic/gdx/tools/texturepacker/TextureUnpacker.java
index 77670be..7aca554 100644
--- a/extensions/gdx-tools/src/com/badlogic/gdx/tools/texturepacker/TextureUnpacker.java
+++ b/extensions/gdx-tools/src/com/badlogic/gdx/tools/texturepacker/TextureUnpacker.java
@@ -135,7 +135,7 @@
 		// get the needed part of the page and rotate if needed
 		if (region.rotate) {
 			BufferedImage srcImage = page.getSubimage(region.left, region.top, region.height, region.width);
-			splitImage = new BufferedImage(region.height, region.width, page.getType());
+			splitImage = new BufferedImage(region.width, region.height, page.getType());
 
 			AffineTransform transform = new AffineTransform();
 			transform.rotate(Math.toRadians(90.0));
