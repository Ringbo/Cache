diff --git a/gdx/src/com/badlogic/gdx/graphics/g3d/utils/MeshBuilder.java b/gdx/src/com/badlogic/gdx/graphics/g3d/utils/MeshBuilder.java
index 122ac16..d5f334e 100644
--- a/gdx/src/com/badlogic/gdx/graphics/g3d/utils/MeshBuilder.java
+++ b/gdx/src/com/badlogic/gdx/graphics/g3d/utils/MeshBuilder.java
@@ -612,7 +612,7 @@
 			rect(i000, i100, i110, i010);
 			rect(i101, i001, i011, i111);
 			index(i000, i001, i010, i011, i110, i111, i100, i101);
-		} else if (primitiveType != GL10.GL_POINTS) {
+		} else if (primitiveType == GL10.GL_POINTS) {
 			ensureRectangleIndices(2);
 			rect(i000, i100, i110, i010);
 			rect(i101, i001, i011, i111);
