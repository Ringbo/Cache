diff --git a/src/main/java/eu/siacs/conversations/services/XmppConnectionService.java b/src/main/java/eu/siacs/conversations/services/XmppConnectionService.java
index 41a9749..ff5adfd 100644
--- a/src/main/java/eu/siacs/conversations/services/XmppConnectionService.java
+++ b/src/main/java/eu/siacs/conversations/services/XmppConnectionService.java
@@ -1186,7 +1186,8 @@
 	private void sendFileMessage(final Message message, final boolean delay) {
 		Log.d(Config.LOGTAG, "send file message");
 		final Account account = message.getConversation().getAccount();
-		if (account.httpUploadAvailable(fileBackend.getFile(message,false).getSize())) {
+		if (account.httpUploadAvailable(fileBackend.getFile(message,false).getSize())
+				|| message.getConversation().getMode() == Conversation.MODE_MULTI) {
 			mHttpConnectionManager.createNewUploadConnection(message, delay);
 		} else {
 			mJingleConnectionManager.createNewConnection(message);
