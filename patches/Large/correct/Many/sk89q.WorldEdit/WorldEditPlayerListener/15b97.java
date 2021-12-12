diff --git a/src/main/java/com/sk89q/worldedit/bukkit/WorldEditPlayerListener.java b/src/main/java/com/sk89q/worldedit/bukkit/WorldEditPlayerListener.java
index 6df113a..3d9d9de 100644
--- a/src/main/java/com/sk89q/worldedit/bukkit/WorldEditPlayerListener.java
+++ b/src/main/java/com/sk89q/worldedit/bukkit/WorldEditPlayerListener.java
@@ -94,7 +94,7 @@
             LocalPlayer player = wrapPlayer(event.getPlayer());
 
             if (!(event.getAction() == Action.LEFT_CLICK_BLOCK  && plugin.getWorldEdit().handleBlockLeftClick(player, pos))) {
-                plugin.getWorldEdit().handleArmSwing(localPlayer);
+                plugin.getWorldEdit().handleArmSwing(player);
             }
             event.setCancelled(true);
         } else if (event.getAction() == Action.RIGHT_CLICK_BLOCK) {
