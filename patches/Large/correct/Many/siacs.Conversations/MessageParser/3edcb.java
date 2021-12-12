diff --git a/src/main/java/eu/siacs/conversations/parser/MessageParser.java b/src/main/java/eu/siacs/conversations/parser/MessageParser.java
index fcf358e..e580231 100644
--- a/src/main/java/eu/siacs/conversations/parser/MessageParser.java
+++ b/src/main/java/eu/siacs/conversations/parser/MessageParser.java
@@ -444,7 +444,7 @@
 					return;
 				}
 				status = Message.STATUS_RECEIVED;
-				if (conversation.findMessageWithRemoteId(remoteMsgId,counterpart) != null) {
+				if (remoteMsgId != null && conversation.findMessageWithRemoteId(remoteMsgId,counterpart) != null) {
 					return;
 				}
 			}
