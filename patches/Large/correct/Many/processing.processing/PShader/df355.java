diff --git a/core/src/processing/opengl/PShader.java b/core/src/processing/opengl/PShader.java
index 03eca75..8f751dc 100644
--- a/core/src/processing/opengl/PShader.java
+++ b/core/src/processing/opengl/PShader.java
@@ -563,7 +563,7 @@
           pgl.uniform3i(loc, v[0], v[1], v[2]);
         } else if (val.type == UniformValue.INT4) {
           int[] v = ((int[])val.value);
-          pgl.uniform4i(loc, v[0], v[1], v[2], v[4]);
+          pgl.uniform4i(loc, v[0], v[1], v[2], v[3]);
         } else if (val.type == UniformValue.FLOAT1) {
           float[] v = ((float[])val.value);
           pgl.uniform1f(loc, v[0]);
