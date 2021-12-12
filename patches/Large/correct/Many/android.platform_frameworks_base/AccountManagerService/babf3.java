diff --git a/services/core/java/com/android/server/accounts/AccountManagerService.java b/services/core/java/com/android/server/accounts/AccountManagerService.java
index 888fa1a..d480f68 100644
--- a/services/core/java/com/android/server/accounts/AccountManagerService.java
+++ b/services/core/java/com/android/server/accounts/AccountManagerService.java
@@ -1787,7 +1787,7 @@
                         "User is not allowed to add an account!");
             } catch (RemoteException re) {
             }
-            showCantAddAccount(AccountManager.ERROR_CODE_USER_RESTRICTED);
+            showCantAddAccount(AccountManager.ERROR_CODE_USER_RESTRICTED, userId);
             return;
         }
         if (!canUserModifyAccountsForType(userId, accountType)) {
@@ -1796,7 +1796,8 @@
                         "User cannot modify accounts of this type (policy).");
             } catch (RemoteException re) {
             }
-            showCantAddAccount(AccountManager.ERROR_CODE_MANAGEMENT_DISABLED_FOR_ACCOUNT_TYPE);
+            showCantAddAccount(AccountManager.ERROR_CODE_MANAGEMENT_DISABLED_FOR_ACCOUNT_TYPE,
+                    userId);
             return;
         }
 
@@ -1861,7 +1862,7 @@
                         "User is not allowed to add an account!");
             } catch (RemoteException re) {
             }
-            showCantAddAccount(AccountManager.ERROR_CODE_USER_RESTRICTED);
+            showCantAddAccount(AccountManager.ERROR_CODE_USER_RESTRICTED, userId);
             return;
         }
         if (!canUserModifyAccountsForType(userId, accountType)) {
@@ -1870,7 +1871,8 @@
                         "User cannot modify accounts of this type (policy).");
             } catch (RemoteException re) {
             }
-            showCantAddAccount(AccountManager.ERROR_CODE_MANAGEMENT_DISABLED_FOR_ACCOUNT_TYPE);
+            showCantAddAccount(AccountManager.ERROR_CODE_MANAGEMENT_DISABLED_FOR_ACCOUNT_TYPE,
+                    userId);
             return;
         }
 
@@ -1906,13 +1908,13 @@
         }
     }
 
-    private void showCantAddAccount(int errorCode) {
+    private void showCantAddAccount(int errorCode, int userId) {
         Intent cantAddAccount = new Intent(mContext, CantAddAccountActivity.class);
         cantAddAccount.putExtra(CantAddAccountActivity.EXTRA_ERROR_CODE, errorCode);
         cantAddAccount.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
         long identityToken = clearCallingIdentity();
         try {
-            mContext.startActivity(cantAddAccount);
+            mContext.startActivityAsUser(cantAddAccount, new UserHandle(userId));
         } finally {
             restoreCallingIdentity(identityToken);
         }
