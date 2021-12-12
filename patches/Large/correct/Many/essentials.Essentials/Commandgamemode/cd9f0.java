diff --git a/Essentials/src/com/earth2me/essentials/commands/Commandgamemode.java b/Essentials/src/com/earth2me/essentials/commands/Commandgamemode.java
index a4ee581..8440cb0 100644
--- a/Essentials/src/com/earth2me/essentials/commands/Commandgamemode.java
+++ b/Essentials/src/com/earth2me/essentials/commands/Commandgamemode.java
@@ -45,29 +45,29 @@
 
 	private void gamemodeOtherPlayers(final Server server, final CommandSender sender, final String[] args)
 	{
-		for (Player matchPlayer : server.matchPlayer(args[0]))
+		for (Player matchPlayer : server.matchPlayer(args[1]))
 		{
 			final User player = ess.getUser(matchPlayer);
 			if (player.isHidden())
 			{
 				continue;
 			}		
-			performSetMode(args[1], player);
+			performSetMode(args[0], player);
 			sender.sendMessage(_("gameMode", _(player.getGameMode().toString().toLowerCase(Locale.ENGLISH)), player.getDisplayName()));
 		}
 	}
 	
 	private void performSetMode(String mode, Player player)
 	{
-			if (mode.contains("survi") || mode.equalsIgnoreCase("0"))
+			if (mode.contains("survi") || mode.equalsIgnoreCase("0") || mode.equalsIgnoreCase("s"))
 			{
 				player.setGameMode(GameMode.SURVIVAL);
 			}
-			else if (mode.contains("creat") || mode.equalsIgnoreCase("1"))
+			else if (mode.contains("creat") || mode.equalsIgnoreCase("1") || mode.equalsIgnoreCase("c"))
 			{
 				player.setGameMode(GameMode.CREATIVE);
 			}
-			else if (mode.contains("advent") || mode.equalsIgnoreCase("2"))
+			else if (mode.contains("advent") || mode.equalsIgnoreCase("2") || mode.equalsIgnoreCase("a"))
 			{
 				player.setGameMode(GameMode.ADVENTURE);
 			}
