diff --git a/Essentials/src/com/earth2me/essentials/commands/Commandsetworth.java b/Essentials/src/com/earth2me/essentials/commands/Commandsetworth.java
index 734d924..91a1dd6 100644
--- a/Essentials/src/com/earth2me/essentials/commands/Commandsetworth.java
+++ b/Essentials/src/com/earth2me/essentials/commands/Commandsetworth.java
@@ -17,7 +17,7 @@
 	@Override
 	public void run(final Server server, final User user, final String commandLabel, final String[] args) throws Exception
 	{
-		if (args.length < 2)
+		if (args.length < 1)
 		{
 			throw new NotEnoughArgumentsException();
 		}
