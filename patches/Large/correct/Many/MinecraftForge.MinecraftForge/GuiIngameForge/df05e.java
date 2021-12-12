diff --git a/src/main/java/net/minecraftforge/client/GuiIngameForge.java b/src/main/java/net/minecraftforge/client/GuiIngameForge.java
index 8025d44..5c3adae 100644
--- a/src/main/java/net/minecraftforge/client/GuiIngameForge.java
+++ b/src/main/java/net/minecraftforge/client/GuiIngameForge.java
@@ -94,7 +94,7 @@
     @Override
     public void renderGameOverlay(float partialTicks)
     {
-        res = new ScaledResolution(mc, mc.displayWidth, mc.displayHeight);
+        res = new ScaledResolution(mc);
         eventParent = new RenderGameOverlayEvent(partialTicks, res);
         int width = res.getScaledWidth();
         int height = res.getScaledHeight();
