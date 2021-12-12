diff --git a/gdx/src/com/badlogic/gdx/graphics/g3d/loader/JsonModelLoader.java b/gdx/src/com/badlogic/gdx/graphics/g3d/loader/JsonModelLoader.java
index 9b4dc18..3a78fb2 100644
--- a/gdx/src/com/badlogic/gdx/graphics/g3d/loader/JsonModelLoader.java
+++ b/gdx/src/com/badlogic/gdx/graphics/g3d/loader/JsonModelLoader.java
@@ -170,7 +170,7 @@
 			} else if(attr.equals("BLENDWEIGHTS")) {
 				vertexAttributes.add(VertexAttribute.BoneWeights(4));
 			} else if(attr.equals("COLOR")) {
-				vertexAttributes.add(VertexAttribute.Color());
+				vertexAttributes.add(VertexAttribute.ColorUnpacked());
 			} else {
 				throw new GdxRuntimeException("Unknown vertex attribuet '" + attr + "', should be one of position, normal, uv, tangent or binormal");
 			}
