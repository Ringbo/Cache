diff --git a/Essentials/src/com/earth2me/essentials/commands/Commandspeed.java b/Essentials/src/com/earth2me/essentials/commands/Commandspeed.java
index a13ba60..700e7ea 100644
--- a/Essentials/src/com/earth2me/essentials/commands/Commandspeed.java
+++ b/Essentials/src/com/earth2me/essentials/commands/Commandspeed.java
@@ -51,7 +51,7 @@
 			{
 				if (args[2].trim().length() < 2)
 				{
-					throw new Exception(_("playerNotFound"));
+					throw new PlayerNotFoundException();
 				}
 				speedOtherPlayers(server, user, isFly, isBypass, speed, args[2]);
 				return;
@@ -70,7 +70,7 @@
 		}
 	}
 
-	private void speedOtherPlayers(final Server server, final CommandSender sender, final boolean isFly, final boolean isBypass, final float speed, final String name) throws NotEnoughArgumentsException
+	private void speedOtherPlayers(final Server server, final CommandSender sender, final boolean isFly, final boolean isBypass, final float speed, final String name) throws PlayerNotFoundException
 	{
 		boolean skipHidden = sender instanceof Player && !ess.getUser(sender).isAuthorized("essentials.vanish.interact");
 		boolean foundUser = false;
@@ -96,7 +96,7 @@
 		}
 		if (!foundUser)
 		{
-			throw new NotEnoughArgumentsException(_("playerNotFound"));
+			throw new PlayerNotFoundException();
 		}
 	}
 
