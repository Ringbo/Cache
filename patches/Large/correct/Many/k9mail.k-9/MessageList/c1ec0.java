diff --git a/src/com/android/email/activity/MessageList.java b/src/com/android/email/activity/MessageList.java
index fba4c83..12817d7 100644
--- a/src/com/android/email/activity/MessageList.java
+++ b/src/com/android/email/activity/MessageList.java
@@ -599,7 +599,8 @@
     private void onShowFolderList() {
         // If we're a child activity (say because Welcome dropped us straight to the message list
         // we won't have a parent activity and we'll need to get back to it
-        if (mStartup) {
+        if (mStartup
+            || isTaskRoot()) {
             FolderList.actionHandleAccount(this, mAccount, false);
         }
         finish();
