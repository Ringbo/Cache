diff --git a/src/main/java/net/minecraftforge/client/GuiIngameForge.java b/src/main/java/net/minecraftforge/client/GuiIngameForge.java
index 75514b3..bd0dacc 100644
--- a/src/main/java/net/minecraftforge/client/GuiIngameForge.java
+++ b/src/main/java/net/minecraftforge/client/GuiIngameForge.java
@@ -170,9 +170,9 @@
             if (slot >= 0) objective = scoreboard.getObjectiveInDisplaySlot(3 + slot);
         }
         ScoreObjective scoreobjective1 = objective != null ? objective : scoreboard.getObjectiveInDisplaySlot(1);
-        if (renderObjective && objective != null)
+        if (renderObjective && scoreobjective1 != null)
         {
-            this.func_180475_a(objective, res);
+            this.func_180475_a(scoreobjective1, res);
         }
 
         GlStateManager.enableBlend();
