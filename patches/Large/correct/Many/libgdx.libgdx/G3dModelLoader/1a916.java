diff --git a/gdx/src/com/badlogic/gdx/graphics/g3d/loader/G3dModelLoader.java b/gdx/src/com/badlogic/gdx/graphics/g3d/loader/G3dModelLoader.java
index add3386..ab4ed7f 100644
--- a/gdx/src/com/badlogic/gdx/graphics/g3d/loader/G3dModelLoader.java
+++ b/gdx/src/com/badlogic/gdx/graphics/g3d/loader/G3dModelLoader.java
@@ -114,7 +114,7 @@
 				JsonValue indices = meshPart.require("indices");
 				short[] partIndices = new short[indices.size()];
 				int k = 0;
-				for (JsonValue value = indices.child(); value != null; value = value.next(), j++) {
+				for (JsonValue value = indices.child(); value != null; value = value.next(), k++) {
 					partIndices[k] = (short)indices.getInt(k);
 				}
 				jsonPart.indices = partIndices;
