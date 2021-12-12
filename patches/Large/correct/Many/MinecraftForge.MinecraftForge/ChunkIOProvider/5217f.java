diff --git a/src/main/java/net/minecraftforge/common/chunkio/ChunkIOProvider.java b/src/main/java/net/minecraftforge/common/chunkio/ChunkIOProvider.java
index e797a00..f4982c9 100644
--- a/src/main/java/net/minecraftforge/common/chunkio/ChunkIOProvider.java
+++ b/src/main/java/net/minecraftforge/common/chunkio/ChunkIOProvider.java
@@ -34,7 +34,7 @@
     public void callStage2(QueuedChunk queuedChunk, net.minecraft.world.chunk.Chunk chunk) throws RuntimeException {
         if(chunk == null) {
             // If the chunk loading failed just do it synchronously (may generate)
-            queuedChunk.provider.loadChunk(queuedChunk.x, queuedChunk.z);
+            queuedChunk.provider.originalLoadChunk(queuedChunk.x, queuedChunk.z);
             return;
         }
 
