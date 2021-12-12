diff --git a/backends/gdx-backend-jglfw/src/com/badlogic/gdx/backends/jglfw/JglfwGL10.java b/backends/gdx-backend-jglfw/src/com/badlogic/gdx/backends/jglfw/JglfwGL10.java
index 52bba05..c76f91a 100644
--- a/backends/gdx-backend-jglfw/src/com/badlogic/gdx/backends/jglfw/JglfwGL10.java
+++ b/backends/gdx-backend-jglfw/src/com/badlogic/gdx/backends/jglfw/JglfwGL10.java
@@ -52,7 +52,7 @@
 	}
 
 	public void glBindTexture (int target, int texture) {
-		GL.glBindTextureEXT(target, texture);
+		GL.glBindTexture(target, texture);
 	}
 
 	public void glBlendFunc (int sfactor, int dfactor) {
@@ -91,11 +91,11 @@
 	}
 
 	public void glCopyTexImage2D (int target, int level, int internalformat, int x, int y, int width, int height, int border) {
-		GL.glCopyTexImage2DEXT(target, level, internalformat, x, y, width, height, border);
+		GL.glCopyTexImage2D(target, level, internalformat, x, y, width, height, border);
 	}
 
 	public void glCopyTexSubImage2D (int target, int level, int xoffset, int yoffset, int x, int y, int width, int height) {
-		GL.glCopyTexSubImage2DEXT(target, level, xoffset, yoffset, x, y, width, height);
+		GL.glCopyTexSubImage2D(target, level, xoffset, yoffset, x, y, width, height);
 	}
 
 	public void glCullFace (int mode) {
@@ -103,7 +103,7 @@
 	}
 
 	public void glDeleteTextures (int n, IntBuffer textures) {
-		GL.glDeleteTexturesEXT(n, textures, Memory.getPosition(textures));
+		GL.glDeleteTextures(n, textures, Memory.getPosition(textures));
 	}
 
 	public void glDepthFunc (int func) {
@@ -123,7 +123,7 @@
 	}
 
 	public void glDrawArrays (int mode, int first, int count) {
-		GL.glDrawArraysEXT(mode, first, count);
+		GL.glDrawArrays(mode, first, count);
 	}
 
 	public void glDrawElements (int mode, int count, int type, Buffer indices) {
@@ -147,7 +147,7 @@
 	}
 
 	public void glGenTextures (int n, IntBuffer textures) {
-		GL.glGenTexturesEXT(n, textures, Memory.getPosition(textures));
+		GL.glGenTextures(n, textures, Memory.getPosition(textures));
 	}
 
 	public int glGetError () {
@@ -175,7 +175,7 @@
 	}
 
 	public void glPolygonOffset (float factor, float units) {
-		GL.glPolygonOffsetEXT(factor, units);
+		GL.glPolygonOffset(factor, units);
 	}
 
 	public void glReadPixels (int x, int y, int width, int height, int format, int type, Buffer pixels) {
@@ -209,7 +209,7 @@
 
 	public void glTexSubImage2D (int target, int level, int xoffset, int yoffset, int width, int height, int format, int type,
 		Buffer pixels) {
-		GL.glTexSubImage2DEXT(target, level, xoffset, yoffset, width, height, format, type, pixels, Memory.getPosition(pixels));
+		GL.glTexSubImage2D(target, level, xoffset, yoffset, width, height, format, type, pixels, Memory.getPosition(pixels));
 	}
 
 	public void glViewport (int x, int y, int width, int height) {
@@ -261,7 +261,7 @@
 	}
 
 	public void glGenTextures (int n, int[] textures, int offset) {
-		GL.glGenTexturesEXT(n, toBuffer(textures, offset), 0);
+		GL.glGenTextures(n, toBuffer(textures, offset), 0);
 	}
 
 	public void glGetIntegerv (int pname, int[] params, int offset) {
