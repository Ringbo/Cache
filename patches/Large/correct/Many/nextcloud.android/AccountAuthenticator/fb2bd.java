diff --git a/src/main/java/com/owncloud/android/authentication/AccountAuthenticator.java b/src/main/java/com/owncloud/android/authentication/AccountAuthenticator.java
index 3b90005..033522f 100644
--- a/src/main/java/com/owncloud/android/authentication/AccountAuthenticator.java
+++ b/src/main/java/com/owncloud/android/authentication/AccountAuthenticator.java
@@ -176,7 +176,7 @@
             }
 
             result.putString(AccountManager.KEY_ACCOUNT_NAME,  account.name);
-            result.putString(AccountManager.KEY_ACCOUNT_TYPE, MainApp.getAccountType());
+            result.putString(AccountManager.KEY_ACCOUNT_TYPE, MainApp.getAccountType(mContext));
             result.putString(AccountManager.KEY_AUTHTOKEN,     NEXTCLOUD_SSO);
             result.putString("username", userId);
 
