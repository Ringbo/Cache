diff --git a/engine/src/android/com/jme3/renderer/android/OGLESShaderRenderer.java b/engine/src/android/com/jme3/renderer/android/OGLESShaderRenderer.java
index c3861a3..d276716 100644
--- a/engine/src/android/com/jme3/renderer/android/OGLESShaderRenderer.java
+++ b/engine/src/android/com/jme3/renderer/android/OGLESShaderRenderer.java
@@ -1824,7 +1824,7 @@
                     context.boundArrayVBO = bufId;
                 }
 
-                vb.getData().clear();
+                vb.getData().rewind();
 
                 Android22Workaround.glVertexAttribPointer(loc,
                                     vb.getNumComponents(),
@@ -1935,7 +1935,7 @@
                 count);
                  */
             } else {
-                indexData.clear();
+                indexData.rewind();
                 GLES20.glDrawElements(
                         convertElementMode(mesh.getMode()),
                         indexBuf.getData().limit(),
@@ -2131,7 +2131,7 @@
 
         int vertCount = mesh.getVertexCount();
         Buffer indexData = indexBuf.getData();
-        indexData.clear();
+        indexData.rewind();
 
         if (mesh.getMode() == Mode.Hybrid) {
             int[] modeStart = mesh.getModeStart();
@@ -2202,7 +2202,7 @@
             if ((attribs[loc] != vb) || vb.isUpdateNeeded()) {
                 // NOTE: Use data from interleaved buffer if specified
                 VertexBuffer avb = idb != null ? idb : vb;
-                avb.getData().clear();
+                avb.getData().rewind();
                 avb.getData().position(vb.getOffset());
 
                 // Upload attribute data
