diff --git a/Essentials/src/com/earth2me/essentials/commands/Commandmsg.java b/Essentials/src/com/earth2me/essentials/commands/Commandmsg.java
index fe39a1c..6b6392c 100644
--- a/Essentials/src/com/earth2me/essentials/commands/Commandmsg.java
+++ b/Essentials/src/com/earth2me/essentials/commands/Commandmsg.java
@@ -21,7 +21,7 @@
 	@Override
 	public void run(Server server, CommandSender sender, String commandLabel, String[] args) throws Exception
 	{
-		if (args.length < 2 || args[0].trim().length() < 3  || args[1].trim().isEmpty())
+		if (args.length < 2 || args[0].trim().length() < 2  || args[1].trim().isEmpty())
 		{
 			throw new NotEnoughArgumentsException();
 		}
