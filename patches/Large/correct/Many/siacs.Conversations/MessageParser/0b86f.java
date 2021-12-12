diff --git a/src/eu/siacs/conversations/parser/MessageParser.java b/src/eu/siacs/conversations/parser/MessageParser.java
index b9fe3c1..96f4554 100644
--- a/src/eu/siacs/conversations/parser/MessageParser.java
+++ b/src/eu/siacs/conversations/parser/MessageParser.java
@@ -25,7 +25,7 @@
 	}
 
 	private Message parseChat(MessagePacket packet, Account account) {
-		String[] fromParts = packet.getFrom().split("/");
+		String[] fromParts = packet.getFrom().split("/",2);
 		Conversation conversation = mXmppConnectionService
 				.findOrCreateConversation(account, fromParts[0], false);
 		conversation.setLatestMarkableMessageId(getMarkableMessageId(packet));
@@ -57,9 +57,9 @@
 	}
 
 	private Message parseOtrChat(MessagePacket packet, Account account) {
-		boolean properlyAddressed = (packet.getTo().split("/").length == 2)
+		boolean properlyAddressed = (packet.getTo().split("/",2).length == 2)
 				|| (account.countPresences() == 1);
-		String[] fromParts = packet.getFrom().split("/");
+		String[] fromParts = packet.getFrom().split("/",2);
 		Conversation conversation = mXmppConnectionService
 				.findOrCreateConversation(account, fromParts[0], false);
 		String presence;
@@ -132,7 +132,7 @@
 
 	private Message parseGroupchat(MessagePacket packet, Account account) {
 		int status;
-		String[] fromParts = packet.getFrom().split("/");
+		String[] fromParts = packet.getFrom().split("/",2);
 		if (mXmppConnectionService.find(account.pendingConferenceLeaves,
 				account, fromParts[0]) != null) {
 			return null;
@@ -221,7 +221,7 @@
 				return null;
 			}
 		}
-		String[] parts = fullJid.split("/");
+		String[] parts = fullJid.split("/",2);
 		Conversation conversation = mXmppConnectionService
 				.findOrCreateConversation(account, parts[0], false);
 		conversation.setLatestMarkableMessageId(getMarkableMessageId(packet));
@@ -253,7 +253,7 @@
 	}
 
 	private void parseError(MessagePacket packet, Account account) {
-		String[] fromParts = packet.getFrom().split("/");
+		String[] fromParts = packet.getFrom().split("/",2);
 		mXmppConnectionService.markMessage(account, fromParts[0],
 				packet.getId(), Message.STATUS_SEND_FAILED);
 	}
@@ -267,14 +267,14 @@
 			String id = packet
 					.findChild("displayed", "urn:xmpp:chat-markers:0")
 					.getAttribute("id");
-			String[] fromParts = packet.getAttribute("from").split("/");
+			String[] fromParts = packet.getAttribute("from").split("/",2);
 			updateLastseen(packet, account, true);
 			mXmppConnectionService.markMessage(account, fromParts[0], id,
 					Message.STATUS_SEND_DISPLAYED);
 		} else if (packet.hasChild("received", "urn:xmpp:chat-markers:0")) {
 			String id = packet.findChild("received", "urn:xmpp:chat-markers:0")
 					.getAttribute("id");
-			String[] fromParts = packet.getAttribute("from").split("/");
+			String[] fromParts = packet.getAttribute("from").split("/",2);
 			updateLastseen(packet, account, false);
 			mXmppConnectionService.markMessage(account, fromParts[0], id,
 					Message.STATUS_SEND_RECEIVED);
