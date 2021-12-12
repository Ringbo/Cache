diff --git a/src/com/android/email/activity/FolderList.java b/src/com/android/email/activity/FolderList.java
index 611acfd..2fe043d 100644
--- a/src/com/android/email/activity/FolderList.java
+++ b/src/com/android/email/activity/FolderList.java
@@ -346,7 +346,7 @@
     }
 
     public static void actionHandleAccount(Context context, Account account, String initialFolder) {
-        actionHandleAccount(context, account, null, false);
+        actionHandleAccount(context, account, initialFolder, false);
     }
 
     public static void actionHandleAccount(Context context, Account account, boolean startup) {
@@ -533,7 +533,8 @@
     private void onAccounts() {
         // If we're a child activity (say because Welcome dropped us straight to the message list
         // we won't have a parent activity and we'll need to get back to it
-        if (mStartup) {
+        if (mStartup
+            || isTaskRoot()) {
             startActivity(new Intent(this, Accounts.class));
         }
         finish();
