diff --git a/src/main/java/org/bukkit/command/defaults/ScoreboardCommand.java b/src/main/java/org/bukkit/command/defaults/ScoreboardCommand.java
index 687af3d..a805f7c 100644
--- a/src/main/java/org/bukkit/command/defaults/ScoreboardCommand.java
+++ b/src/main/java/org/bukkit/command/defaults/ScoreboardCommand.java
@@ -309,7 +309,7 @@
                 } else {
                     String displayName = null;
                     if (args.length > 3) {
-                        displayName = StringUtils.join(ArrayUtils.subarray(args, 4, args.length), ' ');
+                        displayName = StringUtils.join(ArrayUtils.subarray(args, 3, args.length), ' ');
                         if (displayName.length() > 32) {
                             sender.sendMessage(ChatColor.RED + "The display name '" + displayName + "' is too long for a team, it can be at most 32 characters long");
                             return false;
