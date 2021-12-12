diff --git a/src/eu/siacs/conversations/generator/MessageGenerator.java b/src/eu/siacs/conversations/generator/MessageGenerator.java
index 8c0d4e2..b6bb0bd 100644
--- a/src/eu/siacs/conversations/generator/MessageGenerator.java
+++ b/src/eu/siacs/conversations/generator/MessageGenerator.java
@@ -31,7 +31,7 @@
 			packet.setTo(message.getCounterpart());
 			packet.setType(MessagePacket.TYPE_CHAT);
 		} else {
-			packet.setTo(message.getCounterpart().split("/")[0]);
+			packet.setTo(message.getCounterpart().split("/",2)[0]);
 			packet.setType(MessagePacket.TYPE_GROUPCHAT);
 		}
 		packet.setFrom(account.getFullJid());
@@ -131,7 +131,7 @@
 			String subject) {
 		MessagePacket packet = new MessagePacket();
 		packet.setType(MessagePacket.TYPE_GROUPCHAT);
-		packet.setTo(conversation.getContactJid().split("/")[0]);
+		packet.setTo(conversation.getContactJid().split("/",2)[0]);
 		Element subjectChild = new Element("subject");
 		subjectChild.setContent(subject);
 		packet.addChild(subjectChild);
@@ -145,13 +145,13 @@
 		packet.setTo(contact);
 		packet.setFrom(conversation.getAccount().getFullJid());
 		Element x = packet.addChild("x", "jabber:x:conference");
-		x.setAttribute("jid", conversation.getContactJid().split("/")[0]);
+		x.setAttribute("jid", conversation.getContactJid().split("/",2)[0]);
 		return packet;
 	}
 
 	public MessagePacket invite(Conversation conversation, String contact) {
 		MessagePacket packet = new MessagePacket();
-		packet.setTo(conversation.getContactJid().split("/")[0]);
+		packet.setTo(conversation.getContactJid().split("/",2)[0]);
 		packet.setFrom(conversation.getAccount().getFullJid());
 		Element x = new Element("x");
 		x.setAttribute("xmlns", "http://jabber.org/protocol/muc#user");
