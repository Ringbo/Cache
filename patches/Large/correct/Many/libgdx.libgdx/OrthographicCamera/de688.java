diff --git a/gdx/src/com/badlogic/gdx/graphics/OrthographicCamera.java b/gdx/src/com/badlogic/gdx/graphics/OrthographicCamera.java
index 9e8c4b9..484abd4 100644
--- a/gdx/src/com/badlogic/gdx/graphics/OrthographicCamera.java
+++ b/gdx/src/com/badlogic/gdx/graphics/OrthographicCamera.java
@@ -84,7 +84,7 @@
 			direction.set(0, 0, 1);
 		} else {
 			up.set(0, 1, 0);
-			direction.set(0, 0, 1);
+			direction.set(0, 0, -1);
 		}
 		position.set(zoom * viewportWidth / 2.0f, zoom * viewportHeight / 2.0f, 0);
 		this.viewportWidth = viewportWidth;
