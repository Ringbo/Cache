diff --git a/tests/gdx-tests/src/com/badlogic/gdx/tests/bullet/BasicBulletTest.java b/tests/gdx-tests/src/com/badlogic/gdx/tests/bullet/BasicBulletTest.java
index 4fa7af1..e60fa86 100644
--- a/tests/gdx-tests/src/com/badlogic/gdx/tests/bullet/BasicBulletTest.java
+++ b/tests/gdx-tests/src/com/badlogic/gdx/tests/bullet/BasicBulletTest.java
@@ -114,7 +114,7 @@
 			Usage.Position | Usage.Normal);
 		models.add(sphereModel);
 		// Load the bullet library
-		Bullet.init();
+		BaseBulletTest.init(); // Normally use: Bullet.init();
 		// Create the bullet world
 		collisionConfiguration = new btDefaultCollisionConfiguration();
 		dispatcher = new btCollisionDispatcher(collisionConfiguration);
