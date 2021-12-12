diff --git a/graphics/java/android/renderscript/Mesh.java b/graphics/java/android/renderscript/Mesh.java
index b74c1f8..d36b2f1 100644
--- a/graphics/java/android/renderscript/Mesh.java
+++ b/graphics/java/android/renderscript/Mesh.java
@@ -69,7 +69,7 @@
         int[] primitives = new int[idxCount];
 
         mRS.nMeshGetVertices(mID, vtxIDs, vtxCount);
-        mRS.nMeshGetIndices(mID, idxIDs, primitives, vtxCount);
+        mRS.nMeshGetIndices(mID, idxIDs, primitives, idxCount);
 
         mVertexBuffers = new Allocation[vtxCount];
         mIndexBuffers = new Allocation[idxCount];
