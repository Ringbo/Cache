diff --git a/gdx/src/com/badlogic/gdx/graphics/glutils/ShapeRenderer.java b/gdx/src/com/badlogic/gdx/graphics/glutils/ShapeRenderer.java
index fbcd7c0..e3d7fd5 100644
--- a/gdx/src/com/badlogic/gdx/graphics/glutils/ShapeRenderer.java
+++ b/gdx/src/com/badlogic/gdx/graphics/glutils/ShapeRenderer.java
@@ -461,16 +461,16 @@
 		float x1, y1, x2, y2, x3, y3, x4, y4;
 
 		x1 = x + c * (0 - originX) + -s * (0 - originY);
-		y1 = y + s * (0 - originY) + c * (0 - originY);
+		y1 = y + s * (0 - originX) + c * (0 - originY);
 
 		x2 = x + c * (width - originX) + -s * (0 - originY);
-		y2 = y + s * (width - originY) + c * (0 - originY);
+		y2 = y + s * (width - originX) + c * (0 - originY);
 
 		x3 = x + c * (width - originX) + -s * (height - originY);
-		y3 = y + s * (width - originY) + c * (height - originY);
+		y3 = y + s * (width - originX) + c * (height - originY);
 
 		x4 = x + c * (0 - originX) + -s * (height - originY);
-		y4 = y + s * (0 - originY) + c * (height - originY);
+		y4 = y + s * (0 - originX) + c * (height - originY);
 
 		if (currType == ShapeType.Line) {
 			renderer.color(col1.r, col1.g, col1.b, col1.a);
