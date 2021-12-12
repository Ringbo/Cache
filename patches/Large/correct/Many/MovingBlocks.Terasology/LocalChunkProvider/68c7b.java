diff --git a/src/main/java/org/terasology/world/chunks/LocalChunkProvider.java b/src/main/java/org/terasology/world/chunks/LocalChunkProvider.java
index 093e47e..db9d549 100644
--- a/src/main/java/org/terasology/world/chunks/LocalChunkProvider.java
+++ b/src/main/java/org/terasology/world/chunks/LocalChunkProvider.java
@@ -472,7 +472,7 @@
     private void checkChunkReady(Vector3i pos) {
         if (worldEntity.exists()) {
             for (Vector3i adjPos : Region3i.createFromCenterExtents(pos, LOCAL_REGION_EXTENTS)) {
-                Chunk chunk = getChunk(pos);
+                Chunk chunk = getChunk(adjPos);
                 if (chunk == null || chunk.getChunkState() != Chunk.State.COMPLETE) {
                     return;
                 }
