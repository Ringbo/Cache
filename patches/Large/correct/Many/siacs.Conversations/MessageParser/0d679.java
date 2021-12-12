diff --git a/src/main/java/eu/siacs/conversations/parser/MessageParser.java b/src/main/java/eu/siacs/conversations/parser/MessageParser.java
index b81a62d..c2fdf5b 100644
--- a/src/main/java/eu/siacs/conversations/parser/MessageParser.java
+++ b/src/main/java/eu/siacs/conversations/parser/MessageParser.java
@@ -206,7 +206,7 @@
 						from.toBareJid(),
 						packet.getId(),
 						Message.STATUS_SEND_FAILED);
-				if (message.getEncryption() == Message.ENCRYPTION_OTR) {
+				if (message != null && message.getEncryption() == Message.ENCRYPTION_OTR) {
 					message.getConversation().endOtrIfNeeded();
 				}
 			}
