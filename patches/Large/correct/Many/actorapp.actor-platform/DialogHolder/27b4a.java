diff --git a/actor-sdk/sdk-core-android/android-sdk/src/main/java/im/actor/sdk/controllers/dialogs/view/DialogHolder.java b/actor-sdk/sdk-core-android/android-sdk/src/main/java/im/actor/sdk/controllers/dialogs/view/DialogHolder.java
index f5439da..ef4b3a2 100644
--- a/actor-sdk/sdk-core-android/android-sdk/src/main/java/im/actor/sdk/controllers/dialogs/view/DialogHolder.java
+++ b/actor-sdk/sdk-core-android/android-sdk/src/main/java/im/actor/sdk/controllers/dialogs/view/DialogHolder.java
@@ -301,7 +301,7 @@
             text.setTextColor(textColor);
         }
 
-        if (data.getSenderId() != myUid()) {
+        if (data.getSenderId() != myUid() || data.getUnreadCount() > 0) {
             state.setVisibility(View.GONE);
         } else {
             if (data.isRead()) {
