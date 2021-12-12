diff --git a/core/src/processing/opengl/PShader.java b/core/src/processing/opengl/PShader.java
index 25dc248..a05531f 100644
--- a/core/src/processing/opengl/PShader.java
+++ b/core/src/processing/opengl/PShader.java
@@ -325,7 +325,7 @@
 
   public void setVertexShader(String vertFilename) {
     this.vertexFilename = vertFilename;
-    vertexShaderSource = pgl.loadFragmentShader(vertFilename);
+    vertexShaderSource = pgl.loadVertexShader(vertFilename);
   }
 
 
@@ -342,13 +342,13 @@
 
   public void setFragmentShader(String fragFilename) {
     this.fragmentFilename = fragFilename;
-    fragmentShaderSource = pgl.loadVertexShader(fragFilename);
+    fragmentShaderSource = pgl.loadFragmentShader(fragFilename);
   }
 
 
   public void setFragmentShader(URL fragURL) {
     this.fragmentURL = fragURL;
-    fragmentShaderSource = pgl.loadVertexShader(fragURL);
+    fragmentShaderSource = pgl.loadFragmentShader(fragURL);
   }
 
   public void setFragmentShader(String[] fragSource) {
