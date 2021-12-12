diff --git a/Essentials/src/com/earth2me/essentials/commands/Commandkill.java b/Essentials/src/com/earth2me/essentials/commands/Commandkill.java
index 8808690..5191d43 100644
--- a/Essentials/src/com/earth2me/essentials/commands/Commandkill.java
+++ b/Essentials/src/com/earth2me/essentials/commands/Commandkill.java
@@ -32,7 +32,7 @@
 		final List<Player> matchedPlayers = server.matchPlayer(args[0]);
 		for (Player matchPlayer : matchedPlayers)
 		{
-			if (ess.getUser(matchPlayer).isAuthorized("essentials.kill.exempt") && !ess.getUser(sender).isAuthorized("essentials.kill.force"))
+			if (sender instanceof Player && ess.getUser(matchPlayer).isAuthorized("essentials.kill.exempt") && !ess.getUser(sender).isAuthorized("essentials.kill.force"))
 			{
 				throw new Exception(_("killExempt", matchPlayer.getDisplayName()));
 			}
