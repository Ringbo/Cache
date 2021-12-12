diff --git a/common/buildcraft/transport/render/PipeItemRenderer.java b/common/buildcraft/transport/render/PipeItemRenderer.java
index 8fb5e40..50fae0a 100644
--- a/common/buildcraft/transport/render/PipeItemRenderer.java
+++ b/common/buildcraft/transport/render/PipeItemRenderer.java
@@ -25,7 +25,7 @@
 		Block block = BuildCraftTransport.genericPipeBlock;
 		Icon icon = ((ItemPipe) Item.itemsList[item.itemID]).getIconFromDamage(0);
 
-		if (icon == null) icon = Minecraft.getMinecraft().renderEngine.getMissingIcon(1);
+		if (icon == null) icon = Minecraft.getMinecraft().renderEngine.getMissingIcon(0);
 
 		block.setBlockBounds(Utils.pipeMinPos, 0.0F, Utils.pipeMinPos, Utils.pipeMaxPos, 1.0F, Utils.pipeMaxPos);
 		block.setBlockBoundsForItemRender();
