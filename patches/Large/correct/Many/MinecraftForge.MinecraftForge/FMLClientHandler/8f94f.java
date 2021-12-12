diff --git a/src/main/java/net/minecraftforge/fml/client/FMLClientHandler.java b/src/main/java/net/minecraftforge/fml/client/FMLClientHandler.java
index 978b753..cf0dbd7 100644
--- a/src/main/java/net/minecraftforge/fml/client/FMLClientHandler.java
+++ b/src/main/java/net/minecraftforge/fml/client/FMLClientHandler.java
@@ -330,7 +330,7 @@
 
         // Reload resources
         client.refreshResources();
-        RenderingRegistry.loadEntityRenderers((Map<Class<? extends Entity>, Render>)Minecraft.getMinecraft().getRenderManager().entityRenderMap);
+        RenderingRegistry.loadEntityRenderers(Minecraft.getMinecraft().getRenderManager().entityRenderMap);
         guiFactories = HashBiMap.create();
         for (ModContainer mc : Loader.instance().getActiveModList())
         {
@@ -825,7 +825,7 @@
     {
         setupServerList();
         OldServerPinger osp = new OldServerPinger();
-        ServerData serverData = new ServerData("Command Line", host+":"+port);
+        ServerData serverData = new ServerData("Command Line", host+":"+port,false);
         try
         {
             osp.ping(serverData);
