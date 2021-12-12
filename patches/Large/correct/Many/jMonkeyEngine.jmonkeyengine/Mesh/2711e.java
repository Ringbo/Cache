diff --git a/engine/src/core/com/jme3/scene/Mesh.java b/engine/src/core/com/jme3/scene/Mesh.java
index b537a65..1d567cd 100644
--- a/engine/src/core/com/jme3/scene/Mesh.java
+++ b/engine/src/core/com/jme3/scene/Mesh.java
@@ -1166,7 +1166,9 @@
         // Now, create the vertex buffers
         SafeArrayList<VertexBuffer> oldVertexData = other.getBufferList();
         for (VertexBuffer oldVb : oldVertexData) {
-            if (oldVb.getBufferType() == VertexBuffer.Type.Index) {
+            if (oldVb.getBufferType() == VertexBuffer.Type.Index
+                    ||oldVb.getBufferType() == VertexBuffer.Type.HWBoneIndex 
+                    || oldVb.getBufferType() == VertexBuffer.Type.HWBoneWeight  ) {
                 // ignore the index buffer
                 continue;
             }
