diff --git a/src/eu/siacs/conversations/utils/UIHelper.java b/src/eu/siacs/conversations/utils/UIHelper.java
index 81b356f..46a9115 100644
--- a/src/eu/siacs/conversations/utils/UIHelper.java
+++ b/src/eu/siacs/conversations/utils/UIHelper.java
@@ -334,7 +334,7 @@
 		boolean vibrate = preferences.getBoolean("vibrate_on_notification",
 				true);
 		boolean alwaysNotify = preferences.getBoolean(
-				"notify_in_conversation_when_highlighted", false) && notify;
+				"notify_in_conversation_when_highlighted", false);
 
 		if (!showNofifications) {
 			mNotificationManager.cancel(2342);
@@ -345,7 +345,7 @@
 
 		if ((currentCon != null)
 				&& (currentCon.getMode() == Conversation.MODE_MULTI)
-				&& (!alwaysNotify)) {
+				&& (!alwaysNotify) && notify) {
 			String nick = currentCon.getMucOptions().getActualNick();
 			Pattern highlight = generateNickHighlightPattern(nick);
 			Matcher m = highlight.matcher(currentCon.getLatestMessage()
