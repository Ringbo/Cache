diff --git a/src/main/java/com/owncloud/android/authentication/AuthenticatorActivity.java b/src/main/java/com/owncloud/android/authentication/AuthenticatorActivity.java
index 90c692b..1573b9a 100644
--- a/src/main/java/com/owncloud/android/authentication/AuthenticatorActivity.java
+++ b/src/main/java/com/owncloud/android/authentication/AuthenticatorActivity.java
@@ -1562,7 +1562,8 @@
                 mServerStatusText = getResources().getString(R.string.auth_unknown_error_http_title);
                 break;
             case UNKNOWN_ERROR:
-                if (result.getException() != null) {
+                if (result.getException() != null && result.getException().getMessage() != null
+                        && !"".equals(result.getException().getMessage())) {
                     mServerStatusText = getResources().getString(
                             R.string.auth_unknown_error_exception_title,
                             result.getException().getMessage()
