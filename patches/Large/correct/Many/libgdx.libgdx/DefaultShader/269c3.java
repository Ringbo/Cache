diff --git a/gdx/src/com/badlogic/gdx/graphics/g3d/shaders/DefaultShader.java b/gdx/src/com/badlogic/gdx/graphics/g3d/shaders/DefaultShader.java
index 89ef0ac..5306b51 100644
--- a/gdx/src/com/badlogic/gdx/graphics/g3d/shaders/DefaultShader.java
+++ b/gdx/src/com/badlogic/gdx/graphics/g3d/shaders/DefaultShader.java
@@ -292,7 +292,7 @@
 		if (currentLocalTransform != renderable.localTransform)
 			set(u_localTrans, (currentLocalTransform = renderable.localTransform) == null ? idtMatrix : renderable.localTransform);
 		if (currentModelTransform != renderable.modelTransform)
-			set(u_modelTrans, (currentWorldTransform = renderable.modelTransform) == null ? idtMatrix : renderable.modelTransform);
+			set(u_modelTrans, (currentModelTransform = renderable.modelTransform) == null ? idtMatrix : renderable.modelTransform);
 		if (currentLocalTransform == null && currentModelTransform == null)
 			setWorldTransform(idtMatrix, false);
 		else if (currentLocalTransform == null)
