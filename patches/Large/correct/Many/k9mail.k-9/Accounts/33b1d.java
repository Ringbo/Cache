diff --git a/src/com/android/email/activity/Accounts.java b/src/com/android/email/activity/Accounts.java
index 3b25266..a55f667 100644
--- a/src/com/android/email/activity/Accounts.java
+++ b/src/com/android/email/activity/Accounts.java
@@ -274,7 +274,7 @@
         Intent intent = getIntent();
         boolean startup = (boolean)intent.getBooleanExtra(EXTRA_STARTUP, false);
         if (startup && accounts.length == 1) {
-            FolderList.actionHandleAccount(this, accounts[0], accounts[0].getAutoExpandFolderName(), true);
+            FolderList.actionHandleAccount(this, accounts[0], true);
             finish();
         }
         else {
