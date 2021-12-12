diff --git a/src/org/thoughtcrime/securesms/GroupCreateActivity.java b/src/org/thoughtcrime/securesms/GroupCreateActivity.java
index eee9181..d59d97b 100644
--- a/src/org/thoughtcrime/securesms/GroupCreateActivity.java
+++ b/src/org/thoughtcrime/securesms/GroupCreateActivity.java
@@ -387,8 +387,9 @@
               Recipient recipient = RecipientFactory.getRecipientsFromString(this, numberData.number, false)
                                                     .getPrimaryRecipient();
 
-              if (!selectedContacts.contains(recipient)
-                  && (existingContacts == null || !existingContacts.contains(recipient))) {
+              if (!selectedContacts.contains(recipient)                               &&
+                  (existingContacts == null || !existingContacts.contains(recipient)) &&
+                  recipient != null) {
                 addSelectedContact(recipient);
               }
             } catch (RecipientFormattingException e) {
