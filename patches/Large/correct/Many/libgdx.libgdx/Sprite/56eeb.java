diff --git a/gdx/src/com/badlogic/gdx/graphics/Sprite.java b/gdx/src/com/badlogic/gdx/graphics/Sprite.java
index 6938ab8..ef4409f 100644
--- a/gdx/src/com/badlogic/gdx/graphics/Sprite.java
+++ b/gdx/src/com/badlogic/gdx/graphics/Sprite.java
@@ -181,7 +181,7 @@
 	 */
 	public void scrollTexture (float xAmount, float yAmount) {
 		float[] vertices = this.vertices;
-		if (xAmount > 0) {
+		if (xAmount != 0) {
 			float u = (vertices[U1] + xAmount) % 1;
 			float u2 = u + width / texture.getWidth();
 			vertices[U1] = u;
@@ -189,7 +189,7 @@
 			vertices[U3] = u2;
 			vertices[U4] = u2;
 		}
-		if (yAmount > 0) {
+		if (yAmount != 0) {
 			float v = (vertices[V1] + yAmount) % 1;
 			float v2 = v + height / texture.getHeight();
 			vertices[V1] = v;
