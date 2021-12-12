diff --git a/src/org/andengine/opengl/texture/TextureWarmUpVertexBufferObject.java b/src/org/andengine/opengl/texture/TextureWarmUpVertexBufferObject.java
index 1adbcaa..e8d035d 100644
--- a/src/org/andengine/opengl/texture/TextureWarmUpVertexBufferObject.java
+++ b/src/org/andengine/opengl/texture/TextureWarmUpVertexBufferObject.java
@@ -99,7 +99,7 @@
 		pGLState.pushModelViewGLMatrix();
 		{
 			/* Far far away and really small. */
-			pGLState.resetModelViewGLMatrixStack();
+			pGLState.loadModelViewGLMatrixIdentity();
 			pGLState.translateModelViewGLMatrixf(1000000, 1000000, 0);
 			pGLState.scaleModelViewGLMatrixf(0.0001f, 0.0001f, 0);
 	
