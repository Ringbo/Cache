diff --git a/src/main/java/eu/siacs/conversations/ui/ConversationActivity.java b/src/main/java/eu/siacs/conversations/ui/ConversationActivity.java
index 1b5e517..d9f56c5 100644
--- a/src/main/java/eu/siacs/conversations/ui/ConversationActivity.java
+++ b/src/main/java/eu/siacs/conversations/ui/ConversationActivity.java
@@ -1039,7 +1039,7 @@
 				mPendingFileUris.clear();
 				mPendingFileUris.addAll(extractUriFromIntent(data));
 				if (xmppConnectionServiceBound) {
-					for(Iterator<Uri> i = mPendingImageUris.iterator(); i.hasNext(); i.remove()) {
+					for(Iterator<Uri> i = mPendingFileUris.iterator(); i.hasNext(); i.remove()) {
 						attachFileToConversation(getSelectedConversation(), i.next());
 					}
 				}
