diff --git a/Minecraft/src/main/java/com/microsoft/Malmo/MissionHandlers/FileWorldGeneratorImplementation.java b/Minecraft/src/main/java/com/microsoft/Malmo/MissionHandlers/FileWorldGeneratorImplementation.java
index c4d2e9a..a71b09d 100755
--- a/Minecraft/src/main/java/com/microsoft/Malmo/MissionHandlers/FileWorldGeneratorImplementation.java
+++ b/Minecraft/src/main/java/com/microsoft/Malmo/MissionHandlers/FileWorldGeneratorImplementation.java
@@ -100,7 +100,7 @@
         WorldSummary newWorld = null;
         for (WorldSummary ws : worldlist)
         {
-        	if (ws.getFileName().equals(mapCopy.getAbsolutePath()))
+            if (ws.getFileName().equals(mapCopy.getName()))
         		newWorld = ws;
         }
         if (newWorld == null)
@@ -112,7 +112,7 @@
         net.minecraftforge.fml.client.FMLClientHandler.instance().tryLoadExistingWorld(null, newWorld);
         IntegratedServer server = Minecraft.getMinecraft().getIntegratedServer();
         String worldName = (server != null) ? server.getWorldName() : null;
-        if (worldName == null || !worldName.equals(mapSource.getName()))
+        if (worldName == null || !worldName.equals(newWorld.getDisplayName()))
         {
             this.errorDetails = "Minecraft could not load " + this.mapFilename + " - is it a valid saved world?";
             return false;
