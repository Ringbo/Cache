diff --git a/src/org/thoughtcrime/securesms/ConversationActivity.java b/src/org/thoughtcrime/securesms/ConversationActivity.java
index e871269..83c5056 100644
--- a/src/org/thoughtcrime/securesms/ConversationActivity.java
+++ b/src/org/thoughtcrime/securesms/ConversationActivity.java
@@ -1742,7 +1742,7 @@
   }
 
   private void updateToggleButtonState() {
-    if (composeText.getTextTrimmed().length() == 0 && !attachmentManager.isAttachmentPresent()) {
+    if (composeText.getText().length() == 0 && !attachmentManager.isAttachmentPresent()) {
       buttonToggle.display(attachButton);
       quickAttachmentToggle.show();
     } else {
