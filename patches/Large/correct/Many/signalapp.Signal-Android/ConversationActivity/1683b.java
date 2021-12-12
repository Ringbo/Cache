diff --git a/src/org/thoughtcrime/securesms/ConversationActivity.java b/src/org/thoughtcrime/securesms/ConversationActivity.java
index 85e1843..d0ae41c 100644
--- a/src/org/thoughtcrime/securesms/ConversationActivity.java
+++ b/src/org/thoughtcrime/securesms/ConversationActivity.java
@@ -974,7 +974,10 @@
   }
 
   private void initializeBetaCalling() {
-    if (!TextSecurePreferences.isWebrtcCallingEnabled(this) || isGroupConversation()) {
+    if (!TextSecurePreferences.isPushRegistered(this)       ||
+        !TextSecurePreferences.isWebrtcCallingEnabled(this) ||
+        isGroupConversation())
+    {
       return;
     }
 
