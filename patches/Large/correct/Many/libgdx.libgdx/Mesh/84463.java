diff --git a/gdx/src/com/badlogic/gdx/graphics/Mesh.java b/gdx/src/com/badlogic/gdx/graphics/Mesh.java
index ab6083d..74ecf30 100644
--- a/gdx/src/com/badlogic/gdx/graphics/Mesh.java
+++ b/gdx/src/com/badlogic/gdx/graphics/Mesh.java
@@ -176,7 +176,7 @@
 	public Mesh (VertexDataType type, boolean isStatic, int maxVertices, int maxIndices, VertexAttribute... attributes) {
 // if (type == VertexDataType.VertexArray && Gdx.graphics.isGL20Available()) type = VertexDataType.VertexBufferObject;
 
-		if (type == VertexDataType.VertexBufferObject) {
+		if (type == VertexDataType.VertexBufferObject || Mesh.forceVBO) {
 			vertices = new VertexBufferObject(isStatic, maxVertices, attributes);
 			indices = new IndexBufferObject(isStatic, maxIndices);
 			isVertexArray = false;
