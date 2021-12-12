diff --git a/android/core/src/processing/opengl/PTexture.java b/android/core/src/processing/opengl/PTexture.java
index 0212cad..d9db47a 100644
--- a/android/core/src/processing/opengl/PTexture.java
+++ b/android/core/src/processing/opengl/PTexture.java
@@ -769,7 +769,7 @@
     pgl.glTexImage2D(glTarget, 0, glFormat, glWidth, glHeight, 0, PGL.GL_RGBA, PGL.GL_UNSIGNED_BYTE, null);
     
     // Makes sure that the texture buffer in video memory doesn't contain any garbage.
-    pgl.initTexture(glTarget, width, height, PGL.GL_RGBA, PGL.GL_UNSIGNED_BYTE);
+    pgl.initTexture(glTarget, PGL.GL_RGBA, width, height);
     
     pgl.glBindTexture(glTarget, 0);
     pgl.disableTexturing(glTarget);
