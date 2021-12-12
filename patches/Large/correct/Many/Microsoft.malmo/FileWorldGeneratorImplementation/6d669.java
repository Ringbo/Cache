diff --git a/Minecraft/src/main/java/com/microsoft/Malmo/MissionHandlers/FileWorldGeneratorImplementation.java b/Minecraft/src/main/java/com/microsoft/Malmo/MissionHandlers/FileWorldGeneratorImplementation.java
index 327fb12..5abf5bd 100755
--- a/Minecraft/src/main/java/com/microsoft/Malmo/MissionHandlers/FileWorldGeneratorImplementation.java
+++ b/Minecraft/src/main/java/com/microsoft/Malmo/MissionHandlers/FileWorldGeneratorImplementation.java
@@ -82,7 +82,7 @@
         net.minecraftforge.fml.client.FMLClientHandler.instance().tryLoadExistingWorld(null, mapCopy.getName(), mapSource.getName());
         IntegratedServer server = Minecraft.getMinecraft().getIntegratedServer();
         String worldName = (server != null) ? server.getWorldName() : null;
-        if (worldName == null || !worldName.equals(mapCopy.getName()))
+        if (worldName == null || !worldName.equals(mapSource.getName()))
         {
             this.errorDetails = "Minecraft could not load " + this.mapFilename + " - is it a valid saved world?";
             return false;
