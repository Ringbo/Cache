diff --git a/src/org/thoughtcrime/securesms/ConversationActivity.java b/src/org/thoughtcrime/securesms/ConversationActivity.java
index 6809c1f..58a6883 100644
--- a/src/org/thoughtcrime/securesms/ConversationActivity.java
+++ b/src/org/thoughtcrime/securesms/ConversationActivity.java
@@ -775,7 +775,7 @@
   {
     final SettableFuture<Boolean> future = new SettableFuture<>();
 
-    handleSecurityChange(currentSecureText || isGroupConversation(),
+    handleSecurityChange(currentSecureText || isPushGroupConversation(),
                          currentSecureVoice && !isGroupConversation());
 
     new AsyncTask<Recipients, Void, Pair<Boolean, Boolean>>() {
