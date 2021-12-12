diff --git a/src/main/java/com/owncloud/android/authentication/AuthenticatorActivity.java b/src/main/java/com/owncloud/android/authentication/AuthenticatorActivity.java
index 17f0e52..874c3ff 100644
--- a/src/main/java/com/owncloud/android/authentication/AuthenticatorActivity.java
+++ b/src/main/java/com/owncloud/android/authentication/AuthenticatorActivity.java
@@ -1546,9 +1546,9 @@
     }
 
 
-    private void updateFailedAuthStatusIconAndText(int failedStatusText){
+    private void updateStatusIconFailUserName(int statusText){
         mAuthStatusIcon = R.drawable.ic_alert;
-        mAuthStatusText = failedStatusText;
+        mAuthStatusText = statusText;
     }
 
     private void updateServerStatusIconNoRegularAuth() {
