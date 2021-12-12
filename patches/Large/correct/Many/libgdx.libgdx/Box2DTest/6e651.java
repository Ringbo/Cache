diff --git a/gdx-tests/src/com/badlogic/gdx/tests/Box2DTest.java b/gdx-tests/src/com/badlogic/gdx/tests/Box2DTest.java
index eb0c80c..00f1d48 100644
--- a/gdx-tests/src/com/badlogic/gdx/tests/Box2DTest.java
+++ b/gdx-tests/src/com/badlogic/gdx/tests/Box2DTest.java
@@ -175,7 +175,7 @@
 		// matrices
 		GL10 gl = app.getGraphics().getGL10();
 		gl.glClear( GL10.GL_COLOR_BUFFER_BIT );
-		camera.setMatrices( app.getGraphics() );
+		camera.setMatrices( );
 		
 		// next we render the ground body
 		renderBox( gl, groundBody, 50, 1 );
