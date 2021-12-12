diff --git a/src/eu/siacs/conversations/entities/Conversation.java b/src/eu/siacs/conversations/entities/Conversation.java
index 005b83d..8395449 100644
--- a/src/eu/siacs/conversations/entities/Conversation.java
+++ b/src/eu/siacs/conversations/entities/Conversation.java
@@ -230,7 +230,7 @@
 			return this.otrSession;
 		} else {
 			SessionID sessionId = new SessionID(
-					this.getContactJid().split("/")[0], presence, "xmpp");
+					this.getContactJid().split("/",2)[0], presence, "xmpp");
 			this.otrSession = new SessionImpl(sessionId, getAccount()
 					.getOtrEngine(service));
 			try {
