diff --git a/opengl/java/android/opengl/GLSurfaceView.java b/opengl/java/android/opengl/GLSurfaceView.java
index daa5d13..ab7ceb6 100644
--- a/opengl/java/android/opengl/GLSurfaceView.java
+++ b/opengl/java/android/opengl/GLSurfaceView.java
@@ -1507,7 +1507,7 @@
             mPaused = false;
             updateState();
             if (mRenderMode == RENDERMODE_WHEN_DIRTY) {
-                executeDraw();
+                requestRender();
             }
         }
 
