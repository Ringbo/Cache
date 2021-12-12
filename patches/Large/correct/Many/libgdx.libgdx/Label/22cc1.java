diff --git a/gdx/src/com/badlogic/gdx/scenes/scene2d/ui/Label.java b/gdx/src/com/badlogic/gdx/scenes/scene2d/ui/Label.java
index eda0d0e..7071518 100644
--- a/gdx/src/com/badlogic/gdx/scenes/scene2d/ui/Label.java
+++ b/gdx/src/com/badlogic/gdx/scenes/scene2d/ui/Label.java
@@ -207,7 +207,7 @@
 			batch.setColor(color.r, color.g, color.b, color.a * parentAlpha);
 			style.background.draw(batch, getX(), getY(), getWidth(), getHeight());
 		}
-		cache.setColor(style.fontColor == null ? color : Color.tmp.set(color).mul(style.fontColor));
+		cache.setColors(style.fontColor == null ? color : Color.tmp.set(color).mul(style.fontColor));
 		cache.setPosition(getX(), getY());
 		cache.draw(batch, parentAlpha);
 	}
