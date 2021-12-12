diff --git a/Essentials/src/com/earth2me/essentials/commands/Commandwarp.java b/Essentials/src/com/earth2me/essentials/commands/Commandwarp.java
index 84df129..f372754 100644
--- a/Essentials/src/com/earth2me/essentials/commands/Commandwarp.java
+++ b/Essentials/src/com/earth2me/essentials/commands/Commandwarp.java
@@ -56,7 +56,7 @@
 	@Override
 	public void run(final Server server, final CommandSender sender, final String commandLabel, final String[] args) throws Exception
 	{
-		if (args.length < 2 || args[0].matches("[0-9]+"))
+		if (args.length < 2 || Util.isInt(args[0]))
 		{
 			warpList(sender, args);
 			throw new NoChargeException();
@@ -94,7 +94,7 @@
 			}
 		}
 		int page = 1;
-		if (args.length > 0)
+		if (args.length > 0 && Util.isInt(args[0]))
 		{
 			page = Integer.parseInt(args[0]);
 		}
