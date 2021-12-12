diff --git a/src/org/thoughtcrime/securesms/ConversationActivity.java b/src/org/thoughtcrime/securesms/ConversationActivity.java
index 1de2fe1..8b07b0c 100644
--- a/src/org/thoughtcrime/securesms/ConversationActivity.java
+++ b/src/org/thoughtcrime/securesms/ConversationActivity.java
@@ -339,7 +339,7 @@
     List<String> recipientStrings = new LinkedList<String>();
 
     for (Recipient recipient : getRecipients().getRecipientsList()) {
-      recipientStrings.add(recipient.getName());
+      recipientStrings.add(recipient.toShortString());
     }
 
     AlertDialog.Builder builder = new AlertDialog.Builder(this);
