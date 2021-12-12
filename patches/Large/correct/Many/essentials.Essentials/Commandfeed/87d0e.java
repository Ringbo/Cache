diff --git a/Essentials/src/com/earth2me/essentials/commands/Commandfeed.java b/Essentials/src/com/earth2me/essentials/commands/Commandfeed.java
index 167bfcc..f73e43a 100644
--- a/Essentials/src/com/earth2me/essentials/commands/Commandfeed.java
+++ b/Essentials/src/com/earth2me/essentials/commands/Commandfeed.java
@@ -23,7 +23,7 @@
 		{
 			if (args[0].trim().length() < 2)
 			{
-				throw new Exception(_("playerNotFound"));
+				throw new PlayerNotFoundException();
 			}
 			if (!user.isAuthorized("essentials.heal.cooldown.bypass"))
 			{
@@ -60,7 +60,7 @@
 		feedOtherPlayers(server, sender, args[0]);
 	}
 
-	private void feedOtherPlayers(final Server server, final CommandSender sender, final String name) throws NotEnoughArgumentsException
+	private void feedOtherPlayers(final Server server, final CommandSender sender, final String name) throws PlayerNotFoundException
 	{
 		boolean skipHidden = sender instanceof Player && !ess.getUser(sender).isAuthorized("essentials.vanish.interact");
 		boolean foundUser = false;
@@ -84,7 +84,7 @@
 		}
 		if (!foundUser)
 		{
-			throw new NotEnoughArgumentsException(_("playerNotFound"));
+			throw new PlayerNotFoundException();
 		}
 	}
 
