diff --git a/gdx/src/com/badlogic/gdx/graphics/g2d/GlyphLayout.java b/gdx/src/com/badlogic/gdx/graphics/g2d/GlyphLayout.java
index 5a16900..eb7eae4 100644
--- a/gdx/src/com/badlogic/gdx/graphics/g2d/GlyphLayout.java
+++ b/gdx/src/com/badlogic/gdx/graphics/g2d/GlyphLayout.java
@@ -327,7 +327,7 @@
 					if (i < start + 2 || i > start + 9) break; // Illegal number of hex digits.
 					Color color = colorPool.obtain();
 					colorStack.add(color);
-					Color.rgb888ToColor(color, colorInt);
+					Color.rgba8888ToColor(color, colorInt);
 					if (i <= start + 7) color.a = 1f; // RRGGBB
 					return i - start;
 				}
