diff --git a/src/main/java/com/owncloud/android/authentication/AuthenticatorActivity.java b/src/main/java/com/owncloud/android/authentication/AuthenticatorActivity.java
index fd85410..9dfbd71 100644
--- a/src/main/java/com/owncloud/android/authentication/AuthenticatorActivity.java
+++ b/src/main/java/com/owncloud/android/authentication/AuthenticatorActivity.java
@@ -1553,7 +1553,7 @@
 
     private void updateFailedAuthStatusIconAndText(int failedStatusText){
         mAuthStatusIcon = R.drawable.ic_alert;
-        mAuthStatusText = failedStatusText;
+        mAuthStatusText = statusText;
     }
 
     private void updateServerStatusIconNoRegularAuth() {
