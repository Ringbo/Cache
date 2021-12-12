diff --git a/gdx/src/com/badlogic/gdx/graphics/Pixmap.java b/gdx/src/com/badlogic/gdx/graphics/Pixmap.java
index 738541d..f25cc79 100644
--- a/gdx/src/com/badlogic/gdx/graphics/Pixmap.java
+++ b/gdx/src/com/badlogic/gdx/graphics/Pixmap.java
@@ -257,7 +257,7 @@
 	 * @param radius The radius in pixels
 	 */
 	public void fillCircle (int x, int y, int radius) {
-		pixmap.drawCircle(x, y, radius, color);
+		pixmap.fillCircle(x, y, radius, color);
 	}
 
 	/**
