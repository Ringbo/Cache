diff --git a/gdx/src/com/badlogic/gdx/graphics/g2d/BitmapFontCache.java b/gdx/src/com/badlogic/gdx/graphics/g2d/BitmapFontCache.java
index dae7722..5239153 100644
--- a/gdx/src/com/badlogic/gdx/graphics/g2d/BitmapFontCache.java
+++ b/gdx/src/com/badlogic/gdx/graphics/g2d/BitmapFontCache.java
@@ -254,10 +254,10 @@
 		Color color = getColor();
 		float oldAlpha = color.a;
 		color.a *= alphaModulation;
-		setColor(color);
+		setColors(color);
 		draw(spriteBatch);
 		color.a = oldAlpha;
-		setColor(color);
+		setColors(color);
 	}
 
 	/** Removes all glyphs in the cache. */
