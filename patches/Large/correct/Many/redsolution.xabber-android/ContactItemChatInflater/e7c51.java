diff --git a/xabber/src/main/java/com/xabber/android/ui/adapter/contactlist/ContactItemChatInflater.java b/xabber/src/main/java/com/xabber/android/ui/adapter/contactlist/ContactItemChatInflater.java
index bfbb035..9af5a6b 100644
--- a/xabber/src/main/java/com/xabber/android/ui/adapter/contactlist/ContactItemChatInflater.java
+++ b/xabber/src/main/java/com/xabber/android/ui/adapter/contactlist/ContactItemChatInflater.java
@@ -69,7 +69,7 @@
             viewHolder.tvOutgoingMessage.setTextColor(viewObject.getAccountColorIndicator());
         }
 
-        if (viewObject.getMessageOwner() != null) {
+        if (viewObject.getMessageOwner() != null && !viewObject.getMessageOwner().trim().isEmpty()) {
             viewHolder.tvOutgoingMessage.setText(viewObject.getMessageOwner() + ": ");
             viewHolder.tvOutgoingMessage.setVisibility(View.VISIBLE);
             viewHolder.tvOutgoingMessage.setTextColor(viewObject.getAccountColorIndicator());
