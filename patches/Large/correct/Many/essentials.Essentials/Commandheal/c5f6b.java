diff --git a/Essentials/src/com/earth2me/essentials/commands/Commandheal.java b/Essentials/src/com/earth2me/essentials/commands/Commandheal.java
index 55045ec..a7f812a 100644
--- a/Essentials/src/com/earth2me/essentials/commands/Commandheal.java
+++ b/Essentials/src/com/earth2me/essentials/commands/Commandheal.java
@@ -48,7 +48,7 @@
 		healOtherPlayers(server, sender, args[0]);
 	}
 
-	private void healOtherPlayers(final Server server, final CommandSender sender, final String name)
+	private void healOtherPlayers(final Server server, final CommandSender sender, final String name) throws Exception
 	{
 		final List<Player> players = server.matchPlayer(name);
 		if (players.isEmpty())
@@ -67,7 +67,7 @@
 		}
 	}
 
-	private void healPlayer(final Player player)
+	private void healPlayer(final Player player) throws Exception
 	{
 		if (player.getHealth() == 0)
 		{
