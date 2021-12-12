diff --git a/Essentials/src/com/earth2me/essentials/commands/Commandsudo.java b/Essentials/src/com/earth2me/essentials/commands/Commandsudo.java
index b0df89a..2d91657 100644
--- a/Essentials/src/com/earth2me/essentials/commands/Commandsudo.java
+++ b/Essentials/src/com/earth2me/essentials/commands/Commandsudo.java
@@ -27,7 +27,7 @@
 			throw new NotEnoughArgumentsException();
 		}
 
-		final User user = getPlayer(server, args, 0);
+		final User user = getPlayer(server, args, 0, true, false);
 		if(args[1].toLowerCase(Locale.ENGLISH).startsWith("c:"))
 		{
 			if (user.isAuthorized("essentials.sudo.exempt") && sender instanceof Player)
