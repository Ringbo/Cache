diff --git a/core/src/processing/opengl/PSurfaceJOGL.java b/core/src/processing/opengl/PSurfaceJOGL.java
index 99067b1..ba64299 100644
--- a/core/src/processing/opengl/PSurfaceJOGL.java
+++ b/core/src/processing/opengl/PSurfaceJOGL.java
@@ -407,7 +407,7 @@
 
 
   protected void initAnimator() {
-    animator = new FPSAnimator(window, 60, true);
+    animator = new FPSAnimator(window, 60);
     drawException = null;
     animator.setUncaughtExceptionHandler(new GLAnimatorControl.UncaughtExceptionHandler() {
       @Override
