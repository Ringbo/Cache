diff --git a/client/net/minecraftforge/client/GuiIngameForge.java b/client/net/minecraftforge/client/GuiIngameForge.java
index cbb83e4..2f1dca1 100644
--- a/client/net/minecraftforge/client/GuiIngameForge.java
+++ b/client/net/minecraftforge/client/GuiIngameForge.java
@@ -485,11 +485,11 @@
         {
             mc.mcProfiler.startSection("toolHighlight");
 
-            if (this.field_92017_k > 0 && this.field_92016_l != null)
+            if (this.remainingHighlightTicks > 0 && this.highlightingItemStack != null)
             {
-                String name = this.field_92016_l.getDisplayName();
+                String name = this.highlightingItemStack.getDisplayName();
 
-                int opacity = (int)((float)this.field_92017_k * 256.0F / 10.0F);
+                int opacity = (int)((float)this.remainingHighlightTicks * 256.0F / 10.0F);
                 if (opacity > 255) opacity = 255;
 
                 if (opacity > 0)
@@ -500,7 +500,7 @@
                     GL11.glPushMatrix();
                     GL11.glEnable(GL11.GL_BLEND);
                     GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
-                    FontRenderer font = field_92016_l.getItem().getFontRenderer(field_92016_l);
+                    FontRenderer font = highlightingItemStack.getItem().getFontRenderer(highlightingItemStack);
                     if (font != null)
                     {
                         int x = (width - font.getStringWidth(name)) / 2;
@@ -693,7 +693,7 @@
                 if (i < players.size())
                 {
                     GuiPlayerInfo player = (GuiPlayerInfo)players.get(i);
-                    ScorePlayerTeam team = mc.theWorld.getScoreboard().func_96509_i(player.name);
+                    ScorePlayerTeam team = mc.theWorld.getScoreboard().getPlayersTeam(player.name);
                     String displayName = ScorePlayerTeam.func_96667_a(team, player.name);
                     fontrenderer.drawStringWithShadow(displayName, xPos, yPos, 16777215);
 
