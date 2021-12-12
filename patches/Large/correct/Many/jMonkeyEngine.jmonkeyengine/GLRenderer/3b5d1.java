diff --git a/jme3-core/src/main/java/com/jme3/renderer/opengl/GLRenderer.java b/jme3-core/src/main/java/com/jme3/renderer/opengl/GLRenderer.java
index c2deea9..7ef77a2 100644
--- a/jme3-core/src/main/java/com/jme3/renderer/opengl/GLRenderer.java
+++ b/jme3-core/src/main/java/com/jme3/renderer/opengl/GLRenderer.java
@@ -2708,7 +2708,7 @@
             throw new RendererException("Mesh instancing is not supported by the video hardware");
         }
 
-        if (context.lineWidth != mesh.getLineWidth()) {
+        if (mesh.getLineWidth() != 1f && context.lineWidth != mesh.getLineWidth()) {
             gl.glLineWidth(mesh.getLineWidth());
             context.lineWidth = mesh.getLineWidth();
         }
