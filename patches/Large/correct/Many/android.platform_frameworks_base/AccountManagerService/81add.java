diff --git a/services/core/java/com/android/server/accounts/AccountManagerService.java b/services/core/java/com/android/server/accounts/AccountManagerService.java
index cb294fd..32fd56a 100644
--- a/services/core/java/com/android/server/accounts/AccountManagerService.java
+++ b/services/core/java/com/android/server/accounts/AccountManagerService.java
@@ -3799,7 +3799,8 @@
          * access accounts of the specified account.
          */
         boolean isPermitted =
-                isPermitted(callingUid, Manifest.permission.GET_ACCOUNTS);
+                isPermitted(callingUid, Manifest.permission.GET_ACCOUNTS,
+                        Manifest.permission.GET_ACCOUNTS_PRIVILEGED);
         boolean isAccountManagedByCaller = isAccountManagedByCaller(accountType, callingUid);
         Log.w(TAG, String.format(
                 "isReadAccountPermitted: isPermitted: %s, isAM: %s",
