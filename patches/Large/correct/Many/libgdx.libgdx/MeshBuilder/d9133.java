diff --git a/gdx/src/com/badlogic/gdx/graphics/g3d/utils/MeshBuilder.java b/gdx/src/com/badlogic/gdx/graphics/g3d/utils/MeshBuilder.java
index 337971e..5b898e8 100644
--- a/gdx/src/com/badlogic/gdx/graphics/g3d/utils/MeshBuilder.java
+++ b/gdx/src/com/badlogic/gdx/graphics/g3d/utils/MeshBuilder.java
@@ -72,7 +72,7 @@
 	/** The size (in number of floats) of each vertex */
 	private int stride;
 	/** The current vertex index, used for indexing */
-	private short vindex;
+	private int vindex;
 	/** The offset in the indices array when begin() was called, used to define a meshpart. */
 	private int istart;
 	/** The offset within an vertex to position */
@@ -536,7 +536,7 @@
 
 	@Override
 	public short vertex (Vector3 pos, Vector3 nor, Color col, Vector2 uv) {
-		if (vindex >= Short.MAX_VALUE) throw new GdxRuntimeException("Too many vertices used");
+		if (vindex > Short.MAX_VALUE) throw new GdxRuntimeException("Too many vertices used");
 
 		vertex[posOffset] = pos.x;
 		if (posSize > 1) vertex[posOffset + 1] = pos.y;
