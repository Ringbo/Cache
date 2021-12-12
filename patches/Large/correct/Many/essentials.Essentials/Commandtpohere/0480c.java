diff --git a/Essentials/src/com/earth2me/essentials/commands/Commandtpohere.java b/Essentials/src/com/earth2me/essentials/commands/Commandtpohere.java
index 3f650f9..880c4e3 100644
--- a/Essentials/src/com/earth2me/essentials/commands/Commandtpohere.java
+++ b/Essentials/src/com/earth2me/essentials/commands/Commandtpohere.java
@@ -31,7 +31,7 @@
 		}
 
 		if (user.getWorld() != player.getWorld() && ess.getSettings().isWorldTeleportPermissions()
-			&& !player.isAuthorized("essentials.world." + user.getWorld().getName()))
+			&& !user.isAuthorized("essentials.world." + user.getWorld().getName()))
 		{
 			throw new Exception(_("noPerm", "essentials.world." + user.getWorld().getName()));
 		}
