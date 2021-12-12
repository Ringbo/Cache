diff --git a/tests/gdx-tests-android/src/com/badlogic/gdx/tests/android/MatrixTest.java b/tests/gdx-tests-android/src/com/badlogic/gdx/tests/android/MatrixTest.java
index 141cf15..f922ffb 100644
--- a/tests/gdx-tests-android/src/com/badlogic/gdx/tests/android/MatrixTest.java
+++ b/tests/gdx-tests-android/src/com/badlogic/gdx/tests/android/MatrixTest.java
@@ -75,7 +75,7 @@
 	public void render () {
 		Gdx.gl.glClear(GL10.GL_COLOR_BUFFER_BIT);
 		batch.begin();
-		font.drawMultiLine(batch, results, 20, 300);
+		font.draw(batch, results, 20, 300);
 		batch.end();
 	}
 }
