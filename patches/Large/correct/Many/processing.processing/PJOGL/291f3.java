diff --git a/core/src/processing/opengl/PJOGL.java b/core/src/processing/opengl/PJOGL.java
index 994ff21..e992262 100644
--- a/core/src/processing/opengl/PJOGL.java
+++ b/core/src/processing/opengl/PJOGL.java
@@ -278,7 +278,7 @@
       }
     }
 
-    if (canvasAWT != null && canvasNEWT != null) {
+    if (canvasAWT != null || canvasNEWT != null) {
       // Restarting...
       if (canvasAWT != null) {
         sharedCanvasAWT = null;
