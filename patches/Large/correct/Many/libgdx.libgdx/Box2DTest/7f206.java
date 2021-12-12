diff --git a/gdx-tests/src/com/badlogic/gdx/tests/Box2DTest.java b/gdx-tests/src/com/badlogic/gdx/tests/Box2DTest.java
index dda57d8..7aa0716 100644
--- a/gdx-tests/src/com/badlogic/gdx/tests/Box2DTest.java
+++ b/gdx-tests/src/com/badlogic/gdx/tests/Box2DTest.java
@@ -54,7 +54,7 @@
 		cam.setMatrices(app.getGraphics());	
 				
 		long s = System.nanoTime();
-		world.step( app.getGraphics().getDeltaTime(), 8, 3 );
+		world.step( app.getGraphics().getDeltaTime(), 1, 1 );
 		float updateTime = (System.nanoTime()-s)/1000000000.0f;
 		
 		for( int i = 0; i < boxes.size(); i++ )				
@@ -122,7 +122,7 @@
 		ground.createFixture( groundBox, 1 );
 		groundBox.dispose();
 		
-		for( int i = 0; i < 20; i++ )
+		for( int i = 0; i < 100; i++ )
 		{			
 			boxes.add(createBox( ));
 		}			
