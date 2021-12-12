diff --git a/core/src/processing/opengl/PShapeOpenGL.java b/core/src/processing/opengl/PShapeOpenGL.java
index 45811bb..c3c8bf5 100644
--- a/core/src/processing/opengl/PShapeOpenGL.java
+++ b/core/src/processing/opengl/PShapeOpenGL.java
@@ -1410,7 +1410,7 @@
       }
       break;
     }
-    matrix.apply(transform);
+    matrix.preApply(transform);
     pushTransform();
     if (tessellated) applyMatrixImpl(transform);
   }
