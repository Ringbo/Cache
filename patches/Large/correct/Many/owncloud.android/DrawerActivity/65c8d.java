diff --git a/src/com/owncloud/android/ui/activity/DrawerActivity.java b/src/com/owncloud/android/ui/activity/DrawerActivity.java
index baf7d36..aeda0df 100644
--- a/src/com/owncloud/android/ui/activity/DrawerActivity.java
+++ b/src/com/owncloud/android/ui/activity/DrawerActivity.java
@@ -270,7 +270,7 @@
      */
     public void updateAccountList() {
         Account[] accounts = AccountManager.get(this).getAccountsByType(MainApp.getAccountType());
-        if(accounts.length > 0) {
+        if(accounts.length > 0 && mNavigationView != null) {
             repopulateAccountList(accounts);
             setUsernameInDrawer(AccountUtils.getCurrentOwnCloudAccount(this));
         }
