diff --git a/Essentials/src/com/earth2me/essentials/commands/Commandtogglejail.java b/Essentials/src/com/earth2me/essentials/commands/Commandtogglejail.java
index 3312daf..5fafe33 100644
--- a/Essentials/src/com/earth2me/essentials/commands/Commandtogglejail.java
+++ b/Essentials/src/com/earth2me/essentials/commands/Commandtogglejail.java
@@ -71,7 +71,7 @@
 			return;
 		}
 
-		if (args.length == 2 && p.isJailed() && !args[1].equalsIgnoreCase(p.getJail()))
+		if (args.length >= 2 && p.isJailed() && !args[1].equalsIgnoreCase(p.getJail()))
 		{
 			sender.sendMessage("§cPerson is already in jail " + p.getJail());
 			return;
