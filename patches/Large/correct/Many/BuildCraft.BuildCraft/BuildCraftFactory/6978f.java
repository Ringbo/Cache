diff --git a/common/buildcraft/BuildCraftFactory.java b/common/buildcraft/BuildCraftFactory.java
index d9256a6..16ca614 100644
--- a/common/buildcraft/BuildCraftFactory.java
+++ b/common/buildcraft/BuildCraftFactory.java
@@ -415,7 +415,7 @@
         FactoryProxyClient.pumpTexture = terrainTextures.registerSprite(new ResourceLocation("buildcraftfactory:blocks/pump/tube"));
         ChuteRenderModel.sideTexture = terrainTextures.registerSprite(new ResourceLocation("buildcraftfactory:blocks/chute/side"));
 
-        if (Loader.isModLoaded("BuildCraft|Energy") && !BuildCraftCore.DEVELOPER_MODE) {
+        if (Loader.isModLoaded("BuildCraft|Energy") && BuildCraftCore.DEVELOPER_MODE) {
             ComplexRefiningManager.textureStitchPre(evt);
         }
     }
@@ -437,7 +437,7 @@
             event.modelRegistry.putObject(mrl, ChuteRenderModel.create(model));
         }
 
-        if (Loader.isModLoaded("BuildCraft|Energy") && !BuildCraftCore.DEVELOPER_MODE) {
+        if (Loader.isModLoaded("BuildCraft|Energy") && BuildCraftCore.DEVELOPER_MODE) {
             ComplexRefiningManager.registerModels(event);
         }
     }
