diff --git a/src/main/java/org/bukkit/command/defaults/DeopCommand.java b/src/main/java/org/bukkit/command/defaults/DeopCommand.java
index 1b71d49..c46750a 100644
--- a/src/main/java/org/bukkit/command/defaults/DeopCommand.java
+++ b/src/main/java/org/bukkit/command/defaults/DeopCommand.java
@@ -49,9 +49,9 @@
 
         if (args.length == 1) {
             List<String> completions = new ArrayList<String>();
-            for (OfflinePlayer player : Bukkit.getOfflinePlayers()) {
+            for (OfflinePlayer player : Bukkit.getOperators()) {
                 String playerName = player.getName();
-                if (player.isOp() && StringUtil.startsWithIgnoreCase(playerName, args[0])) {
+                if (StringUtil.startsWithIgnoreCase(playerName, args[0])) {
                     completions.add(playerName);
                 }
             }
