diff --git a/common/net/minecraftforge/common/ForgeChunkManager.java b/common/net/minecraftforge/common/ForgeChunkManager.java
index 52d611f..4cf0d7f 100644
--- a/common/net/minecraftforge/common/ForgeChunkManager.java
+++ b/common/net/minecraftforge/common/ForgeChunkManager.java
@@ -677,7 +677,7 @@
      * @param world
      * @return
      */
-    public static SetMultimap<ChunkCoordIntPair, Ticket> getPersistentChunksFor(World world)
+    public static ImmutableSetMultimap<ChunkCoordIntPair, Ticket> getPersistentChunksFor(World world)
     {
         return forcedChunks.containsKey(world) ? forcedChunks.get(world) : ImmutableSetMultimap.<ChunkCoordIntPair,Ticket>of();
     }
