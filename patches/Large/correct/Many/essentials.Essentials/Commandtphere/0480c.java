diff --git a/Essentials/src/com/earth2me/essentials/commands/Commandtphere.java b/Essentials/src/com/earth2me/essentials/commands/Commandtphere.java
index 804176b..92eb872 100644
--- a/Essentials/src/com/earth2me/essentials/commands/Commandtphere.java
+++ b/Essentials/src/com/earth2me/essentials/commands/Commandtphere.java
@@ -23,7 +23,7 @@
 			throw new Exception(_("teleportDisabled", player.getDisplayName()));
 		}
 		if (user.getWorld() != player.getWorld() && ess.getSettings().isWorldTeleportPermissions()
-			&& !player.isAuthorized("essentials.world." + user.getWorld().getName()))
+			&& !user.isAuthorized("essentials.world." + user.getWorld().getName()))
 		{
 			throw new Exception(_("noPerm", "essentials.world." + user.getWorld().getName()));
 		}
