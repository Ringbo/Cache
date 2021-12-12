diff --git a/Essentials/src/com/earth2me/essentials/commands/Commandexp.java b/Essentials/src/com/earth2me/essentials/commands/Commandexp.java
index 7013d7d..b453541 100644
--- a/Essentials/src/com/earth2me/essentials/commands/Commandexp.java
+++ b/Essentials/src/com/earth2me/essentials/commands/Commandexp.java
@@ -115,7 +115,7 @@
 		}
 	}
 
-	private void showMatch(final Server server, final CommandSender sender, final String match) throws NotEnoughArgumentsException
+	private void showMatch(final Server server, final CommandSender sender, final String match) throws PlayerNotFoundException
 	{
 		boolean skipHidden = sender instanceof Player && !ess.getUser(sender).isAuthorized("essentials.vanish.interact");
 		boolean foundUser = false;
@@ -132,11 +132,11 @@
 		}
 		if (!foundUser)
 		{
-			throw new NotEnoughArgumentsException(_("playerNotFound"));
+			throw new PlayerNotFoundException();
 		}
 	}
 
-	private void expMatch(final Server server, final CommandSender sender, final String match, String amount, final boolean give) throws NotEnoughArgumentsException
+	private void expMatch(final Server server, final CommandSender sender, final String match, String amount, final boolean give) throws NotEnoughArgumentsException, PlayerNotFoundException
 	{
 		boolean skipHidden = sender instanceof Player && !ess.getUser(sender).isAuthorized("essentials.vanish.interact");
 		boolean foundUser = false;
@@ -153,7 +153,7 @@
 		}
 		if (!foundUser)
 		{
-			throw new NotEnoughArgumentsException(_("playerNotFound"));
+			throw new PlayerNotFoundException();
 		}
 	}
 
