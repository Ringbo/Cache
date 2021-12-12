diff --git a/src/main/java/org/bukkit/command/defaults/ScoreboardCommand.java b/src/main/java/org/bukkit/command/defaults/ScoreboardCommand.java
index 64816b6..0b2755a 100644
--- a/src/main/java/org/bukkit/command/defaults/ScoreboardCommand.java
+++ b/src/main/java/org/bukkit/command/defaults/ScoreboardCommand.java
@@ -385,13 +385,13 @@
                     sender.sendMessage("Added " + addedPlayers.size() + " player(s) to team " + team.getName() + ": " + stringCollectionToString(addedPlayers));
                 }
             } else if (args[1].equalsIgnoreCase("leave")) {
-                if ((sender instanceof Player) ? args.length < 2 : args.length < 3) {
+                if (!(sender instanceof Player) && args.length < 3) {
                     sender.sendMessage(ChatColor.RED + "/scoreboard teams leave [player...]");
                     return false;
                 }
                 Set<String> left = new HashSet<String>();
                 Set<String> noTeam = new HashSet<String>();
-                if ((sender instanceof Player) && args.length == 3) {
+                if ((sender instanceof Player) && args.length == 2) {
                     Team team = mainScoreboard.getPlayerTeam((Player) sender);
                     if (team != null) {
                         team.removePlayer((Player) sender);
