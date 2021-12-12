diff --git a/src/main/java/eu/siacs/conversations/utils/UIHelper.java b/src/main/java/eu/siacs/conversations/utils/UIHelper.java
index ffb9390..235ef84 100644
--- a/src/main/java/eu/siacs/conversations/utils/UIHelper.java
+++ b/src/main/java/eu/siacs/conversations/utils/UIHelper.java
@@ -142,7 +142,7 @@
 			}
 		} else if (message.getEncryption() == Message.ENCRYPTION_PGP) {
 			return new Pair<>(context.getString(R.string.encrypted_message_received),true);
-		} else if (message.getType() == Message.TYPE_FILE) {
+		} else if (message.getType() == Message.TYPE_FILE || message.getType() == Message.TYPE_IMAGE) {
 			if (message.getStatus() == Message.STATUS_RECEIVED) {
 				return new Pair<>(context.getString(R.string.received_x_file,
 							getFileDescriptionString(context, message)), true);
