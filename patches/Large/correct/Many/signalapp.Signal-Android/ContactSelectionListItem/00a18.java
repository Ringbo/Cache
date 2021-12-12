diff --git a/src/org/thoughtcrime/securesms/contacts/ContactSelectionListItem.java b/src/org/thoughtcrime/securesms/contacts/ContactSelectionListItem.java
index 6638d1e..c7b16a6 100644
--- a/src/org/thoughtcrime/securesms/contacts/ContactSelectionListItem.java
+++ b/src/org/thoughtcrime/securesms/contacts/ContactSelectionListItem.java
@@ -58,7 +58,9 @@
     } else if (!TextUtils.isEmpty(number)) {
       this.recipients = RecipientFactory.getRecipientsFromString(getContext(), number, true);
 
-      if (this.recipients.getPrimaryRecipient().getName() != null) {
+      if (this.recipients.getPrimaryRecipient() != null &&
+          this.recipients.getPrimaryRecipient().getName() != null)
+      {
         name = this.recipients.getPrimaryRecipient().getName();
       }
 
