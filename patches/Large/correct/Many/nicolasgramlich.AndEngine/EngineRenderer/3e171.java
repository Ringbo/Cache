diff --git a/src/org/andengine/opengl/view/EngineRenderer.java b/src/org/andengine/opengl/view/EngineRenderer.java
index 6e39036..d84e1fd 100644
--- a/src/org/andengine/opengl/view/EngineRenderer.java
+++ b/src/org/andengine/opengl/view/EngineRenderer.java
@@ -69,7 +69,7 @@
 
 			this.mGLState.disableDepthTest();
 			this.mGLState.enableBlend();
-			this.mGLState.setBlendEnabled(renderOptions.isDithering());
+			this.mGLState.setDitherEnabled(renderOptions.isDithering());
 
 			/* Enabling culling doesn't really make sense, because triangles are never drawn 'backwards' on purpose. */
 //			this.mGLState.enableCulling();
