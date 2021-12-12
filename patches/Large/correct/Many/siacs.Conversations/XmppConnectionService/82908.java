diff --git a/src/main/java/eu/siacs/conversations/services/XmppConnectionService.java b/src/main/java/eu/siacs/conversations/services/XmppConnectionService.java
index fd620de..44840ba 100644
--- a/src/main/java/eu/siacs/conversations/services/XmppConnectionService.java
+++ b/src/main/java/eu/siacs/conversations/services/XmppConnectionService.java
@@ -1294,7 +1294,7 @@
 				public void onMessageFound(Message message) {
 					DownloadableFile file = fileBackend.getFile(message);
 					if (file.getAbsolutePath().equals(path)) {
-						if (file.exists()) {
+						if (!file.exists()) {
 							message.setTransferable(new TransferablePlaceholder(Transferable.STATUS_DELETED));
 							final int s = message.getStatus();
 							if (s == Message.STATUS_WAITING || s == Message.STATUS_OFFERED || s == Message.STATUS_UNSEND) {
