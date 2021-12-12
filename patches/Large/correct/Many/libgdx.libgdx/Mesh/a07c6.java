diff --git a/gdx/src/com/badlogic/gdx/graphics/Mesh.java b/gdx/src/com/badlogic/gdx/graphics/Mesh.java
index dff092b..f49d299 100644
--- a/gdx/src/com/badlogic/gdx/graphics/Mesh.java
+++ b/gdx/src/com/badlogic/gdx/graphics/Mesh.java
@@ -281,7 +281,7 @@
 			if (transformations != null)
 				transform(transformations[i], vertices, vertexSize, offset, numComponents, voffset / vertexSize, vsize / vertexSize);
 			mesh.getIndices(indices, ioffset);
-			for (int j = 0; j < isize; i++)
+			for (int j = 0; j < isize; j++)
 				indices[ioffset+j] = (short)(indices[ioffset+j] + voffset);
 			voffset += vsize;
 			ioffset += isize;
