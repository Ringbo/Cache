diff --git a/core/src/processing/opengl/PJOGL.java b/core/src/processing/opengl/PJOGL.java
index 9a429f8..9c57903 100644
--- a/core/src/processing/opengl/PJOGL.java
+++ b/core/src/processing/opengl/PJOGL.java
@@ -1701,7 +1701,7 @@
   @Override
   public String getProgramInfoLog(int program) {
     int[] val = { 0 };
-    gl2.glGetShaderiv(program, GL2ES2.GL_INFO_LOG_LENGTH, val, 0);
+    gl2.glGetProgramiv(program, GL2ES2.GL_INFO_LOG_LENGTH, val, 0);
     int length = val[0];
 
     if (0 < length) {
