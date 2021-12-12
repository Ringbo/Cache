diff --git a/gdx/src/com/badlogic/gdx/graphics/glutils/ShapeRenderer.java b/gdx/src/com/badlogic/gdx/graphics/glutils/ShapeRenderer.java
index 9b94e49..af7381c 100644
--- a/gdx/src/com/badlogic/gdx/graphics/glutils/ShapeRenderer.java
+++ b/gdx/src/com/badlogic/gdx/graphics/glutils/ShapeRenderer.java
@@ -513,7 +513,7 @@
 
 	/** Calls {@link #filledCircle(float, float, float, int)} by estimating the number of segments needed for a smooth circle. */
 	public void filledCircle (float x, float y, float radius) {
-		filledCircle(x, y, radius, (int)(4 * (float)Math.sqrt(radius)));
+		filledCircle(x, y, radius, (int)(6 * (float)Math.cbrt(radius)));
 	}
 
 	public void filledCircle (float x, float y, float radius, int segments) {
