diff --git a/common/buildcraft/energy/gui/GuiEngine.java b/common/buildcraft/energy/gui/GuiEngine.java
index a791df1..59aa001 100644
--- a/common/buildcraft/energy/gui/GuiEngine.java
+++ b/common/buildcraft/energy/gui/GuiEngine.java
@@ -59,7 +59,7 @@
 			fontRendererObj.drawString(String.format("%d RF", engine.getEnergyStored()), x + 22,
 					y + 56, textColour);
 			fontRendererObj.drawStringWithShadow(StringUtils.localize("gui.heat") + ":", x + 22, y + 68, subheaderColour);
-			fontRendererObj.drawString(String.format("%.2f \u00B0C", engine.getHeat()), x + 22, y + 80, textColour);
+			fontRendererObj.drawString(String.format("%.2f \u00B0C", engine.getCurrentHeatValue()), x + 22, y + 80, textColour);
 
 		}
 
