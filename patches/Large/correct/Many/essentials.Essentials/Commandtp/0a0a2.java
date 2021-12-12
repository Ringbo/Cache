diff --git a/Essentials/src/com/earth2me/essentials/commands/Commandtp.java b/Essentials/src/com/earth2me/essentials/commands/Commandtp.java
index 7eae137..efaf32f 100644
--- a/Essentials/src/com/earth2me/essentials/commands/Commandtp.java
+++ b/Essentials/src/com/earth2me/essentials/commands/Commandtp.java
@@ -54,7 +54,7 @@
 			{
 				throw new NotEnoughArgumentsException("Value of coordinates cannot be over 30000000"); //TODO: I18n
 			}
-			final Location location = new Location(target2.getWorld(), x, y, z);
+			final Location location = new Location(target2.getWorld(), x, y, z, target2.getLocation().getYaw(), target2.getLocation().getPitch());
 			if (!target2.isTeleportEnabled())
 			{
 				throw new Exception(_("teleportDisabled", target2.getDisplayName()));
@@ -115,7 +115,7 @@
 			{
 				throw new NotEnoughArgumentsException("Value of coordinates cannot be over 30000000"); //TODO: I18n
 			}
-			final Location location = new Location(target.getWorld(), x, y, z);
+			final Location location = new Location(target.getWorld(), x, y, z, target.getLocation().getYaw(), target.getLocation().getPitch());
 			target.getTeleport().now(location, false, TeleportCause.COMMAND);
 			target.sendMessage(_("teleporting"));
 		} else {
