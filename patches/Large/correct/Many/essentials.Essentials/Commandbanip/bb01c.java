diff --git a/Essentials/src/com/earth2me/essentials/commands/Commandbanip.java b/Essentials/src/com/earth2me/essentials/commands/Commandbanip.java
index 5bebfa5..757f9cf 100644
--- a/Essentials/src/com/earth2me/essentials/commands/Commandbanip.java
+++ b/Essentials/src/com/earth2me/essentials/commands/Commandbanip.java
@@ -49,7 +49,7 @@
 			final User onlineUser = ess.getUser(onlinePlayer);
 			if (onlinePlayer == sender || onlineUser.isAuthorized("essentials.ban.notify"))
 			{
-				sender.sendMessage(_("playerBanIpAddress", senderName, ipAddress));
+				onlinePlayer.sendMessage(_("playerBanIpAddress", senderName, ipAddress));
 			}
 		}
 	}
