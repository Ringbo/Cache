diff --git a/libs/login/WordPressLoginFlow/src/main/java/org/wordpress/android/login/LoginUsernamePasswordFragment.java b/libs/login/WordPressLoginFlow/src/main/java/org/wordpress/android/login/LoginUsernamePasswordFragment.java
index ffacc41..c76e177 100644
--- a/libs/login/WordPressLoginFlow/src/main/java/org/wordpress/android/login/LoginUsernamePasswordFragment.java
+++ b/libs/login/WordPressLoginFlow/src/main/java/org/wordpress/android/login/LoginUsernamePasswordFragment.java
@@ -252,7 +252,7 @@
         outState.putBoolean(KEY_LOGIN_FINISHED, mLoginFinished);
         outState.putString(KEY_REQUESTED_USERNAME, mRequestedUsername);
         outState.putString(KEY_REQUESTED_PASSWORD, mRequestedPassword);
-        outState.putIntegerArrayList(KEY_REQUESTED_PASSWORD, mOldSitesIDs);
+        outState.putIntegerArrayList(KEY_OLD_SITES_IDS, mOldSitesIDs);
     }
 
     protected void next() {
