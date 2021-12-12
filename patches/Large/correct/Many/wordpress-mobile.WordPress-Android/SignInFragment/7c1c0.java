diff --git a/WordPress/src/main/java/org/wordpress/android/ui/accounts/SignInFragment.java b/WordPress/src/main/java/org/wordpress/android/ui/accounts/SignInFragment.java
index bda165c..f7d6d9a 100644
--- a/WordPress/src/main/java/org/wordpress/android/ui/accounts/SignInFragment.java
+++ b/WordPress/src/main/java/org/wordpress/android/ui/accounts/SignInFragment.java
@@ -705,7 +705,7 @@
     }
 
     private void deleteCredentialsInSmartLock() {
-        if (isSmartLockAvailable()) {
+        if (!isSmartLockAvailable()) {
             return;
         }
         Credential credential = new Credential.Builder(mUsername).setPassword(mPassword).build();
