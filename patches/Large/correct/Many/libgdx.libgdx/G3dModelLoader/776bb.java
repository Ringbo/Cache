diff --git a/gdx/src/com/badlogic/gdx/graphics/g3d/loader/G3dModelLoader.java b/gdx/src/com/badlogic/gdx/graphics/g3d/loader/G3dModelLoader.java
index ad80991..9fc0bb4 100644
--- a/gdx/src/com/badlogic/gdx/graphics/g3d/loader/G3dModelLoader.java
+++ b/gdx/src/com/badlogic/gdx/graphics/g3d/loader/G3dModelLoader.java
@@ -98,7 +98,7 @@
 				for (JsonValue meshPart = meshParts.child; meshPart != null; meshPart = meshPart.next) {
 					ModelMeshPart jsonPart = new ModelMeshPart();
 					String partId = meshPart.getString("id", null);
-					if (id == null) {
+					if (partId == null) {
 						throw new GdxRuntimeException("Not id given for mesh part");
 					}
 					for (ModelMeshPart other : parts) {
