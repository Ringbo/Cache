diff --git a/Essentials/src/com/earth2me/essentials/commands/Commandpay.java b/Essentials/src/com/earth2me/essentials/commands/Commandpay.java
index af7519f..5ce1312 100644
--- a/Essentials/src/com/earth2me/essentials/commands/Commandpay.java
+++ b/Essentials/src/com/earth2me/essentials/commands/Commandpay.java
@@ -23,7 +23,7 @@
 		}
 		
 		//TODO: TL this
-		if (args[0].trim().length() < 3)
+		if (args[0].trim().length() < 2)
 		{
 			throw new NotEnoughArgumentsException("You need to specify a player to pay.");
 		}
