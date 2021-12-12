diff --git a/WordPress/src/main/java/org/wordpress/android/ui/accounts/SignInFragment.java b/WordPress/src/main/java/org/wordpress/android/ui/accounts/SignInFragment.java
index 8e854b5..0956017 100644
--- a/WordPress/src/main/java/org/wordpress/android/ui/accounts/SignInFragment.java
+++ b/WordPress/src/main/java/org/wordpress/android/ui/accounts/SignInFragment.java
@@ -591,7 +591,7 @@
                         finishCurrentActivity(userBlogList);
                         String displayName = JSONUtils.getStringDecoded(jsonObject, "display_name");
                         Uri profilePicture = Uri.parse(JSONUtils.getString(jsonObject, "avatar_URL"));
-                        saveCrendentialsInSmartLock(mUsername, mPassword, displayName, profilePicture);
+                        saveCredentialsInSmartLock(mUsername, mPassword, displayName, profilePicture);
                     }
                 }, null);
             } else {
@@ -674,7 +674,7 @@
         return (getResources().getConfiguration().keyboard != Configuration.KEYBOARD_NOKEYS);
     }
 
-    private void saveCrendentialsInSmartLock() {
+    private void saveCredentialsInSmartLock(String username, String password, String displayName, Uri profilePicture) {
         if (!isSmartLockAvailable()) {
             return;
         }
@@ -733,7 +733,7 @@
 
     protected void configureAccountAfterSuccessfulSignIn() {
         mShouldSendTwoStepSMS = false;
-        saveCrendentialsInSmartLock();
+        saveCredentialsInSmartLock();
 
         // Finish this activity if we've authenticated to a Jetpack site
         if (isJetpackAuth() && getActivity() != null) {
