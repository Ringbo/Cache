diff --git a/core/src/processing/opengl/PSurfaceJOGL.java b/core/src/processing/opengl/PSurfaceJOGL.java
index c81261e..81b070d 100644
--- a/core/src/processing/opengl/PSurfaceJOGL.java
+++ b/core/src/processing/opengl/PSurfaceJOGL.java
@@ -745,7 +745,7 @@
       }
 
       if (sketch.frameCount == 0) {
-        if (sketchWidth0 < sketchWidth0 || sketchHeight < sketchHeight0) {
+        if (sketchWidth < sketchWidth0 || sketchHeight < sketchHeight0) {
           PGraphics.showWarning("The sketch has been automatically resized to fit the screen resolution");
         }
 //        System.out.println("display: " + window.getWidth() + " "+ window.getHeight() + " - " + sketchWidth + " " + sketchHeight);
