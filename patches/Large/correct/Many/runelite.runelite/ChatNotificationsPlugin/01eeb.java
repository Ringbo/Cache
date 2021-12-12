diff --git a/runelite-client/src/main/java/net/runelite/client/plugins/chatnotifications/ChatNotificationsPlugin.java b/runelite-client/src/main/java/net/runelite/client/plugins/chatnotifications/ChatNotificationsPlugin.java
index 9bd84d2..a73323e 100644
--- a/runelite-client/src/main/java/net/runelite/client/plugins/chatnotifications/ChatNotificationsPlugin.java
+++ b/runelite-client/src/main/java/net/runelite/client/plugins/chatnotifications/ChatNotificationsPlugin.java
@@ -144,7 +144,7 @@
 			usernameReplacer = "<col" + ChatColorType.HIGHLIGHT.name() + "><u>" + username + "</u><col" + ChatColorType.NORMAL.name() + ">";
 		}
 
-		if (usernameMatcher != null)
+		if (config.highlightOwnName() && usernameMatcher != null)
 		{
 			Matcher matcher = usernameMatcher.matcher(messageNode.getValue());
 			if (matcher.find())
@@ -152,7 +152,7 @@
 				messageNode.setValue(matcher.replaceAll(usernameReplacer));
 				update = true;
 
-				if (config.highlightOwnName())
+				if (config.notifyOnOwnName())
 				{
 					sendNotification(event);
 				}
