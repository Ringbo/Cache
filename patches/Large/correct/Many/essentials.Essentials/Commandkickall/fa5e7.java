diff --git a/Essentials/src/com/earth2me/essentials/commands/Commandkickall.java b/Essentials/src/com/earth2me/essentials/commands/Commandkickall.java
index 7462710..48833b1 100644
--- a/Essentials/src/com/earth2me/essentials/commands/Commandkickall.java
+++ b/Essentials/src/com/earth2me/essentials/commands/Commandkickall.java
@@ -22,7 +22,7 @@
 
 		for (Player onlinePlayer : server.getOnlinePlayers())
 		{
-			if (!sender.isPlayer() && !onlinePlayer.getName().equalsIgnoreCase(sender.getPlayer().getName()))
+			if (!sender.isPlayer() || !onlinePlayer.getName().equalsIgnoreCase(sender.getPlayer().getName()))
 			{
 				onlinePlayer.kickPlayer(kickReason);
 			}
