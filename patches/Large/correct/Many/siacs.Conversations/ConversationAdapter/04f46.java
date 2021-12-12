diff --git a/src/main/java/eu/siacs/conversations/ui/adapter/ConversationAdapter.java b/src/main/java/eu/siacs/conversations/ui/adapter/ConversationAdapter.java
index 37cdf22..38c321d 100644
--- a/src/main/java/eu/siacs/conversations/ui/adapter/ConversationAdapter.java
+++ b/src/main/java/eu/siacs/conversations/ui/adapter/ConversationAdapter.java
@@ -72,7 +72,7 @@
 
 		if (message.getImageParams().width > 0
 				&& (message.getDownloadable() == null
-				|| message.getDownloadable().getStatus() == Downloadable.STATUS_DELETED)) {
+				|| message.getDownloadable().getStatus() != Downloadable.STATUS_DELETED)) {
 			mLastMessage.setVisibility(View.GONE);
 			imagePreview.setVisibility(View.VISIBLE);
 			activity.loadBitmap(message, imagePreview);
