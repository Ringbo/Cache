diff --git a/src/main/java/com/pahimar/ee3/client/renderer/tileentity/TileEntityRendererResearchStation.java b/src/main/java/com/pahimar/ee3/client/renderer/tileentity/TileEntityRendererResearchStation.java
index 17aa3c8..d376d47 100644
--- a/src/main/java/com/pahimar/ee3/client/renderer/tileentity/TileEntityRendererResearchStation.java
+++ b/src/main/java/com/pahimar/ee3/client/renderer/tileentity/TileEntityRendererResearchStation.java
@@ -67,7 +67,7 @@
             GL11.glPushMatrix();
 
             ItemStack tome = tileEntityResearchStation.getStackInSlot(TileEntityResearchStation.TOME_SLOT_INVENTORY_INDEX);
-            if (tome != null)
+            if (Minecraft.getMinecraft().gameSettings.fancyGraphics && tome != null)
             {
                 EntityItem ghostEntityItem = new EntityItem(tileEntityResearchStation.getWorldObj());
                 ghostEntityItem.hoverStart = 0.0F;
