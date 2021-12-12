diff --git a/jme3-core/src/main/java/com/jme3/renderer/opengl/GLRenderer.java b/jme3-core/src/main/java/com/jme3/renderer/opengl/GLRenderer.java
index 69ef39b..50e603d 100644
--- a/jme3-core/src/main/java/com/jme3/renderer/opengl/GLRenderer.java
+++ b/jme3-core/src/main/java/com/jme3/renderer/opengl/GLRenderer.java
@@ -380,14 +380,14 @@
         }
 
         if (hasExtension("GL_EXT_framebuffer_object") 
-                || gl3 != null
+                || caps.contains(Caps.OpenGL30)
                 || caps.contains(Caps.OpenGLES20)) {
             caps.add(Caps.FrameBuffer);
 
             limits.put(Limits.RenderBufferSize, getInteger(GLFbo.GL_MAX_RENDERBUFFER_SIZE_EXT));
             limits.put(Limits.FrameBufferAttachments, getInteger(GLFbo.GL_MAX_COLOR_ATTACHMENTS_EXT));
 
-            if (hasExtension("GL_EXT_framebuffer_blit")) {
+            if (hasExtension("GL_EXT_framebuffer_blit") || caps.contains(Caps.OpenGL30)) {
                 caps.add(Caps.FrameBufferBlit);
             }
 
@@ -406,7 +406,7 @@
                 }
             }
 
-            if (hasExtension("GL_ARB_draw_buffers") || gl3 != null) {
+            if (hasExtension("GL_ARB_draw_buffers") || caps.contains(Caps.OpenGL30)) {
                 limits.put(Limits.FrameBufferMrtAttachments, getInteger(GLExt.GL_MAX_DRAW_BUFFERS_ARB));
                 if (limits.get(Limits.FrameBufferMrtAttachments) > 1) {
                     caps.add(Caps.FrameBufferMRT);
