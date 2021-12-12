diff --git a/fml/client/net/minecraft/src/ModLoader.java b/fml/client/net/minecraft/src/ModLoader.java
index 35b425e..98fd34c 100644
--- a/fml/client/net/minecraft/src/ModLoader.java
+++ b/fml/client/net/minecraft/src/ModLoader.java
@@ -500,7 +500,7 @@
     }
 
     @Deprecated
-    static void populateChunk(IChunkProvider generator, int chunkX, int chunkZ, World world)
+    public static void populateChunk(IChunkProvider generator, int chunkX, int chunkZ, World world)
     {
     }
 
@@ -523,7 +523,7 @@
     }
 
     @Deprecated
-    static void registerAllTextureOverrides(RenderEngine cache)
+    public static void registerAllTextureOverrides(RenderEngine cache)
     {
     }
 
@@ -604,7 +604,7 @@
         CommonRegistry.registerTileEntity(tileEntityClass, id);
     }
 
-    static void registerTileEntity(Class<? extends TileEntity> tileEntityClass, String id, TileEntitySpecialRenderer renderer)
+    public static void registerTileEntity(Class<? extends TileEntity> tileEntityClass, String id, TileEntitySpecialRenderer renderer)
     {
         ClientRegistry.instance().registerTileEntity(tileEntityClass, id, renderer);
     }
@@ -665,18 +665,18 @@
         CommonRegistry.removeSpawn(entityName, spawnList, biomes);
     }
 
-    static boolean renderBlockIsItemFull3D(int modelID)
+    public static boolean renderBlockIsItemFull3D(int modelID)
     {
         //TODO
         return false;
     }
 
-    static void renderInvBlock(RenderBlocks renderer, Block block, int metadata, int modelID)
+    public static void renderInvBlock(RenderBlocks renderer, Block block, int metadata, int modelID)
     {
         //TODO
     }
 
-    static boolean renderWorldBlock(RenderBlocks renderer, IBlockAccess world, int x, int y, int z, Block block, int modelID)
+    public static boolean renderWorldBlock(RenderBlocks renderer, IBlockAccess world, int x, int y, int z, Block block, int modelID)
     {
         //TODO
         return false;
@@ -702,7 +702,7 @@
         //TODO
     }
 
-    static void serverLogin(NetClientHandler handler, Packet1Login loginPacket)
+    public static void serverLogin(NetClientHandler handler, Packet1Login loginPacket)
     {
         //TODO
     }
