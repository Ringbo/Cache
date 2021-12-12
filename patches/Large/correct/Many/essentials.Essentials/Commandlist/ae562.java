diff --git a/Essentials/src/com/earth2me/essentials/commands/Commandlist.java b/Essentials/src/com/earth2me/essentials/commands/Commandlist.java
index c9bc864..0e3620a 100644
--- a/Essentials/src/com/earth2me/essentials/commands/Commandlist.java
+++ b/Essentials/src/com/earth2me/essentials/commands/Commandlist.java
@@ -60,7 +60,7 @@
 			// If the group value is hidden, we don't need to display it
 			if (groupValue.equalsIgnoreCase("hidden"))
 			{
-				playerList.remove(groupValue);
+				playerList.remove(configGroup);
 				continue;
 			}
 
