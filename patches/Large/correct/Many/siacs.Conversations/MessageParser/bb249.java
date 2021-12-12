diff --git a/src/main/java/eu/siacs/conversations/parser/MessageParser.java b/src/main/java/eu/siacs/conversations/parser/MessageParser.java
index f49a7bb..ad2c97d 100644
--- a/src/main/java/eu/siacs/conversations/parser/MessageParser.java
+++ b/src/main/java/eu/siacs/conversations/parser/MessageParser.java
@@ -539,7 +539,7 @@
 				query.incrementActualMessageCount();
 			}
 
-			if (query == null || !query.isCatchup()) { //either no mam or catchup
+			if (query == null || query.isCatchup()) { //either no mam or catchup
 				if (status == Message.STATUS_SEND || status == Message.STATUS_SEND_RECEIVED) {
 					mXmppConnectionService.markRead(conversation);
 					if (query == null) {
@@ -581,7 +581,7 @@
 			} else if (notify) {
 				if (query == null) {
 					mXmppConnectionService.getNotificationService().push(message);
-				} else if (query.getWith() == null) { // mam catchup
+				} else if (query.isCatchup()) { // mam catchup
 					mXmppConnectionService.getNotificationService().pushFromBacklog(message);
 				}
 			}
