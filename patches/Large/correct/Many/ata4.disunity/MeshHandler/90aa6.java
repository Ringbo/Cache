diff --git a/src/info/ata4/unity/cli/extract/handler/MeshHandler.java b/src/info/ata4/unity/cli/extract/handler/MeshHandler.java
index c3a154c..b0e3d99 100644
--- a/src/info/ata4/unity/cli/extract/handler/MeshHandler.java
+++ b/src/info/ata4/unity/cli/extract/handler/MeshHandler.java
@@ -372,7 +372,7 @@
                 }
                 
                 final int numFaces = subMesh.indexCount.intValue() / 3;
-                final int ofsFaces = subMesh.firstByte.intValue() / 3;
+                final int ofsFaces = subMesh.firstByte.intValue() / 6;
 
                 for (int j = ofsFaces; j < ofsFaces + numFaces; j++) {
                     int i1 = triangles.get(j * 3);
@@ -484,7 +484,7 @@
                 final int numVertices = subMesh.vertexCount.intValue();
                 final int ofsVertices = subMesh.firstVertex.intValue();
                 final int numFaces = subMesh.indexCount.intValue() / 3;
-                final int ofsFaces = subMesh.firstByte.intValue() / 3;
+                final int ofsFaces = subMesh.firstByte.intValue() / 6;
 
                 // write header
                 PlyWriter ply = new PlyWriter(ps);
