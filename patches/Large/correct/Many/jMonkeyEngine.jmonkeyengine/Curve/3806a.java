diff --git a/engine/src/core/com/jme3/scene/shape/Curve.java b/engine/src/core/com/jme3/scene/shape/Curve.java
index 3b4387f..db032fb 100644
--- a/engine/src/core/com/jme3/scene/shape/Curve.java
+++ b/engine/src/core/com/jme3/scene/shape/Curve.java
@@ -122,7 +122,7 @@
 
         this.setMode(Mesh.Mode.Lines);
         this.setBuffer(VertexBuffer.Type.Position, 3, array);
-        this.setBuffer(VertexBuffer.Type.Index, 3, indices);//(spline.getControlPoints().size() - 1) * nbSubSegments * 2
+        this.setBuffer(VertexBuffer.Type.Index, 2, indices);//(spline.getControlPoints().size() - 1) * nbSubSegments * 2
         this.updateBound();
         this.updateCounts();
     }
@@ -244,7 +244,7 @@
 
         this.setMode(Mesh.Mode.Lines);
         this.setBuffer(VertexBuffer.Type.Position, 3, array);
-        this.setBuffer(VertexBuffer.Type.Index, (spline.getControlPoints().size() - 1) * 2, indices);
+        this.setBuffer(VertexBuffer.Type.Index, 2, indices);
         this.updateBound();
         this.updateCounts();
     }
