diff --git a/common/buildcraft/energy/gui/GuiCombustionEngine.java b/common/buildcraft/energy/gui/GuiCombustionEngine.java
index 2200b08..1c8ce39 100644
--- a/common/buildcraft/energy/gui/GuiCombustionEngine.java
+++ b/common/buildcraft/energy/gui/GuiCombustionEngine.java
@@ -65,7 +65,7 @@
 	
 		Icon liquidIcon;
 		String textureSheet;
-		if(liquid.canonical().getRenderingIcon() != null) {
+		if(liquid.canonical() != null && liquid.canonical().getRenderingIcon() != null) {
 			textureSheet = liquid.canonical().getTextureSheet();
 			liquidIcon = liquid.canonical().getRenderingIcon();
 		} else {
