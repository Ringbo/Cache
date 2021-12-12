diff --git a/Essentials/src/com/earth2me/essentials/commands/Commandclearinventory.java b/Essentials/src/com/earth2me/essentials/commands/Commandclearinventory.java
index 3ef863d..070e74c 100644
--- a/Essentials/src/com/earth2me/essentials/commands/Commandclearinventory.java
+++ b/Essentials/src/com/earth2me/essentials/commands/Commandclearinventory.java
@@ -74,7 +74,7 @@
 			{
 				clearInventory(onlinePlayer, args[1]);
 			}
-			user.sendMessage(_("inventoryClearedAll"));
+			sender.sendMessage(_("inventoryClearedAll"));
 		}
 		else
 		{
