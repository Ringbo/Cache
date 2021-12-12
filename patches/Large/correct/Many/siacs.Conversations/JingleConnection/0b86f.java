diff --git a/src/eu/siacs/conversations/xmpp/jingle/JingleConnection.java b/src/eu/siacs/conversations/xmpp/jingle/JingleConnection.java
index f42482e..4eac99e 100644
--- a/src/eu/siacs/conversations/xmpp/jingle/JingleConnection.java
+++ b/src/eu/siacs/conversations/xmpp/jingle/JingleConnection.java
@@ -256,12 +256,12 @@
 		this.status = STATUS_INITIATED;
 		Conversation conversation = this.mXmppConnectionService
 				.findOrCreateConversation(account,
-						packet.getFrom().split("/")[0], false);
+						packet.getFrom().split("/",2)[0], false);
 		this.message = new Message(conversation, "", Message.ENCRYPTION_NONE);
 		this.message.setType(Message.TYPE_IMAGE);
 		this.message.setStatus(Message.STATUS_RECEIVED_OFFER);
 		this.message.setDownloadable(this);
-		String[] fromParts = packet.getFrom().split("/");
+		String[] fromParts = packet.getFrom().split("/",2);
 		this.message.setPresence(fromParts[1]);
 		this.account = account;
 		this.initiator = packet.getFrom();
