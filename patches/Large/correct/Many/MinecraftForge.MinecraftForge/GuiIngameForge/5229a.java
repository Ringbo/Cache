diff --git a/src/main/java/net/minecraftforge/client/GuiIngameForge.java b/src/main/java/net/minecraftforge/client/GuiIngameForge.java
index 500f04a..2627e53 100644
--- a/src/main/java/net/minecraftforge/client/GuiIngameForge.java
+++ b/src/main/java/net/minecraftforge/client/GuiIngameForge.java
@@ -709,7 +709,7 @@
             if (opacity > 0)
             {
                 GlStateManager.pushMatrix();
-                GlStateManager.translate((float)(width / 2), (float)(height - 48), 0.0F);
+                GlStateManager.translate((float)(width / 2), (float)(height - 68), 0.0F);
                 GlStateManager.enableBlend();
                 GlStateManager.tryBlendFuncSeparate(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA, 1, 0);
                 int color = (recordIsPlaying ? Color.HSBtoRGB(hue / 50.0F, 0.7F, 0.6F) & WHITE : WHITE);
