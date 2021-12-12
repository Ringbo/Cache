diff --git a/common/buildcraft/commander/GuiZonePlan.java b/common/buildcraft/commander/GuiZonePlan.java
index d4b308f..41ac4a2 100755
--- a/common/buildcraft/commander/GuiZonePlan.java
+++ b/common/buildcraft/commander/GuiZonePlan.java
@@ -134,7 +134,7 @@
 		super.initGui();
 
 		tool = new GuiBetterButton(0, guiLeft + 5, guiTop + 20, 20, "+");
-		tool.setToolTip(new ToolTip(500, new ToolTipLine(StringUtils.localize("tip.tool.add"))));
+		tool.setToolTip(new ToolTip(new ToolTipLine(StringUtils.localize("tip.tool.add"))));
 		buttonList.add(tool);
 
 		savedButtonList = buttonList;
