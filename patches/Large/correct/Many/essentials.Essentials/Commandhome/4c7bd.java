diff --git a/Essentials/src/com/earth2me/essentials/commands/Commandhome.java b/Essentials/src/com/earth2me/essentials/commands/Commandhome.java
index 004cc8e..9eaa972 100644
--- a/Essentials/src/com/earth2me/essentials/commands/Commandhome.java
+++ b/Essentials/src/com/earth2me/essentials/commands/Commandhome.java
@@ -16,7 +16,7 @@
 	{
 		user.canAfford(this);
 		user.teleportCooldown();
-		if(args.length > 1 && user.isAuthorized("essentials.home.others"))
+		if(args.length > 0 && user.isAuthorized("essentials.home.others"))
 		{
 			user.teleportToHome(args[0]);
 			return;
