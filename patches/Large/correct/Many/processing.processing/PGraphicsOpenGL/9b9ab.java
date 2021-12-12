diff --git a/core/src/processing/opengl/PGraphicsOpenGL.java b/core/src/processing/opengl/PGraphicsOpenGL.java
index 6b0f42c..719b482 100644
--- a/core/src/processing/opengl/PGraphicsOpenGL.java
+++ b/core/src/processing/opengl/PGraphicsOpenGL.java
@@ -1190,7 +1190,7 @@
     if (!polyBuffersCreated || polyBuffersContextIsOutdated()) {
       polyBuffersContext = pgl.getCurrentContext();
 
-      bufPolyVertex = new VertexBuffer(this, PGL.ARRAY_BUFFER, 3, PGL.SIZEOF_FLOAT);
+      bufPolyVertex = new VertexBuffer(this, PGL.ARRAY_BUFFER, 4, PGL.SIZEOF_FLOAT);
       bufPolyColor = new VertexBuffer(this, PGL.ARRAY_BUFFER, 1, PGL.SIZEOF_INT);
       bufPolyNormal = new VertexBuffer(this, PGL.ARRAY_BUFFER, 3, PGL.SIZEOF_FLOAT);
       bufPolyTexcoord = new VertexBuffer(this, PGL.ARRAY_BUFFER, 2, PGL.SIZEOF_FLOAT);
