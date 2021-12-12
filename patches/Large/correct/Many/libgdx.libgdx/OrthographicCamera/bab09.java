diff --git a/gdx/src/com/badlogic/gdx/graphics/OrthographicCamera.java b/gdx/src/com/badlogic/gdx/graphics/OrthographicCamera.java
index 8d38575..d4a7f25 100644
--- a/gdx/src/com/badlogic/gdx/graphics/OrthographicCamera.java
+++ b/gdx/src/com/badlogic/gdx/graphics/OrthographicCamera.java
@@ -57,6 +57,6 @@
 		Matrix4.mul(combined.val, view.val);
 		invProjectionView.set(combined);	
 		Matrix4.inv(invProjectionView.val);
-		frustum.update(combined);
+		frustum.update(invProjectionView);
 	}
 }
