diff --git a/core/src/processing/core/PGraphics3D.java b/core/src/processing/core/PGraphics3D.java
index 4bc6e26..de1f5aa 100644
--- a/core/src/processing/core/PGraphics3D.java
+++ b/core/src/processing/core/PGraphics3D.java
@@ -3709,7 +3709,7 @@
   public void matrixMode(int mode) {    
     if (mode == PROJECTION) {
       matrixMode = PROJECTION;
-    } else if (matrixMode == MODELVIEW) {
+    } else if (mode == MODELVIEW) {
       matrixMode = MODELVIEW;
     } else {
       showWarning("Invalid matrix mode. Use PROJECTION or MODELVIEW");
