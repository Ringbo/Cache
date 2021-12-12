diff --git a/tests/gdx-tests/src/com/badlogic/gdx/tests/MD5Test.java b/tests/gdx-tests/src/com/badlogic/gdx/tests/MD5Test.java
index f79afbb..fe6039c 100644
--- a/tests/gdx-tests/src/com/badlogic/gdx/tests/MD5Test.java
+++ b/tests/gdx-tests/src/com/badlogic/gdx/tests/MD5Test.java
@@ -39,12 +39,12 @@
 
 	@Override public void create () {
 		Gdx.app.log("MD5 Test", "created");
-		model = MD5Loader.loadModel(Gdx.files.internal("data/zfat.md5mesh").read());
+		model = MD5Loader.loadModel(Gdx.files.internal("data/zfat.md5mesh").read(), false);
 		anim = MD5Loader.loadAnimation(Gdx.files.internal("data/walk1.md5anim").read());
 		skeleton = new MD5Joints();
 		skeleton.joints = new float[anim.frames[0].joints.length];
 		animInfo = new MD5AnimationInfo(anim.frames.length, anim.secondsPerFrame);
-		renderer = new MD5Renderer(model, true);
+		renderer = new MD5Renderer(model, false, true);
 		renderer.setSkeleton(model.baseSkeleton);
 
 		// long start = System.nanoTime();
