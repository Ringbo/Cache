diff --git a/src/main/java/org/bukkit/command/defaults/ScoreboardCommand.java b/src/main/java/org/bukkit/command/defaults/ScoreboardCommand.java
index 0b2755a..687af3d 100644
--- a/src/main/java/org/bukkit/command/defaults/ScoreboardCommand.java
+++ b/src/main/java/org/bukkit/command/defaults/ScoreboardCommand.java
@@ -400,7 +400,7 @@
                         noTeam.add(sender.getName());
                     }
                 } else {
-                    for (int i = 3; i < args.length; i++) {
+                    for (int i = 2; i < args.length; i++) {
                         String playerName = args[i];
                         OfflinePlayer offlinePlayer;
                         Player player = Bukkit.getPlayerExact(playerName);
