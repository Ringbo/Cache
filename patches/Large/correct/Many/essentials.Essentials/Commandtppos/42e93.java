diff --git a/Essentials/src/com/earth2me/essentials/commands/Commandtppos.java b/Essentials/src/com/earth2me/essentials/commands/Commandtppos.java
index c03a8b4..6f77892 100644
--- a/Essentials/src/com/earth2me/essentials/commands/Commandtppos.java
+++ b/Essentials/src/com/earth2me/essentials/commands/Commandtppos.java
@@ -27,7 +27,7 @@
 		final double x = args[0].startsWith("~") ? user.getLocation().getX() + Integer.parseInt(args[0].substring(1)) : Integer.parseInt(args[0]);
 		final double y = args[1].startsWith("~") ? user.getLocation().getY() + Integer.parseInt(args[1].substring(1)) : Integer.parseInt(args[1]);
 		final double z = args[2].startsWith("~") ? user.getLocation().getZ() + Integer.parseInt(args[2].substring(1)) : Integer.parseInt(args[2]);
-		final Location location = new Location(user.getWorld(), x, y, z);
+		final Location location = new Location(user.getWorld(), x, y, z, user.getLocation().getYaw(), user.getLocation().getPitch());
 		if (args.length > 3)
 		{
 			location.setYaw((Float.parseFloat(args[3]) + 180 + 360) % 360);
@@ -59,7 +59,7 @@
 		final double x = args[1].startsWith("~") ? user.getLocation().getX() + Integer.parseInt(args[1].substring(1)) : Integer.parseInt(args[1]);
 		final double y = args[2].startsWith("~") ? user.getLocation().getY() + Integer.parseInt(args[2].substring(1)) : Integer.parseInt(args[2]);
 		final double z = args[3].startsWith("~") ? user.getLocation().getZ() + Integer.parseInt(args[3].substring(1)) : Integer.parseInt(args[3]);
-		final Location location = new Location(user.getWorld(), x, y, z);
+		final Location location = new Location(user.getWorld(), x, y, z, user.getLocation().getYaw(), user.getLocation().getPitch());
 		if (args.length > 4)
 		{
 			location.setYaw((Float.parseFloat(args[4]) + 180 + 360) % 360);
