diff --git a/src/org/thoughtcrime/securesms/ConversationActivity.java b/src/org/thoughtcrime/securesms/ConversationActivity.java
index 795fd75..513ce4b 100644
--- a/src/org/thoughtcrime/securesms/ConversationActivity.java
+++ b/src/org/thoughtcrime/securesms/ConversationActivity.java
@@ -946,7 +946,7 @@
   }
 
   private void initializeBetaCalling() {
-    if (!TextSecurePreferences.isWebrtcCallingEnabled(this)) {
+    if (!TextSecurePreferences.isWebrtcCallingEnabled(this) || isGroupConversation()) {
       return;
     }
 
