diff --git a/Essentials/src/com/earth2me/essentials/commands/Commandgamemode.java b/Essentials/src/com/earth2me/essentials/commands/Commandgamemode.java
index 75971a3..39f7d93 100644
--- a/Essentials/src/com/earth2me/essentials/commands/Commandgamemode.java
+++ b/Essentials/src/com/earth2me/essentials/commands/Commandgamemode.java
@@ -34,7 +34,7 @@
 			throw new NotEnoughArgumentsException();
 		}
 
-		if (args.length > 1 && args[0].trim().length() > 2 && user.isAuthorized("essentials.gamemode.others"))
+		if (args.length > 1 && args[1].trim().length() > 2 && user.isAuthorized("essentials.gamemode.others"))
 		{
 			gamemodeOtherPlayers(server, user, args);
 			return;
