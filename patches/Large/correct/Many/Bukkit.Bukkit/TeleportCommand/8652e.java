diff --git a/src/main/java/org/bukkit/command/defaults/TeleportCommand.java b/src/main/java/org/bukkit/command/defaults/TeleportCommand.java
index 2147d3e..fd1b9bd 100644
--- a/src/main/java/org/bukkit/command/defaults/TeleportCommand.java
+++ b/src/main/java/org/bukkit/command/defaults/TeleportCommand.java
@@ -71,7 +71,7 @@
             playerLocation.setY(y);
             playerLocation.setZ(z);
 
-            player.teleport(playerLocation);
+            player.teleport(playerLocation, TeleportCause.COMMAND);
             Command.broadcastCommandMessage(sender, String.format("Teleported %s to %.2f, %.2f, %.2f", player.getDisplayName(), x, y, z));
         }
         return true;
