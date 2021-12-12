diff --git a/src/main/java/net/minecraftforge/common/ForgeChunkManager.java b/src/main/java/net/minecraftforge/common/ForgeChunkManager.java
index c402b1e..3f34aad 100644
--- a/src/main/java/net/minecraftforge/common/ForgeChunkManager.java
+++ b/src/main/java/net/minecraftforge/common/ForgeChunkManager.java
@@ -598,7 +598,7 @@
         forcedChunks.remove(world);
         dormantChunkCache.remove(world);
         // integrated server is shutting down
-        if (FMLCommonHandler.instance().getMinecraftServerInstance().isServerRunning())
+        if (!FMLCommonHandler.instance().getMinecraftServerInstance().isServerRunning())
         {
             playerTickets.clear();
             tickets.clear();
