diff --git a/src/main/java/net/minecraftforge/common/ForgeModContainer.java b/src/main/java/net/minecraftforge/common/ForgeModContainer.java
index dfe2346..3ef4c7c 100644
--- a/src/main/java/net/minecraftforge/common/ForgeModContainer.java
+++ b/src/main/java/net/minecraftforge/common/ForgeModContainer.java
@@ -354,7 +354,7 @@
     @Subscribe
     public void serverStarting(FMLServerStartingEvent evt)
     {
-        evt.registerServerCommand(new ForgeCommand(evt.getServer()));
+        evt.registerServerCommand(new ForgeCommand());
     }
     @Override
     public NBTTagCompound getDataForWriting(SaveHandler handler, WorldInfo info)
