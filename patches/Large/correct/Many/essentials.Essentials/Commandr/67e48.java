diff --git a/Essentials/src/com/earth2me/essentials/commands/Commandr.java b/Essentials/src/com/earth2me/essentials/commands/Commandr.java
index 7d8ee48..fe2a4e5 100644
--- a/Essentials/src/com/earth2me/essentials/commands/Commandr.java
+++ b/Essentials/src/com/earth2me/essentials/commands/Commandr.java
@@ -53,7 +53,7 @@
 		final CommandSender target = replyTo.getReplyTo();
 		final String targetName = target instanceof Player ? ((Player)target).getDisplayName() : Console.NAME;
 
-		if (target == null || ((target instanceof Player) && ((Player)target).isOnline()))
+		if (target == null || ((target instanceof Player) && !((Player)target).isOnline()))
 		{
 			throw new Exception(_("foreverAlone"));
 		}
