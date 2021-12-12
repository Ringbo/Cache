diff --git a/common/buildcraft/core/gui/GuiAdvancedInterface.java b/common/buildcraft/core/gui/GuiAdvancedInterface.java
index 1d7bb86..212bfb9 100644
--- a/common/buildcraft/core/gui/GuiAdvancedInterface.java
+++ b/common/buildcraft/core/gui/GuiAdvancedInterface.java
@@ -66,7 +66,7 @@
 				int cornerY = (height - ySize) / 2;
 
 				itemRenderer.zLevel = 200F;
-				itemRenderer.renderItemIntoGUI(fontRenderer, mc.renderEngine, item, cornerX + x, cornerY + y);
+				itemRenderer.func_82406_b(fontRenderer, mc.renderEngine, item, cornerX + x, cornerY + y);
 				itemRenderer.renderItemOverlayIntoGUI(fontRenderer, mc.renderEngine, item, cornerX + x, cornerY + y);
 				itemRenderer.zLevel = 0.0F;
 			}
