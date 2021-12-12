diff --git a/Essentials/src/com/earth2me/essentials/commands/Commandmail.java b/Essentials/src/com/earth2me/essentials/commands/Commandmail.java
index d72d37a..8dba44a 100644
--- a/Essentials/src/com/earth2me/essentials/commands/Commandmail.java
+++ b/Essentials/src/com/earth2me/essentials/commands/Commandmail.java
@@ -118,9 +118,9 @@
 			sender.sendMessage(_("mailSent"));
 			return;
 		}
-		else if (args.length >= 1 && "sendall".equalsIgnoreCase(args[0]))
+		else if (args.length >= 2 && "sendall".equalsIgnoreCase(args[0]))
 		{
-			ess.runTaskAsynchronously(new SendAll("Server: " + getFinalArg(args, 2)));
+			ess.runTaskAsynchronously(new SendAll("Server: " + getFinalArg(args, 1)));
 			sender.sendMessage(_("mailSent"));
 			return;
 		}
