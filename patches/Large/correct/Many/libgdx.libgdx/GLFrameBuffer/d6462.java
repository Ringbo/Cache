diff --git a/gdx/src/com/badlogic/gdx/graphics/glutils/GLFrameBuffer.java b/gdx/src/com/badlogic/gdx/graphics/glutils/GLFrameBuffer.java
index 4029b8e..95b34e9 100644
--- a/gdx/src/com/badlogic/gdx/graphics/glutils/GLFrameBuffer.java
+++ b/gdx/src/com/badlogic/gdx/graphics/glutils/GLFrameBuffer.java
@@ -238,7 +238,7 @@
 		disposeColorTexture(colorTexture);
 
 		if (hasDepthStencilPackedBuffer) {
-			gl.glDeleteBuffer(depthStencilPackedBufferHandle);
+			gl.glDeleteRenderbuffer(depthStencilPackedBufferHandle);
 		} else {
 			if (hasDepth) gl.glDeleteRenderbuffer(depthbufferHandle);
 			if (hasStencil) gl.glDeleteRenderbuffer(stencilbufferHandle);
