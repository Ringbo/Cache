diff --git a/Essentials/src/com/earth2me/essentials/commands/Commandtpall.java b/Essentials/src/com/earth2me/essentials/commands/Commandtpall.java
index 98e2326..6335a4a 100644
--- a/Essentials/src/com/earth2me/essentials/commands/Commandtpall.java
+++ b/Essentials/src/com/earth2me/essentials/commands/Commandtpall.java
@@ -43,7 +43,7 @@
 				continue;
 			}
 			if (user.getWorld() != player.getWorld() && ess.getSettings().isWorldTeleportPermissions()
-				&& !player.isAuthorized("essentials.world." + user.getWorld().getName()))
+				&& !user.isAuthorized("essentials.world." + user.getWorld().getName()))
 			{
 				continue;
 			}
