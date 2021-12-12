diff --git a/gdx/src/com/badlogic/gdx/graphics/g3d/loader/G3dModelLoader.java b/gdx/src/com/badlogic/gdx/graphics/g3d/loader/G3dModelLoader.java
index 42362ce..ad80991 100644
--- a/gdx/src/com/badlogic/gdx/graphics/g3d/loader/G3dModelLoader.java
+++ b/gdx/src/com/badlogic/gdx/graphics/g3d/loader/G3dModelLoader.java
@@ -154,7 +154,7 @@
 			} else if (attr.equals("COLOR")) {
 				vertexAttributes.add(VertexAttribute.ColorUnpacked());
 			} else if (attr.equals("COLORPACKED")) {
-				vertexAttributes.add(VertexAttribute.Color());
+				vertexAttributes.add(VertexAttribute.ColorPacked());
 			} else if (attr.equals("TANGENT")) {
 				vertexAttributes.add(VertexAttribute.Tangent());
 			} else if (attr.equals("BINORMAL")) {
