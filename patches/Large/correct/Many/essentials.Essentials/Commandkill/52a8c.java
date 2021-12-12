diff --git a/Essentials/src/com/earth2me/essentials/commands/Commandkill.java b/Essentials/src/com/earth2me/essentials/commands/Commandkill.java
index a7fdd33..a2e5822 100644
--- a/Essentials/src/com/earth2me/essentials/commands/Commandkill.java
+++ b/Essentials/src/com/earth2me/essentials/commands/Commandkill.java
@@ -23,7 +23,7 @@
 		}
 				
 		//TODO: TL this
-		if (args[0].trim().length() < 3)
+		if (args[0].trim().length() < 2)
 		{
 			throw new NotEnoughArgumentsException("You need to specify a player to kill.");
 		}
