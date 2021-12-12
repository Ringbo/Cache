diff --git a/core/src/processing/opengl/PGraphicsOpenGL.java b/core/src/processing/opengl/PGraphicsOpenGL.java
index 420d580..0cd5dc2 100644
--- a/core/src/processing/opengl/PGraphicsOpenGL.java
+++ b/core/src/processing/opengl/PGraphicsOpenGL.java
@@ -8524,8 +8524,8 @@
 
       int idx1 = 0, idx2 = 0, idx3 = 0, idx4 = 0;
       if (fill || stroke) {
-        // front face
-        setNormal(0, 0, 1);
+        // back face
+        setNormal(0, 0, -1);
         idx1 = addVertex(x1, y1, z1, 0, 0, VERTEX, true);
         idx2 = addVertex(x2, y1, z1, 1, 0, VERTEX, false);
         idx3 = addVertex(x2, y2, z1, 1, 1, VERTEX, false);
@@ -8538,8 +8538,8 @@
           closeEdge(idx4, idx1);
         }
 
-        // back face
-        setNormal(0, 0, -1);
+        // front face
+        setNormal(0, 0, 1);
         idx1 = addVertex(x2, y1, z2, 0, 0, VERTEX, false);
         idx2 = addVertex(x1, y1, z2, 1, 0, VERTEX, false);
         idx3 = addVertex(x1, y2, z2, 1, 1, VERTEX, false);
@@ -8580,8 +8580,8 @@
           closeEdge(idx4, idx1);
         }
 
-        // top face
-        setNormal(0, 1, 0);
+        // bottom face
+        setNormal(0, -1, 0);
         idx1 = addVertex(x1, y1, z2, 0, 0, VERTEX, false);
         idx2 = addVertex(x2, y1, z2, 1, 0, VERTEX, false);
         idx3 = addVertex(x2, y1, z1, 1, 1, VERTEX, false);
@@ -8594,8 +8594,8 @@
           closeEdge(idx4, idx1);
         }
 
-        // bottom face
-        setNormal(0, -1, 0);
+        // top face
+        setNormal(0, 1, 0);
         idx1 = addVertex(x1, y2, z1, 0, 0, VERTEX, false);
         idx2 = addVertex(x2, y2, z1, 1, 0, VERTEX, false);
         idx3 = addVertex(x2, y2, z2, 1, 1, VERTEX, false);
