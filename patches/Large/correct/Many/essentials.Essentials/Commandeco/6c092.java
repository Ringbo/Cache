diff --git a/Essentials/src/com/earth2me/essentials/commands/Commandeco.java b/Essentials/src/com/earth2me/essentials/commands/Commandeco.java
index e64d429..2aa883b 100644
--- a/Essentials/src/com/earth2me/essentials/commands/Commandeco.java
+++ b/Essentials/src/com/earth2me/essentials/commands/Commandeco.java
@@ -55,7 +55,7 @@
 		}
 		else
 		{
-			User u = getPlayer(server, args, 0, true);
+			User u = getPlayer(server, args, 1, true);
 			switch (cmd)
 			{
 			case GIVE:
