diff --git a/src/org/thoughtcrime/securesms/ConversationActivity.java b/src/org/thoughtcrime/securesms/ConversationActivity.java
index 9633364..50eed0d 100644
--- a/src/org/thoughtcrime/securesms/ConversationActivity.java
+++ b/src/org/thoughtcrime/securesms/ConversationActivity.java
@@ -1669,7 +1669,7 @@
 
     Permissions.with(this)
                .request(Manifest.permission.SEND_SMS)
-               .ifNecessary(isSecureText || forceSms)
+               .ifNecessary(!isSecureText || forceSms)
                .withPermanentDenialDialog(getString(R.string.ConversationActivity_signal_needs_sms_permission_in_order_to_send_an_sms))
                .onAllGranted(() -> {
                  attachmentManager.clear(glideRequests, false);
