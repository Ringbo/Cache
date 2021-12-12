diff --git a/oc_framework/src/com/owncloud/android/oc_framework/network/webdav/OwnCloudClientFactory.java b/oc_framework/src/com/owncloud/android/oc_framework/network/webdav/OwnCloudClientFactory.java
index 5c41edb..0c0c207 100644
--- a/oc_framework/src/com/owncloud/android/oc_framework/network/webdav/OwnCloudClientFactory.java
+++ b/oc_framework/src/com/owncloud/android/oc_framework/network/webdav/OwnCloudClientFactory.java
@@ -78,8 +78,8 @@
             
         } else {
             String username = account.name.substring(0, account.name.lastIndexOf('@'));
-            //String password = am.getPassword(account);
-            String password = am.blockingGetAuthToken(account, AccountTypeUtils.getAuthTokenTypePass(account.type), false);
+            String password = am.getPassword(account);
+            //String password = am.blockingGetAuthToken(account, AccountTypeUtils.getAuthTokenTypePass(account.type), false);
             client.setBasicCredentials(username, password);
         }
         
