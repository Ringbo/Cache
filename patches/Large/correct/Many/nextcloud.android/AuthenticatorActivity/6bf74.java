diff --git a/src/main/java/com/owncloud/android/authentication/AuthenticatorActivity.java b/src/main/java/com/owncloud/android/authentication/AuthenticatorActivity.java
index 0d1fb4a..cdbb480 100644
--- a/src/main/java/com/owncloud/android/authentication/AuthenticatorActivity.java
+++ b/src/main/java/com/owncloud/android/authentication/AuthenticatorActivity.java
@@ -520,7 +520,7 @@
 
         if (!webViewLoginMethod) {
             /// step 2 - set properties of UI elements (text, visibility, enabled...)
-            mHostUrlInput = (EditText) findViewById(R.id.hostUrlInput);
+            mHostUrlInput = (CustomEditText) findViewById(R.id.hostUrlInput);
             // Convert IDN to Unicode
             mHostUrlInput.setText(DisplayUtils.convertIdn(mServerInfo.mBaseUrl, false));
             if (mAction != ACTION_CREATE) {
