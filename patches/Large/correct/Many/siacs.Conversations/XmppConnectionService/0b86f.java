diff --git a/src/eu/siacs/conversations/services/XmppConnectionService.java b/src/eu/siacs/conversations/services/XmppConnectionService.java
index 0012713..cc56a1e 100644
--- a/src/eu/siacs/conversations/services/XmppConnectionService.java
+++ b/src/eu/siacs/conversations/services/XmppConnectionService.java
@@ -847,7 +847,7 @@
 			String jid) {
 		for (Conversation conversation : haystack) {
 			if ((conversation.getAccount().equals(account))
-					&& (conversation.getContactJid().split("/")[0].equals(jid))) {
+					&& (conversation.getContactJid().split("/",2)[0].equals(jid))) {
 				return conversation;
 			}
 		}
