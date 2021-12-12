diff --git a/gdx/src/com/badlogic/gdx/graphics/OrthographicCamera.java b/gdx/src/com/badlogic/gdx/graphics/OrthographicCamera.java
index 851e480..a8abbec 100644
--- a/gdx/src/com/badlogic/gdx/graphics/OrthographicCamera.java
+++ b/gdx/src/com/badlogic/gdx/graphics/OrthographicCamera.java
@@ -100,7 +100,7 @@
 		Matrix4 transform = new Matrix4();
 		Vector3 dir = new Vector3(-1, 0, 1).nor();
 		float rotAngle = (float)Math.toDegrees(Math.asin(Math.tan(Math.toRadians(angle))));
-		transform.setToRotation(new Vector3(1, 0, 1).nor(), angle);
+		transform.setToRotation(new Vector3(1, 0, 1).nor(), rotAngle);
 		dir.mul(transform).nor();
 		return dir;
 	}
