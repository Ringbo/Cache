diff --git a/gdx/src/com/badlogic/gdx/scenes/scene2d/ui/Window.java b/gdx/src/com/badlogic/gdx/scenes/scene2d/ui/Window.java
index ee5e6f6..7169470 100644
--- a/gdx/src/com/badlogic/gdx/scenes/scene2d/ui/Window.java
+++ b/gdx/src/com/badlogic/gdx/scenes/scene2d/ui/Window.java
@@ -255,7 +255,7 @@
 			else
 				y -= (padTop - bounds.height) / 2;
 		}
-		titleCache.setColor(Color.tmp.set(getColor()).mul(style.titleFontColor));
+		titleCache.setColors(Color.tmp.set(getColor()).mul(style.titleFontColor));
 		titleCache.setPosition((int)x, (int)y);
 		titleCache.draw(batch, parentAlpha);
 	}
