diff --git a/gdx/src/com/badlogic/gdx/graphics/g3d/loader/ObjLoader.java b/gdx/src/com/badlogic/gdx/graphics/g3d/loader/ObjLoader.java
index a6f2e3f..3fed957 100644
--- a/gdx/src/com/badlogic/gdx/graphics/g3d/loader/ObjLoader.java
+++ b/gdx/src/com/badlogic/gdx/graphics/g3d/loader/ObjLoader.java
@@ -84,7 +84,7 @@
 	 * 
 	 * @param file the FileHandle */
 	public Model loadObj (FileHandle file) {
-		return loadObj(file, false);
+		return loadModel(file);
 	}
 
 	/** @deprecated Use {@link ObjLoader#loadModel(FileHandle, boolean)} instead.<p>
@@ -94,7 +94,7 @@
 	 * @param flipV whether to flip the v texture coordinate (Blender, Wings3D, et al) 
 	 * */
 	public Model loadObj (FileHandle file, boolean flipV) {
-		return new Model(loadModelData(file, flipV));
+		return loadModel(file, flipV);
 	}
 	
 	/** Directly load the model on the calling thread. The model with not be managed by an {@link AssetManager}. */
