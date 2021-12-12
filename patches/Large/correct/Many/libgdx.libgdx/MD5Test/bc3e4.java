diff --git a/tests/gdx-tests/src/com/badlogic/gdx/tests/MD5Test.java b/tests/gdx-tests/src/com/badlogic/gdx/tests/MD5Test.java
index cec4db8..bb5f017 100644
--- a/tests/gdx-tests/src/com/badlogic/gdx/tests/MD5Test.java
+++ b/tests/gdx-tests/src/com/badlogic/gdx/tests/MD5Test.java
@@ -43,7 +43,7 @@
 	@Override
 	public void create () {
 		Gdx.app.log("MD5 Test", "created");
-		model = MD5Loader.loadModel(Gdx.files.internal("data/zfat.md5mesh").read(), false);
+		model = MD5Loader.loadModel(Gdx.files.internal("data/zfat.md5mesh").read(), true);
 		anim = MD5Loader.loadAnimation(Gdx.files.internal("data/walk1.md5anim").read());
 		skeleton = new MD5Joints();
 		skeleton.joints = new float[anim.frames[0].joints.length];
