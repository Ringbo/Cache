diff --git a/engine/src/core/com/jme3/renderer/RenderManager.java b/engine/src/core/com/jme3/renderer/RenderManager.java
index e106b66..5ff3677 100644
--- a/engine/src/core/com/jme3/renderer/RenderManager.java
+++ b/engine/src/core/com/jme3/renderer/RenderManager.java
@@ -596,7 +596,7 @@
             Mesh mesh = gm.getMesh();
             if (mesh != null) {
                 for (VertexBuffer vb : mesh.getBufferList().getArray()) {
-                    if (vb.getData() != null) {
+                    if (vb.getData() != null && vb.getUsage() != VertexBuffer.Usage.CpuOnly) {
                         renderer.updateBufferData(vb);
                     }
                 }
