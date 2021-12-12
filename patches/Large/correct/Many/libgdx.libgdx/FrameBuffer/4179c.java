diff --git a/gdx/src/com/badlogic/gdx/graphics/glutils/FrameBuffer.java b/gdx/src/com/badlogic/gdx/graphics/glutils/FrameBuffer.java
index 0b5bc7f..00b0044 100644
--- a/gdx/src/com/badlogic/gdx/graphics/glutils/FrameBuffer.java
+++ b/gdx/src/com/badlogic/gdx/graphics/glutils/FrameBuffer.java
@@ -119,7 +119,7 @@
 		   if (Gdx.app.getType() == ApplicationType.iOS) {
 		     IntBuffer intbuf = ByteBuffer.allocateDirect(16 * Integer.SIZE / 8).order(ByteOrder.nativeOrder()).asIntBuffer();
 		     gl.glGetIntegerv(GL20.GL_FRAMEBUFFER_BINDING, intbuf);
-		     defaultFramebufferHandle = intbuf.get();
+		     defaultFramebufferHandle = intbuf.get(0);
 		   }
 		   else {
 		     defaultFramebufferHandle = 0;
