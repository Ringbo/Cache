diff --git a/src/main/java/eu/siacs/conversations/parser/MessageParser.java b/src/main/java/eu/siacs/conversations/parser/MessageParser.java
index 94073f8..2d722af 100644
--- a/src/main/java/eu/siacs/conversations/parser/MessageParser.java
+++ b/src/main/java/eu/siacs/conversations/parser/MessageParser.java
@@ -181,7 +181,7 @@
 						from.toBareJid(),
 						packet.getId(),
 						Message.STATUS_SEND_FAILED);
-				if (message.getEncryption() == Message.ENCRYPTION_OTR) {
+				if (message != null && message.getEncryption() == Message.ENCRYPTION_OTR) {
 					message.getConversation().endOtrIfNeeded();
 				}
 			}
