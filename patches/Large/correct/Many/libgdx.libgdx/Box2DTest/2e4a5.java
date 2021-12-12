diff --git a/tests/gdx-tests/src/com/badlogic/gdx/tests/Box2DTest.java b/tests/gdx-tests/src/com/badlogic/gdx/tests/Box2DTest.java
index 41c0338..d8ee8d1 100644
--- a/tests/gdx-tests/src/com/badlogic/gdx/tests/Box2DTest.java
+++ b/tests/gdx-tests/src/com/badlogic/gdx/tests/Box2DTest.java
@@ -208,7 +208,7 @@
 				// get the world manifold from which we get the
 				// contact points. A manifold can have 0, 1 or 2
 				// contact points.
-				WorldManifold manifold = contact.GetWorldManifold();
+				WorldManifold manifold = contact.getWorldManifold();
 				int numContactPoints = manifold.getNumberOfContactPoints();
 				for (int j = 0; j < numContactPoints; j++) {
 					Vector2 point = manifold.getPoints()[j];
