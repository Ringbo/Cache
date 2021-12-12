diff --git a/src/com/github/begla/blockmania/world/chunk/ChunkMesh.java b/src/com/github/begla/blockmania/world/chunk/ChunkMesh.java
index 792fd8b..0717cb1 100644
--- a/src/com/github/begla/blockmania/world/chunk/ChunkMesh.java
+++ b/src/com/github/begla/blockmania/world/chunk/ChunkMesh.java
@@ -84,7 +84,7 @@
         VBOManager.getInstance().bufferVboData(_vertexBuffers[id], _vertexElements[id].vertices, GL15.GL_STATIC_DRAW);
     }
 
-    private void renderVbo(int id) {
+    private synchronized void renderVbo(int id) {
         if (_vertexBuffers[id] <= 0)
             return;
 
@@ -148,7 +148,7 @@
         }
     }
 
-    public void freeBuffers() {
+    public synchronized void freeBuffers() {
         for (int i = 0; i < _vertexBuffers.length; i++) {
             int id = _vertexBuffers[i];
 
