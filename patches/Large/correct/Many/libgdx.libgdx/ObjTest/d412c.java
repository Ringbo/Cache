diff --git a/tests/gdx-tests/src/com/badlogic/gdx/tests/ObjTest.java b/tests/gdx-tests/src/com/badlogic/gdx/tests/ObjTest.java
index e138460..d5bc590 100644
--- a/tests/gdx-tests/src/com/badlogic/gdx/tests/ObjTest.java
+++ b/tests/gdx-tests/src/com/badlogic/gdx/tests/ObjTest.java
@@ -47,7 +47,7 @@
 		model =  objLoader.loadModel(Gdx.files.internal("data/cube.obj"));
 		
 		BoundingBox bbox = new BoundingBox();
-		model.getBoundingBox(bbox);
+		model.calculateBoundingBox(bbox);
 		
 		Gdx.app.log("ObjTest", "obj bounds: " + bbox);
 		texture = new Texture(Gdx.files.internal("data/badlogic.jpg"), true);
