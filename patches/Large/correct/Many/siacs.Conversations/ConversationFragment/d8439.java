diff --git a/src/main/java/eu/siacs/conversations/ui/ConversationFragment.java b/src/main/java/eu/siacs/conversations/ui/ConversationFragment.java
index 912183f..183af8e 100644
--- a/src/main/java/eu/siacs/conversations/ui/ConversationFragment.java
+++ b/src/main/java/eu/siacs/conversations/ui/ConversationFragment.java
@@ -793,14 +793,14 @@
 				selectPresenceToAttachFile(choice);
 				break;
 			case ATTACHMENT_CHOICE_CHOOSE_IMAGE:
-				List<Uri> imageUris = AttachmentTool.extractUriFromIntent(data);
+				final List<Uri> imageUris = AttachmentTool.extractUriFromIntent(data);
 				for (Iterator<Uri> i = imageUris.iterator(); i.hasNext(); i.remove()) {
 					Log.d(Config.LOGTAG, "ConversationsActivity.onActivityResult() - attaching image to conversations. CHOOSE_IMAGE");
 					attachImageToConversation(conversation, i.next());
 				}
 				break;
 			case ATTACHMENT_CHOICE_TAKE_PHOTO:
-				Uri takePhotoUri = pendingTakePhotoUri.pop();
+				final Uri takePhotoUri = pendingTakePhotoUri.pop();
 				if (takePhotoUri != null) {
 					attachImageToConversation(conversation, takePhotoUri);
 				} else {
@@ -811,7 +811,7 @@
 			case ATTACHMENT_CHOICE_RECORD_VIDEO:
 			case ATTACHMENT_CHOICE_RECORD_VOICE:
 				final List<Uri> fileUris = AttachmentTool.extractUriFromIntent(data);
-				String type = data.getType();
+				final String type = data == null ? null : data.getType();
 				final PresenceSelector.OnPresenceSelected callback = () -> {
 					for (Iterator<Uri> i = fileUris.iterator(); i.hasNext(); i.remove()) {
 						Log.d(Config.LOGTAG, "ConversationsActivity.onActivityResult() - attaching file to conversations. CHOOSE_FILE/RECORD_VOICE/RECORD_VIDEO");
