diff --git a/Essentials/src/com/earth2me/essentials/commands/Commandgive.java b/Essentials/src/com/earth2me/essentials/commands/Commandgive.java
index 0353cd8..eeba116 100644
--- a/Essentials/src/com/earth2me/essentials/commands/Commandgive.java
+++ b/Essentials/src/com/earth2me/essentials/commands/Commandgive.java
@@ -25,7 +25,7 @@
 			throw new NotEnoughArgumentsException();
 		}
 
-		ItemStack stack = ItemDb.get(args[0]);
+		ItemStack stack = ItemDb.get(args[1]);
 
 		String itemname = stack.getType().toString().toLowerCase().replace("_", "");
 		if (sender instanceof Player
