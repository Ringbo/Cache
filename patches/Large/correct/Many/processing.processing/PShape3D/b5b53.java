diff --git a/android/core/src/processing/opengl/PShape3D.java b/android/core/src/processing/opengl/PShape3D.java
index 694965e..a7e07f7 100644
--- a/android/core/src/processing/opengl/PShape3D.java
+++ b/android/core/src/processing/opengl/PShape3D.java
@@ -3761,7 +3761,7 @@
         render(texture);
       }
     
-      if (matrix != null) {
+      if (matrix != null && applyMatrix) {
         g.popMatrix();
       } 
     }
