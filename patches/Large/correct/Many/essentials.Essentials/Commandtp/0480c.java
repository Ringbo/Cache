diff --git a/Essentials/src/com/earth2me/essentials/commands/Commandtp.java b/Essentials/src/com/earth2me/essentials/commands/Commandtp.java
index c1d4347..d6d6b76 100644
--- a/Essentials/src/com/earth2me/essentials/commands/Commandtp.java
+++ b/Essentials/src/com/earth2me/essentials/commands/Commandtp.java
@@ -58,7 +58,7 @@
 				throw new Exception(_("teleportDisabled", toPlayer.getDisplayName()));
 			}
 			if (target.getWorld() != toPlayer.getWorld() && ess.getSettings().isWorldTeleportPermissions()
-				&& !target.isAuthorized("essentials.world." + toPlayer.getWorld().getName()))
+				&& !user.isAuthorized("essentials.world." + toPlayer.getWorld().getName()))
 			{
 				throw new Exception(_("noPerm", "essentials.world." + toPlayer.getWorld().getName()));
 			}
