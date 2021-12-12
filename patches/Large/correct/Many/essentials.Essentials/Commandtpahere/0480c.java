diff --git a/Essentials/src/com/earth2me/essentials/commands/Commandtpahere.java b/Essentials/src/com/earth2me/essentials/commands/Commandtpahere.java
index dba6bdb..9d389ec 100644
--- a/Essentials/src/com/earth2me/essentials/commands/Commandtpahere.java
+++ b/Essentials/src/com/earth2me/essentials/commands/Commandtpahere.java
@@ -26,7 +26,7 @@
 			throw new Exception(_("teleportDisabled", player.getDisplayName()));
 		}
 		if (user.getWorld() != player.getWorld() && ess.getSettings().isWorldTeleportPermissions()
-			&& !player.isAuthorized("essentials.world." + user.getWorld().getName()))
+			&& !user.isAuthorized("essentials.world." + user.getWorld().getName()))
 		{
 			throw new Exception(_("noPerm", "essentials.world." + user.getWorld().getName()));
 		}
