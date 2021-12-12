diff --git a/gdx/src/com/badlogic/gdx/graphics/g2d/PolygonSpriteBatch.java b/gdx/src/com/badlogic/gdx/graphics/g2d/PolygonSpriteBatch.java
index 3d2a0f2..0584975 100644
--- a/gdx/src/com/badlogic/gdx/graphics/g2d/PolygonSpriteBatch.java
+++ b/gdx/src/com/badlogic/gdx/graphics/g2d/PolygonSpriteBatch.java
@@ -123,7 +123,7 @@
 	public PolygonSpriteBatch (int maxVertices, int maxTriangles, ShaderProgram defaultShader) {
 		// 32767 is max vertex index.
 		if (maxVertices > 32767)
-			throw new IllegalArgumentException("Can't have more than 32767 vertices per batch: " + maxTriangles);
+			throw new IllegalArgumentException("Can't have more than 32767 vertices per batch: " + maxVertices);
 
 		Mesh.VertexDataType vertexDataType = Mesh.VertexDataType.VertexArray;
 		if (Gdx.gl30 != null) {
