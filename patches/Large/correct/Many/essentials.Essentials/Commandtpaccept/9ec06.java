diff --git a/Essentials/src/com/earth2me/essentials/commands/Commandtpaccept.java b/Essentials/src/com/earth2me/essentials/commands/Commandtpaccept.java
index cef410a..bd59bd2 100644
--- a/Essentials/src/com/earth2me/essentials/commands/Commandtpaccept.java
+++ b/Essentials/src/com/earth2me/essentials/commands/Commandtpaccept.java
@@ -33,7 +33,7 @@
 			user.canAfford(this);
 			user.sendMessage("§7Teleport request accepted.");
 			p.sendMessage("§7Teleport request accepted.");
-			user.getTeleport().teleport(user, this.getName());
+			p.getTeleport().teleport(user, this.getName());
 		}
 		user.requestTeleport(null, false);
 	}
