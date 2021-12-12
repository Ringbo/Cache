diff --git a/src/com/owncloud/android/authentication/AuthenticatorActivity.java b/src/com/owncloud/android/authentication/AuthenticatorActivity.java
index dd3b4a0..ca2c1a8 100644
--- a/src/com/owncloud/android/authentication/AuthenticatorActivity.java
+++ b/src/com/owncloud/android/authentication/AuthenticatorActivity.java
@@ -1006,7 +1006,7 @@
      * @param view      Refresh 'button'
      */
     public void onRefreshClick(View view) {
-        onFocusChange(mRefreshButton, false);
+        onFocusChange(mHostUrlInput, false);
     }
     
     
