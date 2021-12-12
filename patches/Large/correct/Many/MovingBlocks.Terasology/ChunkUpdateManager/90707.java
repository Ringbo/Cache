diff --git a/src/main/java/org/terasology/rendering/world/ChunkUpdateManager.java b/src/main/java/org/terasology/rendering/world/ChunkUpdateManager.java
index 1bb1370..22c73c6 100644
--- a/src/main/java/org/terasology/rendering/world/ChunkUpdateManager.java
+++ b/src/main/java/org/terasology/rendering/world/ChunkUpdateManager.java
@@ -75,7 +75,7 @@
     private void executeChunkUpdate(final Chunk c) {
         currentlyProcessedChunks.add(c);
 
-        CoreRegistry.get(GameEngine.class).submitTask("Chunk Update", new ChunkUpdater(c, tessellator, worldProvider));
+        CoreRegistry.get(GameEngine.class).submitTask("Chunk Update", new ChunkUpdater(c, tessellator, worldProvider, this));
     }
 
     private void finishedProcessing(Chunk c) {
